package sucme;

import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;
import java.util.List;      
import static sucme.SucmeTelaCadastro.trataMesCadastro;

public class SucmeTelaLogadoAdmin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SucmeTelaLogadoAdmin.class.getName());
    private String email;
    private String senha;

    public SucmeTelaLogadoAdmin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public SucmeTelaLogadoAdmin(String email, String senha) {
        this.email = email;
        this.senha = senha;
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_bem_vindo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbl_nome = new javax.swing.JLabel();
        lbl_data_de_nascimento = new javax.swing.JLabel();
        lbl_cpf = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_uf = new javax.swing.JLabel();
        lbl_afiliacao_politica = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        campo_id = new javax.swing.JTextField();
        lbl_senha = new javax.swing.JLabel();
        btn_gerar_relatorio = new javax.swing.JButton();
        campo_nome = new javax.swing.JTextField();
        campo_cpf = new javax.swing.JTextField();
        campo_email = new javax.swing.JTextField();
        campo_uf = new javax.swing.JComboBox<>();
        campo_afiliacao_politica = new javax.swing.JComboBox<>();
        btn_sair = new javax.swing.JButton();
        btn_deletarUsuario = new javax.swing.JButton();
        campo_dia = new javax.swing.JComboBox<>();
        campo_mes = new javax.swing.JComboBox<>();
        campo_ano = new javax.swing.JComboBox<>();
        btn_atualizar_usuario = new javax.swing.JButton();
        campo_senha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SUCME");
        setPreferredSize(new java.awt.Dimension(1280, 720));

        lbl_bem_vindo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_bem_vindo.setText("Bem-vindo Administrador!");

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Data Nasc.", "CPF", "Email", "UF", "Afiliacao Politica", "Administrador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setName("Relatorio de Usuarios"); // NOI18N
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        lbl_nome.setText("Nome");

        lbl_data_de_nascimento.setText("Data Nascimento");

        lbl_cpf.setText("CPF");

        lbl_email.setText("Email");

        lbl_uf.setText("UF");

        lbl_afiliacao_politica.setText("Afiliacao Politica");

        lbl_id.setText("ID");

        campo_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_idActionPerformed(evt);
            }
        });

        lbl_senha.setText("Senha");

        btn_gerar_relatorio.setText("Gerar Relatorio");
        btn_gerar_relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerar_relatorioActionPerformed(evt);
            }
        });

        campo_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nomeActionPerformed(evt);
            }
        });

        campo_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_cpfActionPerformed(evt);
            }
        });

        campo_uf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha seu Estado", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        campo_afiliacao_politica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha seu lado", "Esquerda", "Direita" }));

        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        btn_deletarUsuario.setText("Deletar Usuario");
        btn_deletarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletarUsuarioActionPerformed(evt);
            }
        });

        campo_dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        campo_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_diaActionPerformed(evt);
            }
        });

        campo_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mês", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        campo_ano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ano", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926" }));

        btn_atualizar_usuario.setText("Atualizar Usuario");
        btn_atualizar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizar_usuarioActionPerformed(evt);
            }
        });

        campo_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_senhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_bem_vindo)
                .addGap(393, 393, 393))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_email)
                            .addComponent(lbl_nome)
                            .addComponent(campo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_senha)
                                    .addComponent(campo_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_afiliacao_politica)
                                    .addComponent(campo_afiliacao_politica, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(lbl_data_de_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(campo_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_id)
                            .addComponent(campo_id, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_cpf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_uf)
                                    .addComponent(campo_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_atualizar_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_gerar_relatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_deletarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sair)
                .addGap(291, 291, 291))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_bem_vindo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lbl_id))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(campo_id))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_uf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_cpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbl_data_de_nascimento)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campo_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campo_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campo_ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbl_afiliacao_politica)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campo_afiliacao_politica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbl_senha)
                            .addGap(7, 7, 7)
                            .addComponent(campo_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_atualizar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gerar_relatorio)
                    .addComponent(btn_deletarUsuario)
                    .addComponent(btn_sair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void preencherTabela(List<Usuario> lista) {
    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
    modelo.setRowCount(0);
    for (Usuario u : lista) {
        String tipo = u.isFlagAdministrador() ? "Administrador" : "Militante";
        modelo.addRow(new Object[]{
            u.getId(),
            u.getNome(),
            u.getDataNascimento(),
            u.getCpf(),
            u.getEmail(),
            u.getUf(),
            u.getAfiliacaoPolitica(),
            tipo
                
        }
        );
    }
}
        
    private void btn_gerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerarRelatorioActionPerformed
        try {
        List<Usuario> lista = Relatorio.gerarRelatorioUsuarios();
        preencherTabela(lista);

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Erro ao carregar o relatório:\n" + e.getMessage(), 
            "Erro de Relatório", 
            javax.swing.JOptionPane.ERROR_MESSAGE);
    }        
        
    }//GEN-LAST:event_btn_gerarRelatorioActionPerformed

    private void campo_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_senhaActionPerformed

    private void btn_atualizar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizar_usuarioActionPerformed
        char[] senhaChars = campo_senha.getPassword();
        String senha = new String(senhaChars);
        Usuario u = new Usuario(
            Integer.parseInt(campo_id.getText()),
            campo_nome.getText(),
            LocalDate.parse(campo_ano.getSelectedItem().toString()+"-"+trataMesCadastro(campo_mes.getSelectedItem().toString())+"-"+campo_dia.getSelectedItem().toString()),
            campo_email.getText(),
            senha,
            campo_cpf.getText(),
            campo_uf.getSelectedItem().toString(),
            campo_afiliacao_politica.getSelectedItem().toString()
        );
        UsuarioDAO.atualizarUsuario(u);
        try {
            List<Usuario> lista = Relatorio.gerarRelatorioUsuarios();
            preencherTabela(lista);

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Erro ao carregar o relatório:\n" + e.getMessage(),
                "Erro de Relatório",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_atualizar_usuarioActionPerformed

    private void campo_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_diaActionPerformed

    private void btn_deletarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletarUsuarioActionPerformed
        Usuario u = new Usuario(Integer.parseInt(campo_id.getText()));
        UsuarioDAO.deletarUsuario(u);
        campo_id.setText("");

        try {
            List<Usuario> lista = Relatorio.gerarRelatorioUsuarios();
            preencherTabela(lista);

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Erro ao carregar o relatório:\n" + e.getMessage(),
                "Erro de Relatório",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_deletarUsuarioActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void campo_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_cpfActionPerformed

    private void campo_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nomeActionPerformed

    private void btn_gerar_relatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerar_relatorioActionPerformed
        try {
            List<Usuario> lista = Relatorio.gerarRelatorioUsuarios();
            preencherTabela(lista);

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Erro ao carregar o relatório:\n" + e.getMessage(),
                "Erro de Relatório",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_gerar_relatorioActionPerformed

    private void campo_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_idActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atualizar_usuario;
    private javax.swing.JButton btn_deletarUsuario;
    private javax.swing.JButton btn_gerar_relatorio;
    private javax.swing.JButton btn_sair;
    private javax.swing.JComboBox<String> campo_afiliacao_politica;
    private javax.swing.JComboBox<String> campo_ano;
    private javax.swing.JTextField campo_cpf;
    private javax.swing.JComboBox<String> campo_dia;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_id;
    private javax.swing.JComboBox<String> campo_mes;
    private javax.swing.JTextField campo_nome;
    private javax.swing.JPasswordField campo_senha;
    private javax.swing.JComboBox<String> campo_uf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_afiliacao_politica;
    private javax.swing.JLabel lbl_bem_vindo;
    private javax.swing.JLabel lbl_cpf;
    private javax.swing.JLabel lbl_data_de_nascimento;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JLabel lbl_uf;
    // End of variables declaration//GEN-END:variables
}
