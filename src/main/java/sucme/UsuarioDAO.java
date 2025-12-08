package sucme;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class UsuarioDAO {

    //C - Create
    public static void cadastrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO sucme.usuarios "
                + "(nome, data_nascimento, email, senha, cpf, flag_administrador, uf, afiliacao_politica)"
                + "VALUES(?,?,?,?,?,?,?,?);";
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = ConexaoDB.getConnection();
            stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, usuario.getNome());
            stmt.setDate(2, Date.valueOf(usuario.getDataNascimento()));
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getSenha());
            stmt.setString(5, usuario.getCpf());
            stmt.setBoolean(6, false);
            stmt.setString(7, usuario.getUf());
            stmt.setString(8, usuario.getAfiliacaoPolitica());
            stmt.executeUpdate();
            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    usuario.setId(rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar usuario:" + e.getMessage());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                ConexaoDB.closeConnection(conn);
            }
        }
    }

    //R - Read
    public static List<Usuario> listarUsuarios() {
        String sql = "SELECT id, nome, data_nascimento, email, senha, cpf, flag_administrador, uf, afiliacao_politica FROM sucme.usuarios";
        List<Usuario> usuarios = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = ConexaoDB.getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario u = new Usuario(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getDate("data_nascimento").toLocalDate(),
                        rs.getString("email"),
                        rs.getString("senha"),
                        rs.getString("cpf"),
                        rs.getBoolean("flag_administrador"),
                        rs.getString("uf"),
                        rs.getString("afiliacao_politica"));
                usuarios.add(u);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar pessoa:" + e.getMessage());

        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                ConexaoDB.closeConnection(conn);
            }

            return usuarios;
        }
    }

    //R - Read Password
    public static ArrayList<Boolean> validarLogin(String email, String senha) {
        ArrayList<Boolean> ResultadoLogin = new ArrayList<Boolean>();
        String sql = "SELECT email, senha, flag_administrador FROM sucme.usuarios WHERE email = ? AND senha = ?";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = ConexaoDB.getConnection();
            stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            ResultadoLogin.add(rs.next());
            ResultadoLogin.add(rs.getBoolean(3));
            return ResultadoLogin;
        } catch (SQLException e) {
            e.printStackTrace();
            ResultadoLogin.add(false);
            return ResultadoLogin;
        }
    }

    //U - UPDATE
    public static void atualizarUsuario (Usuario usuario) {
        String sql = "UPDATE sucme.usuarios "+
                "SET nome = ?, data_nascimento = ?, email = ?, senha = ?, cpf = ?, uf = ?, afiliacao_politica = ? "+
                "WHERE id = ?";
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = ConexaoDB.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setDate(2, Date.valueOf(usuario.getDataNascimento()));
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getSenha());
            stmt.setString(5, usuario.getCpf());
            stmt.setString(6, usuario.getUf());
            stmt.setString(7, usuario.getAfiliacaoPolitica());
            stmt.setInt(8, usuario.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar pessoa:" + e.getMessage());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                ConexaoDB.closeConnection(conn);
            }
        }
    }

    //D - DELETE
    public static void deletarUsuario(Usuario usuario) {
        String sql = "DELETE FROM sucme.usuarios "
                + "WHERE id = ?";
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = ConexaoDB.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, usuario.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar pessoa:" + e.getMessage());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                ConexaoDB.closeConnection(conn);
            }
        }
    }

    //CONT - CONTAGEM DE MILITANTES
    public static Map<String, Integer> contarMilitantesPorAfiliacao() {

        String sql = "SELECT afiliacao_politica, COUNT(id) AS total FROM sucme.usuarios GROUP BY afiliacao_politica";
        Map<String, Integer> contagem = new HashMap<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConexaoDB.getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                String afiliacao = rs.getString("afiliacao_politica");
                int total = rs.getInt("total");

                if (afiliacao != null && !afiliacao.isEmpty()) {
                    contagem.put(afiliacao, total);
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao contar militantes por afiliação: " + e.getMessage());
            throw new RuntimeException("Erro ao gerar estatísticas:" + e.getMessage(), e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                System.err.println("Erro ao fechar Statement/ResultSet: " + e.getMessage());
            }
            ConexaoDB.closeConnection(conn);
        }

        return contagem;
    }

    //B - BEM-VINDO
    public static String side(String email, String senha) {
        String sql = "SELECT afiliacao_politica FROM sucme.usuarios WHERE email = ? AND senha = ?";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String userSide = null;
        try {
            conn = ConexaoDB.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if (rs.next()) {
                userSide = rs.getString("afiliacao_politica");
                System.out.println(userSide);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar pessoa:" + e.getMessage());

        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                ConexaoDB.closeConnection(conn);
            }
        }
        return userSide;
    }
    
     public static String bemVindo(String email, String senha) {
        String sql = "SELECT nome FROM sucme.usuarios WHERE email = ? AND senha = ?";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String nome = null;
        try {
            conn = ConexaoDB.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if (rs.next()) {
                nome = rs.getString("nome");
                System.out.println(nome);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar pessoa:" + e.getMessage());

        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                ConexaoDB.closeConnection(conn);
            }
        }
        return nome;
    }

}
