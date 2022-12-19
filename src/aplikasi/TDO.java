/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class TDO extends javax.swing.JFrame {

    /**
     * Creates new form TDO
     */
    public TDO() {
        initComponents();
        table_show();
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
        kembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        obat = new javax.swing.JTable();
        tambah = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        textkode = new javax.swing.JTextField();
        textnama = new javax.swing.JTextField();
        textharga = new javax.swing.JTextField();
        txtstok = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/kembaliBut.png"))); // NOI18N
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        jPanel1.add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/TDOtxt.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/KodeObattxt.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/NamaObattxt.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/Hargatxt.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/Stoktxt.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        obat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Obat", "Nama Obat", "Harga", "Stok"
            }
        ));
        obat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(obat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 620, 260));

        tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/tambahBut.png"))); // NOI18N
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        jPanel1.add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 100, 30));

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/editBut.png"))); // NOI18N
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 100, 30));

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/hapusBut.png"))); // NOI18N
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 100, 30));
        jPanel1.add(textkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 150, 30));

        textnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnamaActionPerformed(evt);
            }
        });
        jPanel1.add(textnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 150, 30));
        jPanel1.add(textharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 150, 30));
        jPanel1.add(txtstok, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnamaActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        mainmenuadmin ma = new mainmenuadmin();
        ma.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kembaliActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        PreparedStatement ps;
        ResultSet rs;
        String query = "UPDATE stok_obat set nama_obat=?,harga=?,stok=? WHERE kode=?";
        
        DefaultTableModel model = (DefaultTableModel) obat.getModel();
        int selectedIndex = obat.getSelectedRow();
        try{
            int kode = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
            String nama = textnama.getText();
            Double harga = Double.parseDouble(textharga.getText());
            int stok = Integer.parseInt(txtstok.getText());
            
            ps = koneksi.getConnection().prepareStatement(query);
            ps.setString(1, nama);
            ps.setDouble(2, harga);
            ps.setInt(3, stok);
            ps.setInt(4, kode);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "data berhasil di ubah");
            
            textkode.setText("");
            textnama.setText("");
            textharga.setText("");
            txtstok.setText("");
            table_show();
        } catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        PreparedStatement ps;
        String nama = textnama.getText();
        int kode = Integer.parseInt(textkode.getText());
        int harga = Integer.parseInt(textharga.getText());
        int stok = Integer.parseInt(txtstok.getText());
        String query = "INSERT INTO stok_obat(kode,nama_obat,stok,harga)VALUES(?,?,?,?)";
        try{
            ps = koneksi.getConnection().prepareStatement(query);
            ps.setInt(1, kode);
            ps.setString(2, nama);
            ps.setInt(3, stok);
            ps.setInt(4, harga);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Data Di Simpan!");
            
            textnama.setText("");
            textkode.setText("");
            textharga.setText("");
            txtstok.setText("");
            textnama.requestFocus();
            table_show();
        }catch (SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_tambahActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        PreparedStatement ps;
        ResultSet rs;
        
        String query = "DELETE FROM stok_obat WHERE kode = ?";
        
        DefaultTableModel model = (DefaultTableModel) obat.getModel();
        int selectedIndex = obat.getSelectedRow();
        try{
            int kode = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
            int dialogResult = JOptionPane.showConfirmDialog(null, "apakah yakin?","warning",JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
                ps = koneksi.getConnection().prepareStatement(query);
                ps.setInt(1, kode);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "data berhasil di hapus!");
                textnama.setText("");
                textkode.setText("");
                textharga.setText("");
                txtstok.setText("");
                table_show();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void obatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obatMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)obat.getModel();
        
        int selectedRowIndex = obat.getSelectedRow();
        

        textnama.setText(model.getValueAt(selectedRowIndex, 1).toString());
        textharga.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txtstok.setText(model.getValueAt(selectedRowIndex, 3).toString());
    }//GEN-LAST:event_obatMouseClicked

       private void table_show(){
        int cc;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "SELECT * FROM stok_obat";
        try{
            ps = koneksi.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData RSMD = rs.getMetaData();
            cc = RSMD.getColumnCount();
            DefaultTableModel DFT = (DefaultTableModel) obat.getModel();
            DFT.setRowCount(0);
            
            while(rs.next()){
                Vector v2 = new Vector();
                for(int ii =1; ii<=cc; ii++){
                    v2.add(rs.getString("kode"));
                    v2.add(rs.getString("nama_obat"));
                    v2.add(rs.getDouble("harga"));
                    v2.add(rs.getString("stok"));
                }
                DFT.addRow(v2);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(TDO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TDO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TDO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TDO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TDO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembali;
    private javax.swing.JTable obat;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField textharga;
    private javax.swing.JTextField textkode;
    private javax.swing.JTextField textnama;
    private javax.swing.JTextField txtstok;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}