package sucme;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Relatorio {
    int id;
    ArrayList<Usuario> conteudo;
    LocalDate dataGeracao;
    
    
    public static List<Usuario> gerarRelatorioUsuarios() {

        return UsuarioDAO.listarUsuarios();
    }
}
