package sucme;

public class SucmeTelaLado extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SucmeTelaLado.class.getName());

    private FundoPanel fundo;

    public SucmeTelaLado() {
        fundo = new FundoPanel("/imagens/fundo_inicial.png");
        setContentPane(fundo);
        
        initComponents();
        setLocationRelativeTo(null);
        btn_escolha_lado.addItemListener(e -> {
    if (e.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            btn_escolha_lado.hidePopup();
        });
    }
});

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_voltar = new javax.swing.JButton();
        btn_continuar = new javax.swing.JButton();
        btn_escolha_lado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));

        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        btn_continuar.setText("Continuar");
        btn_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_continuarActionPerformed(evt);
            }
        });

        btn_escolha_lado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha seu lado", "Esquerda", "Direita" }));
        btn_escolha_lado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_escolha_ladoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_escolha_lado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_continuar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_escolha_lado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_continuar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btn_voltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_continuarActionPerformed(java.awt.event.ActionEvent evt) {
    String escolha = btn_escolha_lado.getSelectedItem().toString();
    String imagem;

    switch (escolha) {
        case "Esquerda":
            imagem = "/imagens/fundo_esquerda.jpg";
            break;
        case "Direita":
            imagem = "/imagens/fundo_direita.jpg";
            break;
        default:
            imagem = "/imagens/fundo_inicial.png";
    }

    SucmeTelaCadastro janela = new SucmeTelaCadastro(escolha, imagem);
    janela.setVisible(true);
    this.dispose();
    }                                             

    private void btn_escolha_ladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_escolha_ladoActionPerformed


        String escolha = btn_escolha_lado.getSelectedItem().toString();
        switch (escolha) {
            case "Esquerda":
                fundo.setImage("/imagens/fundo_esquerda.jpg");            
                break;
            case "Direita":
                fundo.setImage("/imagens/fundo_direita.jpg");   
                break;

            default:
                fundo.setImage("/imagens/fundo_inicial.png");
        }
        
    }//GEN-LAST:event_btn_escolha_ladoActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        SucmeTelaInicial janela = new SucmeTelaInicial(); //trocar pra tela de escolha seu lado
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_continuar;
    private javax.swing.JComboBox<String> btn_escolha_lado;
    private javax.swing.JButton btn_voltar;
    // End of variables declaration//GEN-END:variables
}
