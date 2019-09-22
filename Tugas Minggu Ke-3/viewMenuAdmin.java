package View;

/**
 *
 * @author Irsyad Muhamad Al Anshori
 * 
 */
public class viewMenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form vMenuAdmin
     */
    public viewMenuAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        setSize(360,640);
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
        b3BarMAdmin = new javax.swing.JButton();
        labelDashboard = new javax.swing.JLabel();
        bLogoutMAdmin = new javax.swing.JButton();
        bSoalTestMBTI = new javax.swing.JButton();
        labelSoalTestMBTI = new javax.swing.JLabel();
        bSaranProdi = new javax.swing.JButton();
        labelSaranProdi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        b3BarMAdmin.setBackground(new java.awt.Color(255, 255, 255));
        b3BarMAdmin.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        b3BarMAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Button 3 Bar.png"))); // NOI18N
        b3BarMAdmin.setBorder(null);

        labelDashboard.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        labelDashboard.setText("NgampusYuk! Dashboard");

        bLogoutMAdmin.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        bLogoutMAdmin.setText("Logout");
        bLogoutMAdmin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bLogoutMAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogoutMAdminActionPerformed(evt);
            }
        });

        bSoalTestMBTI.setBackground(new java.awt.Color(255, 255, 255));
        bSoalTestMBTI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Button Test MBTI.png"))); // NOI18N
        bSoalTestMBTI.setBorder(null);
        bSoalTestMBTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSoalTestMBTIActionPerformed(evt);
            }
        });

        labelSoalTestMBTI.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelSoalTestMBTI.setText("Soal Test MBTI");

        bSaranProdi.setBackground(new java.awt.Color(255, 255, 255));
        bSaranProdi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Button College.png"))); // NOI18N
        bSaranProdi.setBorder(null);
        bSaranProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaranProdiActionPerformed(evt);
            }
        });

        labelSaranProdi.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelSaranProdi.setText("Saran Prodi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(b3BarMAdmin)
                .addGap(11, 11, 11)
                .addComponent(labelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bLogoutMAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bSoalTestMBTI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(bSaranProdi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelSoalTestMBTI)
                        .addGap(76, 76, 76)
                        .addComponent(labelSaranProdi)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(b3BarMAdmin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bLogoutMAdmin)
                            .addComponent(labelDashboard))))
                .addGap(123, 123, 123)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSaranProdi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSoalTestMBTI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSoalTestMBTI)
                    .addComponent(labelSaranProdi))
                .addContainerGap(307, Short.MAX_VALUE))
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

    private void bSaranProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaranProdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSaranProdiActionPerformed

    private void bSoalTestMBTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSoalTestMBTIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSoalTestMBTIActionPerformed

    private void bLogoutMAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogoutMAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bLogoutMAdminActionPerformed

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
            java.util.logging.Logger.getLogger(viewMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewMenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b3BarMAdmin;
    private javax.swing.JButton bLogoutMAdmin;
    private javax.swing.JButton bSaranProdi;
    private javax.swing.JButton bSoalTestMBTI;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDashboard;
    private javax.swing.JLabel labelSaranProdi;
    private javax.swing.JLabel labelSoalTestMBTI;
    // End of variables declaration//GEN-END:variables
}
