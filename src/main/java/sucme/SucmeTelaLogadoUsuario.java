package sucme;

import java.util.Map;
import javax.swing.JOptionPane;

public class SucmeTelaLogadoUsuario extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SucmeTelaLogadoUsuario.class.getName());
    private String email;
    private String senha;
    private FundoPanel fundo;

    public SucmeTelaLogadoUsuario(String email, String senha) {
        this.email = email;
        this.senha = senha;

        fundo = new FundoPanel("/imagens/fundo_inicial.png");
        setContentPane(fundo);

        initComponents();
        setLocationRelativeTo(null);
        lblBemVindo.setText("Bem-vindo Militante: " + UsuarioDAO.bemVindo(this.email, this.senha) + "!");
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
        setPreferredSize(new java.awt.Dimension(1280, 720));

        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(350, 350));

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBemVindo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jblTextEsquerda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jblTotalEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jblTextDireita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jblTotalDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                    .addComponent(jblTotalEsquerda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jblTotalDireita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_sair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnContagem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnContagem)
                .addGap(18, 18, 18)
                .addComponent(btn_sair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

            String nomeUser = UsuarioDAO.bemVindo(this.email, this.senha);

            if (totalEsquerda > totalDireita) {
                fundo.setImage("/imagens/vitoria_esquerda.jpg");
                lblBemVindo.setText("Estamos vencendo, companheiro " + nomeUser + "!");
            } else if (totalDireita > totalEsquerda) {
                fundo.setImage("/imagens/vitoria_direita.jpg");
                lblBemVindo.setText("Estamos na frente da petralhada, táok?, " + nomeUser + "!");
            } else {
                fundo.setImage("/imagens/fundo_inicial.png");
                lblBemVindo.setText("Bem-vindo Militante: " + nomeUser + "!");
            }

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
