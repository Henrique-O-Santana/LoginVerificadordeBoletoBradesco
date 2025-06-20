/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package geradorboletobradesco;

import java.util.Optional;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TelaApp extends javax.swing.JFrame {

    /**
     * Creates new form TelaApp
     */
    public TelaApp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ImageBar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jButtonLoginArea = new javax.swing.JButton();
        jButtonVerificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CodigoDeBarras = new javax.swing.JTextArea();
        LabelBanco = new javax.swing.JLabel();
        LabelTipo = new javax.swing.JLabel();
        LabelValor = new javax.swing.JLabel();
        LabelBeneficiario = new javax.swing.JLabel();
        LabelStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ImageBar.setBackground(new java.awt.Color(204, 9, 47));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BBD.D (1).png"))); // NOI18N

        javax.swing.GroupLayout ImageBarLayout = new javax.swing.GroupLayout(ImageBar);
        ImageBar.setLayout(ImageBarLayout);
        ImageBarLayout.setHorizontalGroup(
            ImageBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(ImageBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ImageBarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ImageBarLayout.setVerticalGroup(
            ImageBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(ImageBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ImageBarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTitulo.setText("VERIFICAR BOLETO");

        jLabelNome.setText("Insira o código de barras:");

        jButtonLoginArea.setText("HISTÓRICO");
        jButtonLoginArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginAreaActionPerformed(evt);
            }
        });

        jButtonVerificar.setBackground(new java.awt.Color(204, 9, 47));
        jButtonVerificar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVerificar.setText("VERIFICAR");
        jButtonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarActionPerformed(evt);
            }
        });

        CodigoDeBarras.setColumns(20);
        CodigoDeBarras.setRows(5);
        jScrollPane1.setViewportView(CodigoDeBarras);

        LabelBanco.setText("Banco:");

        LabelTipo.setText("Tipo:");

        LabelValor.setText("Valor:");

        LabelBeneficiario.setText("Beneficiário:");

        LabelStatus.setText("Status:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(97, 97, 97))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonLoginArea, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 73, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelStatus)
                    .addComponent(LabelBeneficiario)
                    .addComponent(LabelValor)
                    .addComponent(LabelTipo)
                    .addComponent(LabelBanco))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelTitulo)
                .addGap(41, 41, 41)
                .addComponent(jLabelNome)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLoginArea, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(LabelBanco)
                .addGap(18, 18, 18)
                .addComponent(LabelTipo)
                .addGap(18, 18, 18)
                .addComponent(LabelValor)
                .addGap(18, 18, 18)
                .addComponent(LabelBeneficiario)
                .addGap(18, 18, 18)
                .addComponent(LabelStatus)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ImageBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ImageBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginAreaActionPerformed
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonLoginAreaActionPerformed

    private void jButtonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarActionPerformed
        String cod = CodigoDeBarras.getText().trim();  // Pega o código digitado no campo de texto

    if (cod.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, informe o código do boleto.");
        return;
    }

    BoletoDAO dao = new BoletoDAO(BancoDados.conectar());
    Optional<Boleto> boletoOptional = dao.buscarPorCodigo(cod);

    if (boletoOptional.isPresent()) {
        Boleto b = boletoOptional.get();

        if (b instanceof BoletoBancario) {
            BoletoBancario bb = (BoletoBancario) b;

            LabelBanco.setText("Banco: " + bb.getBanco());
            LabelTipo.setText("Tipo: " + bb.getTipo());
            LabelValor.setText(String.format("Valor: R$ %.2f", bb.getValor()));
            LabelBeneficiario.setText("Beneficiário: " + bb.getBeneficiario());
            LabelStatus.setText("Status: " + bb.getStatus().name());
        } else {
            // Caso seja só Boleto, sem tipo
            LabelBanco.setText("Banco: " + b.getBanco());
            LabelTipo.setText("Tipo: —");
            LabelValor.setText(String.format("Valor: R$ %.2f", b.getValor()));
            LabelBeneficiario.setText("Beneficiário: " + b.getBeneficiario());
            LabelStatus.setText("Status: " + b.getStatus().name());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Boleto não encontrado para o código informado.");
        // Limpar campos para evitar mostrar dados antigos
        LabelBanco.setText("Banco:");
        LabelTipo.setText("Tipo:");
        LabelValor.setText("Valor:");
        LabelBeneficiario.setText("Beneficiário:");
        LabelStatus.setText("Status:");
    }
    }//GEN-LAST:event_jButtonVerificarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CodigoDeBarras;
    private javax.swing.JPanel ImageBar;
    private javax.swing.JLabel LabelBanco;
    private javax.swing.JLabel LabelBeneficiario;
    private javax.swing.JLabel LabelStatus;
    private javax.swing.JLabel LabelTipo;
    private javax.swing.JLabel LabelValor;
    private javax.swing.JButton jButtonLoginArea;
    private javax.swing.JButton jButtonVerificar;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
