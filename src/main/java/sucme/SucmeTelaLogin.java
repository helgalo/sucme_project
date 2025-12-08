package sucme;

import java.util.ArrayList;

public class SucmeTelaLogin extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SucmeTelaLogin.class.getName());

    private FundoPanel fundo;

    public SucmeTelaLogin() {
        fundo = new FundoPanel("/imagens/fundo_inicial.png");
        setContentPane(fundo);
        
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        campo_email = new javax.swing.JTextField();
        lbl_senha = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        btn_logar = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        campo_senha = new javax.swing.JPasswordField();

        jTextField1.setText("jTextField1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));

        campo_email.setToolTipText("Digite seu email");
        campo_email.setName(""); // NOI18N
        campo_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_emailActionPerformed(evt);
            }
        });

        lbl_senha.setForeground(new java.awt.Color(255, 255, 255));
        lbl_senha.setText("Senha:");

        lbl_email.setForeground(new java.awt.Color(255, 255, 255));
        lbl_email.setText("Email:");

        btn_logar.setText("Logar");
        btn_logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logarActionPerformed(evt);
            }
        });

        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        campo_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_senhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_email, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(campo_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_logar)
                    .addComponent(btn_voltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_email)
                    .addComponent(btn_logar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_senha)
                    .addComponent(btn_voltar)
                    .addComponent(campo_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_emailActionPerformed
    }//GEN-LAST:event_campo_emailActionPerformed

    private void btn_logarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logarActionPerformed
        ArrayList<Boolean> result = UsuarioDAO.validarLogin(campo_email.getText(), campo_senha.getText());
        if (result.get(0) == true) {
            System.out.println("Logou!");
            if (result.get(1) == true) {
                SucmeTelaLogadoAdmin janela = new SucmeTelaLogadoAdmin(campo_email.getText(), campo_senha.getText());
                janela.setVisible(true);
                this.dispose();
            } else {
                SucmeTelaLogadoUsuario janela = new SucmeTelaLogadoUsuario(campo_email.getText(), campo_senha.getText());
                janela.setVisible(true);
                this.dispose();
            }

        } else {
            System.out.println("Login ou senha inválidos!");
            campo_senha.setText("");
        }
    }//GEN-LAST:event_btn_logarActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        SucmeTelaInicial janela = new SucmeTelaInicial();
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void campo_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_senhaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JTextField campo_email;
    private javax.swing.JPasswordField campo_senha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_senha;
    // End of variables declaration//GEN-END:variables
}
