/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;

/**
 *
 * @author LENOVO
 */
public class mainmenuadmin extends javax.swing.JFrame {

    /**
     * Creates new form mainmenuadmin
     */
    public mainmenuadmin() {
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
        transaksi_data = new javax.swing.JButton();
        pegawai_kelola = new javax.swing.JButton();
        obat_kelola = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        transaksi_data.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/butLDT.png"))); // NOI18N
        transaksi_data.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transaksi_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksi_dataActionPerformed(evt);
            }
        });
        jPanel1.add(transaksi_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 300, 60));

        pegawai_kelola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/butTDT.png"))); // NOI18N
        pegawai_kelola.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pegawai_kelola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegawai_kelolaActionPerformed(evt);
            }
        });
        jPanel1.add(pegawai_kelola, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 300, 60));

        obat_kelola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/butTDO.png"))); // NOI18N
        obat_kelola.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        obat_kelola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obat_kelolaActionPerformed(evt);
            }
        });
        jPanel1.add(obat_kelola, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 300, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/banneradmin.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, -40, -1, -1));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/logoutadmin.png"))); // NOI18N
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 300, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 860));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void transaksi_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksi_dataActionPerformed
        // TODO add your handling code here:
        DataTransaksi t = new DataTransaksi();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_transaksi_dataActionPerformed

    private void pegawai_kelolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegawai_kelolaActionPerformed
        // TODO add your handling code here:
        TDP p = new TDP();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pegawai_kelolaActionPerformed

    private void obat_kelolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obat_kelolaActionPerformed
        // TODO add your handling code here:
        TDO tdo= new TDO();
        tdo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_obat_kelolaActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        login_admin la = new login_admin();
        la.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(mainmenuadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainmenuadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainmenuadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainmenuadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainmenuadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton obat_kelola;
    private javax.swing.JButton pegawai_kelola;
    private javax.swing.JButton transaksi_data;
    // End of variables declaration//GEN-END:variables
}