/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LENOVO
 */
public class DataTransaksi extends javax.swing.JFrame {

    /**
     * Creates new form DataTransaksi
     */
    public DataTransaksi() {
        initComponents();
        table_show();
    }

    private void table_show(){
        PreparedStatement ps;
        ResultSet rs;
        String sql = "SELECT * FROM penjualan";
        try{
            ps = koneksi.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) transaksi.getModel();
           
            while(rs.next()){
                Object[] o = new Object[10];
                o[0] = rs.getString("no_order");
                o[1] = rs.getString("id_pegawai");
                o[2] = rs.getString("id_obat");
                o[3] = rs.getString("nama_obat");
                o[4] = rs.getString("hrga_satuan");
                o[5] = rs.getString("jmlh");
                o[6] = rs.getString("subtotal");
                o[7] = rs.getString("total");
                o[8] = rs.getString("kembalian");
                o[9] = rs.getString("tanggal");
                model.addRow(o);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transaksi = new javax.swing.JTable();
        kembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanel.setBackground(new java.awt.Color(255, 255, 255));
        JPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No Order", "Pegawai", "Obat", "Nama Obat", "Harga Satuan", "Jumlah", "Sub Total", "Total", "Kembalian", "Tanggal"
            }
        ));
        jScrollPane1.setViewportView(transaksi);
        if (transaksi.getColumnModel().getColumnCount() > 0) {
            transaksi.getColumnModel().getColumn(8).setResizable(false);
        }

        JPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 870, 340));

        kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/kembaliBut.png"))); // NOI18N
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        JPanel.add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/logodata.jpg"))); // NOI18N
        JPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 490, 120));

        getContentPane().add(JPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        mainmenuadmin ma = new mainmenuadmin();
        ma.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kembaliActionPerformed

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
            java.util.logging.Logger.getLogger(DataTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembali;
    private javax.swing.JTable transaksi;
    // End of variables declaration//GEN-END:variables
}
