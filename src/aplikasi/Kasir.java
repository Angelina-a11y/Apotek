/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;

import java.sql.*;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author LENOVO
 */
public class Kasir extends javax.swing.JFrame {
      public static void main(String[] args) {    
     
  }    

    /**
     * Creates new form Kasir
     */
    public Kasir() {
        
        initComponents();
        pilih_obat();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        info = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transaksi = new javax.swing.JTable();
        btn_bayar = new javax.swing.JButton();
        btn_total = new javax.swing.JButton();
        txt_penjualan = new javax.swing.JTextField();
        txt_jumlah = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_pegawai = new javax.swing.JTextField();
        txt_kode = new javax.swing.JTextField();
        txt_bayar = new javax.swing.JTextField();
        txt_kembalian = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        kembali = new javax.swing.JButton();
        end = new javax.swing.JButton();
        cbObat = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();

        info.setColumns(20);
        info.setRows(5);
        jScrollPane2.setViewportView(info);

        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/IDtxt.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/Jumlahtxt.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/Totaltxt.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, -1, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/KodeObattxt.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/NamaObattxt.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/Bayartxt.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/Kembaliantxt.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/Hargatxt.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, 20));

        transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode Obat", "Nama Obat", "Harga", "Jumlah", "Sub Total"
            }
        ));
        transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transaksiMouseClicked(evt);
            }
        });
        transaksi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                transaksiKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(transaksi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 470, 310));

        btn_bayar.setBackground(new java.awt.Color(255, 255, 255));
        btn_bayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/bayarBut.png"))); // NOI18N
        btn_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bayarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 90, 30));

        btn_total.setBackground(new java.awt.Color(255, 255, 255));
        btn_total.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/totalBut.png"))); // NOI18N
        btn_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_totalActionPerformed(evt);
            }
        });
        getContentPane().add(btn_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 90, 30));

        txt_penjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_penjualanActionPerformed(evt);
            }
        });
        txt_penjualan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_penjualanKeyPressed(evt);
            }
        });
        getContentPane().add(txt_penjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 140, 30));

        txt_jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlahActionPerformed(evt);
            }
        });
        txt_jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_jumlahKeyPressed(evt);
            }
        });
        getContentPane().add(txt_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 150, 30));

        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 210, 30));

        txt_pegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pegawaiActionPerformed(evt);
            }
        });
        txt_pegawai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_pegawaiKeyPressed(evt);
            }
        });
        getContentPane().add(txt_pegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 140, 30));

        txt_kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kodeActionPerformed(evt);
            }
        });
        txt_kode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_kodeKeyPressed(evt);
            }
        });
        getContentPane().add(txt_kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 150, 30));

        txt_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bayarActionPerformed(evt);
            }
        });
        getContentPane().add(txt_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 210, 30));
        getContentPane().add(txt_kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 210, 30));

        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 150, 30));

        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });
        txt_nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_namaKeyPressed(evt);
            }
        });
        getContentPane().add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 150, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/NoPenjualantxt.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/kembaliBut.png"))); // NOI18N
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 100, 30));

        end.setBackground(new java.awt.Color(255, 255, 255));
        end.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/selesai.png"))); // NOI18N
        end.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endActionPerformed(evt);
            }
        });
        getContentPane().add(end, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 210, 40));

        cbObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbObatActionPerformed(evt);
            }
        });
        getContentPane().add(cbObat, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 120, 30));

        jMenuBar1.setBackground(new java.awt.Color(255, 51, 51));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_kodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kodeActionPerformed

    private void txt_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bayarActionPerformed

    private void txt_jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jumlahActionPerformed

    private void txt_pegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pegawaiActionPerformed

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void txt_penjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_penjualanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_penjualanActionPerformed

    private void btn_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_totalActionPerformed
        // TODO add your handling code here:
        int numrow = transaksi.getRowCount();
        double total =0;

        for(int i = 0; i < numrow; i++){
            double val = Double.valueOf(transaksi.getValueAt(i, 5).toString());
            total += val;
        }
        txt_total.setText(Double.toString(total));
        txt_bayar.requestFocus();
    }//GEN-LAST:event_btn_totalActionPerformed

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalActionPerformed

    private void btn_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bayarActionPerformed
        // TODO add your handling code here:
         double total = Double.parseDouble(txt_total.getText());
        double bayar = Double.parseDouble(txt_bayar.getText());
        if(bayar < total){
            JOptionPane.showMessageDialog(this, "Uang kurang!!");
            txt_bayar.requestFocus();
        }else{
            double kembalian = bayar-total;
        
        txt_kembalian.setText(Double.toString(kembalian));
        }
         
    }//GEN-LAST:event_btn_bayarActionPerformed

    private void txt_penjualanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_penjualanKeyPressed
        // TODO add your handling code here:
         int key = evt.getKeyCode();
        if(key==10){
            txt_penjualan.getText();
//            int order = Integer.parseInt(txt_penjualan.getText());
           
            txt_pegawai.requestFocus();
        }
    }//GEN-LAST:event_txt_penjualanKeyPressed

    private void txt_pegawaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pegawaiKeyPressed
        // TODO add your handling code here:
         int key = evt.getKeyCode();
        if(key==10){
            pegawai p = new pegawai();
            ResultSet rs = null;
           
            int kode = Integer.parseInt(txt_pegawai.getText());
            rs = p.find(kode);
            
            try{
                if(rs.next()){

                    txt_kode.requestFocus();
                } else{
                    JOptionPane.showMessageDialog(null, "No data");
                    txt_pegawai.requestFocus();
                    txt_pegawai.setText("");
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } 
            
        }
        
    }//GEN-LAST:event_txt_pegawaiKeyPressed

    private void txt_jumlahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_jumlahKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if(key==10){
            Connection c = koneksi.getConnection();
            int kode = Integer.parseInt(txt_kode.getText());
            String nama_obat = txt_nama.getText();
            double harga = Double.parseDouble(txt_harga.getText());
            int jumlah = Integer.parseInt(txt_jumlah.getText());
            double subtotal = harga * jumlah;
            
             String sqla = "SELECT stok FROM stok_obat WHERE kode='"+kode+"'";
            try{
                PreparedStatement ps = c.prepareStatement(sqla);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    int stok = rs.getInt("stok");
                    if(jumlah>stok){
                        JOptionPane.showMessageDialog(this, "stok kurang");
                        txt_kode.setText("");
                        txt_nama.setText("");
                        txt_harga.setText("");
                        txt_jumlah.setText("");
                        
                        txt_kode.requestFocus();
                    }
                }  
            }catch(SQLException e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            
            if(txt_kode.getText().equals("")||txt_nama.getText().equals("")||txt_harga.getText().equals("")||txt_jumlah.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Lengkapi data!!");
        }else{

            try{
                
                String sql = "INSERT INTO tmp_penjualan VALUES (?,?,?,?,?,?)";
                
                PreparedStatement ps = c.prepareStatement(sql);
                ps.setString(1, null);
                ps.setInt(2, kode);
                ps.setString(3, nama_obat);
                ps.setDouble(4, harga);
                ps.setInt(5, jumlah);
                ps.setDouble(6, subtotal);
                
                ps.executeUpdate();
                ps.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }finally{
            txt_kode.setText("");
            txt_nama.setText("");
            txt_harga.setText("");
            txt_jumlah.setText("");

            txt_kode.requestFocus();
            loadData();
            }
            
        }    
        }
    }//GEN-LAST:event_txt_jumlahKeyPressed

    private void transaksiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transaksiKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_transaksiKeyPressed

    private void transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaksiMouseClicked
        // TODO add your handling code here:
         DefaultTableModel model= (DefaultTableModel) transaksi.getModel();
        Connection cn = koneksi.getConnection();
        Statement st;
        int jawaban;
        if((jawaban=JOptionPane.showConfirmDialog(null, "Yakin Batal?","konfirmasi",JOptionPane.YES_NO_OPTION))==0){
            try{
                int i = transaksi.getSelectedRow();
                if(i== -1){
                    return;
                }
                int id = Integer.parseInt(model.getValueAt(i, 0).toString());
                
                st = cn.createStatement();
                st.executeUpdate("delete from tmp_penjualan where id='"+id+"'");

                loadData();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_transaksiMouseClicked

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        mainmenu ma = new mainmenu();
        ma.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kembaliActionPerformed

    private void txt_namaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_namaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaKeyPressed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void txt_kodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_kodeKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if(key==10){
            function f = new function();
            ResultSet rs = null;
            String nama = "nama_obat";
            String harga = "harga";
           
            
            rs = f.find(txt_kode.getText());
            
            try{
                if(rs.next()){
                    txt_nama.setText(rs.getString(nama));
                    txt_harga.setText(rs.getString(harga));
                    txt_jumlah.requestFocus();
                } else{
                    JOptionPane.showMessageDialog(null, "No data");
                    txt_kode.setText("");
                    txt_kode.requestFocus();
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } 
            
        }
    }//GEN-LAST:event_txt_kodeKeyPressed

    private void endActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endActionPerformed
        // TODO add your handling code here:
        try{
           Connection c = koneksi.getConnection();
           Statement s = c.createStatement();
           
           String sql = "SELECT * FROM tmp_penjualan";
           ResultSet rs = s.executeQuery(sql);
           
           while(rs.next()){
               double total = Double.parseDouble(txt_total.getText());
                java.util.Date date=new java.util.Date();
                java.sql.Date sqlDate=new java.sql.Date(date.getTime());
                String sqla = "INSERT INTO penjualan VALUES(?,?,?,?,?,?,?,?,?,?)";
                int pegawai = Integer.parseInt(txt_pegawai.getText());
                double kembalian = Double.parseDouble(txt_kembalian.getText());
                PreparedStatement ps = c.prepareStatement(sqla);
                ps.setString(1, txt_penjualan.getText());
                ps.setInt(2, pegawai);
                ps.setString(3, rs.getString("id_obat"));
                ps.setString(4, rs.getString("nama_obat"));
                ps.setInt(5, rs.getInt("hrga_satuan"));
                ps.setInt(6, rs.getInt("jmlh"));
                ps.setInt(7, rs.getInt("subtotal"));
                ps.setDouble(8, total);
                ps.setDouble(9, kembalian);
                ps.setDate(10, sqlDate);
                
                ps.executeUpdate();
                ps.close();
                   
           }
           rs.close();
           s.close();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(this, e.getMessage());
       }finally{
               try{
                   String sqla = "TRUNCATE tmp_penjualan";
                   Connection conn =  koneksi.getConnection();
                   PreparedStatement pst = conn.prepareStatement(sqla);
                   pst.executeUpdate();
                        
            
        //            ntar dsini kosongin semua form
                   txt_penjualan.setText("");
                    txt_pegawai.setText("");
                    DefaultTableModel model = (DefaultTableModel) transaksi.getModel();
                    model.setRowCount(0);
                    txt_total.setText("");
                    txt_bayar.setText("");
                    txt_kembalian.setText("");

                    txt_penjualan.requestFocus();
                    JOptionPane.showMessageDialog(this, "Transaksi Berhasil");
        
               }catch(SQLException e){
                   JOptionPane.showMessageDialog(this, e.getMessage());
               }
               
           }
    }//GEN-LAST:event_endActionPerformed

    private void cbObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbObatActionPerformed
        // TODO add your handling code here:
         String kode = "kode";
            String harga = "harga";
            try{
                Connection conn = koneksi.getConnection();
                Statement s = conn.createStatement();
                String sql = "SELECT kode, harga FROM stok_obat WHERE nama_obat='"+cbObat.getSelectedItem()+"'";
                ResultSet rs = s.executeQuery(sql);
                while(rs.next()){
                    txt_nama.setText(rs.getString(kode));
                    txt_harga.setText(rs.getString(harga));
                    txt_jumlah.requestFocus();
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } 
    }//GEN-LAST:event_cbObatActionPerformed

    public class pegawai{
        Connection con = null;
        ResultSet rs= null;
        PreparedStatement ps = null;
        
        public ResultSet find(Integer i){
            try{
                con = koneksi.getConnection();
                ps = con.prepareStatement("SELECT nama_pegawai FROM pegawai WHERE id_pegawai=?");
                ps.setInt(1, i);
                rs = ps.executeQuery();
            }catch(SQLException ex){
                 JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            return rs;
        }
    }
     public class function{
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        public ResultSet find(String s){
            try{
            con = koneksi.getConnection();
            ps = con.prepareStatement("SELECT nama_obat,harga FROM stok_obat WHERE kode=?");
            ps.setString(1, s);
            rs = ps.executeQuery();
            } catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            return rs;
        }
    }

     private void loadData(){
          DefaultTableModel DFT = (DefaultTableModel) transaksi.getModel();
         DFT.fireTableDataChanged();
        int cc;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "SELECT * FROM tmp_penjualan";
        try{
            ps = koneksi.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData RSMD = rs.getMetaData();
            cc = RSMD.getColumnCount();
           
            DFT.setRowCount(0);
            
            while(rs.next()){
                Vector v2 = new Vector();
                for(int ii =1; ii<=cc; ii++){
                    v2.add(rs.getInt("id"));
                    v2.add(rs.getString("id_obat"));
                    v2.add(rs.getString("nama_obat"));
                    v2.add(rs.getDouble("hrga_satuan"));
                    v2.add(rs.getInt("jmlh"));
                    v2.add(rs.getDouble("subtotal"));
                }
                DFT.addRow(v2);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
     
     private void pilih_obat(){
            String kode = "kode";
            String harga = "harga";
            try{
                Connection conn = koneksi.getConnection();
                Statement s = conn.createStatement();
                String sql = "SELECT kode, harga FROM stok_obat WHERE nama_obat='"+cbObat.getSelectedItem()+"'";
                ResultSet rs = s.executeQuery(sql);
                while(rs.next()){
                    cbObat.addItem(rs.getString("nama_obat"));
                    txt_nama.setText(rs.getString(kode));
                    txt_harga.setText(rs.getString(harga));
                    txt_jumlah.requestFocus();
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } 
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bayar;
    private javax.swing.JButton btn_total;
    private javax.swing.JComboBox cbObat;
    private javax.swing.JButton end;
    private javax.swing.JTextArea info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kembali;
    private javax.swing.JTable transaksi;
    private javax.swing.JTextField txt_bayar;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_jumlah;
    private javax.swing.JTextField txt_kembalian;
    private javax.swing.JTextField txt_kode;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_pegawai;
    private javax.swing.JTextField txt_penjualan;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
