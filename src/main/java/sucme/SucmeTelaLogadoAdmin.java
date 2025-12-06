package sucme;

import javax.swing.table.DefaultTableModel;
import java.util.List;      

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

        btn_sair = new javax.swing.JButton();
        btn_gerarRelatorio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SUCME");

        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        btn_gerarRelatorio.setText("Gerar Relatorio");
        btn_gerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerarRelatorioActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Bem-vindo Usuario!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jLabel1)
                .addContainerGap(356, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_gerarRelatorio)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_sair)
                        .addGap(22, 22, 22)))
                .addGap(390, 390, 390))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_gerarRelatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sair)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_gerarRelatorio;
    private javax.swing.JButton btn_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
