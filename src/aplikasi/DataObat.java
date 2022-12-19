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
public class DataObat extends javax.swing.JFrame{

    /**
     * Creates new form DataObat
     */
    public DataObat() {
        initComponents();
        show_table();
    }

    private void show_table(){
        PreparedStatement ps;
        ResultSet rs;
        String sql = "SELECT * FROM stok_obat";
        try{
            ps = koneksi.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) obat.getModel();
            
            while(rs.next()){
                Object[] o = new Object[4];
                o[0] = rs.getString("kode");
                o[1] = rs.getString("nama_obat");
                o[2] = rs.getString("stok");
                o[3] = rs.getString("harga");
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        obat = new javax.swing.JTable();
        kembali = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        obat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Obat", "Nama Obat", "Stok", "harga"
            }
        ));
        jScrollPane1.setViewportView(obat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 760, 360));

        kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/kembaliBut.png"))); // NOI18N
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        jPanel1.add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        mainmenu ma = new mainmenu();
        ma.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kembaliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembali;
    private javax.swing.JTable obat;
    // End of variables declaration//GEN-END:variables
}
