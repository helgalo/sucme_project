package sucme;

import java.util.Map;
import javax.swing.JOptionPane;

public class SucmeTelaLogadoUsuario extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SucmeTelaLogadoUsuario.class.getName());
    private String email;
    private String senha;
    
       
    public SucmeTelaLogadoUsuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
        
        initComponents();
        setLocationRelativeTo(null);
        lblBemVindo.setText("Bem-vindo Militante: " + UsuarioDAO.bemVindo(this.email, this.senha)+ "!");
    }
    
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_sair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jblTotalDireita = new javax.swing.JLabel();
        jblTotalEsquerda = new javax.swing.JLabel();
        jblTextEsquerda = new javax.swing.JLabel();
        jblTextDireita = new javax.swing.JLabel();
        lblBemVindo = new javax.swing.JLabel();
        btnContagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        jblTotalDireita.setText(".");

        jblTotalEsquerda.setText(".");

        jblTextEsquerda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblTextEsquerda.setText("Esquerda");

        jblTextDireita.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblTextDireita.setText("Direita");

        lblBemVindo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblBemVindo.setText("Bem-vindo Usuário!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblTextEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblTotalEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblTextDireita)
                    .addComponent(jblTotalDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addComponent(lblBemVindo)
                .addGap(167, 167, 167))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBemVindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblTextEsquerda)
                    .addComponent(jblTextDireita))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblTotalEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblTotalDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        btnContagem.setText("Contagem de Militantes");
        btnContagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(btnContagem))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addComponent(btn_sair)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnContagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_sair)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualizarContadores() {
    try {
        
        Map<String, Integer> contagem = UsuarioDAO.contarMilitantesPorAfiliacao();
                
        int totalDireita = contagem.getOrDefault("Direita", 0);
        int totalEsquerda = contagem.getOrDefault("Esquerda", 0);
                
        jblTotalDireita.setText("Total: " + totalDireita);
        jblTotalEsquerda.setText("Total: " + totalEsquerda);
        
    } catch (RuntimeException e) {
        System.err.println("Falha ao carregar contadores: " + e.getMessage());
        JOptionPane.showMessageDialog(this, 
            "Erro ao carregar estatísticas. Verifique a conexão e as tabelas do banco de dados.", 
            "Erro de Carregamento", 
            JOptionPane.ERROR_MESSAGE);
    }
}
    
    
    
    
    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        dispose();
    
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btnContagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContagemActionPerformed
     atualizarContadores();
    }//GEN-LAST:event_btnContagemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContagem;
    private javax.swing.JButton btn_sair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblTextDireita;
    private javax.swing.JLabel jblTextEsquerda;
    private javax.swing.JLabel jblTotalDireita;
    private javax.swing.JLabel jblTotalEsquerda;
    private javax.swing.JLabel lblBemVindo;
    // End of variables declaration//GEN-END:variables

}
