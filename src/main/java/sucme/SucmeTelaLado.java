package sucme;

public class SucmeTelaLado extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(SucmeTelaLado.class.getName());

    private FundoPanel fundo;

    public SucmeTelaLado() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        fundo = new FundoPanel("/imagens/fundo_inicial.png");
        setContentPane(fundo);

        jLabel1 = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();
        btn_continuar = new javax.swing.JButton();
        btn_escolha_lado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(evt -> btn_voltarActionPerformed(evt));

        btn_continuar.setText("Continuar");
        btn_continuar.addActionListener(evt -> btn_continuarActionPerformed(evt));

        btn_escolha_lado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
                "Escolha seu lado", "Esquerda", "Direita"
        }));
        btn_escolha_lado.addActionListener(evt -> btn_escolha_ladoActionPerformed(evt));

        fundo.setLayout(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 678, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(54, 54, 54)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(278, 278, 278)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btn_escolha_lado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(24, 24, 24)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(btn_continuar)
                                                                .addComponent(btn_voltar))))
                                        .addContainerGap(279, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 354, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap()))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(126, 126, 126)
                                        .addComponent(btn_escolha_lado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(btn_continuar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_voltar)
                                        .addContainerGap(127, Short.MAX_VALUE)))
        );

        pack();
    }

    private void btn_continuarActionPerformed(java.awt.event.ActionEvent evt) {
        SucmeTelaCadastro janela =
                new SucmeTelaCadastro(btn_escolha_lado.getSelectedItem().toString());
        janela.setVisible(true);
        this.dispose();
    }

    private void btn_escolha_ladoActionPerformed(java.awt.event.ActionEvent evt) {

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
    }

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {
        SucmeTelaInicial janela = new SucmeTelaInicial();
        janela.setVisible(true);
        this.dispose();
    }

    private javax.swing.JButton btn_continuar;
    private javax.swing.JComboBox<String> btn_escolha_lado;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
}
