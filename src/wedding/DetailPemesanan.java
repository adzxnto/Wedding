package wedding;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class DetailPemesanan extends javax.swing.JInternalFrame {
    public DetailPemesanan() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBanyak = new javax.swing.JLabel();
        txtKodePemesanan = new javax.swing.JTextField();
        cmbTipeLayanan = new javax.swing.JComboBox<>();
        txtBanyak = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDetailPemesanan = new javax.swing.JTable();
        lblKodePemesanan = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        lblTipeLayanan = new javax.swing.JLabel();
        lblKeterangan = new javax.swing.JLabel();

        setTitle("Pilih Layanan");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        lblBanyak.setText("Banyak");

        txtKodePemesanan.setEditable(false);

        cmbTipeLayanan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipeLayananItemStateChanged(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        tblDetailPemesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Keterangan", "Harga Satuan", "Nama Penyedia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblDetailPemesanan);

        lblKodePemesanan.setText("Kode Pemesanan");

        btnSimpan.setText("Simpan");

        lblTipeLayanan.setText("Tipe Layanan");

        lblKeterangan.setText("Keterangan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblKodePemesanan)
                                    .addComponent(lblTipeLayanan)))
                            .addComponent(lblBanyak, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKodePemesanan, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(txtBanyak, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipeLayanan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSimpan)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblKeterangan)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKodePemesanan)
                    .addComponent(txtKodePemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipeLayanan)
                    .addComponent(cmbTipeLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBanyak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBanyak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKeterangan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSimpan)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat tahun = new SimpleDateFormat("yy");
        SimpleDateFormat bulan = new SimpleDateFormat("MM");
        SimpleDateFormat hari = new SimpleDateFormat("dd");
        SimpleDateFormat jam = new SimpleDateFormat("HH");
        String Tahun = tahun.format(cal.getTime());
        String Bulan = bulan.format(cal.getTime());
        String Hari = hari.format(cal.getTime());
        String Jam = jam.format(cal.getTime());
        DefaultTableModel model = new DefaultTableModel();
        tblDetailPemesanan.setModel(model);
        model.addColumn("Nama Penyedia");
        model.addColumn("Harga");
        model.addColumn("Keterangan");
        Koneksi conn = new Koneksi();
        txtKodePemesanan.setText(conn.kodepesan);
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        try{
            String sql = "SELECT * FROM `ms_layanan` WHERE NOT EXISTS (SELECT * FROM `dtl_tr_pemesanan` WHERE EXISTS "
                    + "(SELECT * FROM `hdr_tr_pemesanan` WHERE `tanggalAcara` = '2018-05-10' AND ((`waktuMulaiAcara` BETWEEN '16:00:00' AND '19:00:00') "
                    + "OR `waktuSelesaiAcara` > '16:00:00') AND dtl_tr_pemesanan.kodePemesanan = hdr_tr_pemesanan.kodePemesanan AND ms_layanan.kodeLayanan = dtl_tr_pemesanan.kodeLayanan)) "
                    + "AND kodeTipeLayanan = 1";
            stm = kon.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                Object [] o = new Object[3];
                o[0] = rs.getString("kodePenyedia");
                o[1] = rs.getString("hargaSatuan");
                o[2] = rs.getString("keteranganLayanan");
                model.addRow(o);
            }
         } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat tahun = new SimpleDateFormat("yy");
        SimpleDateFormat bulan = new SimpleDateFormat("MM");
        SimpleDateFormat hari = new SimpleDateFormat("dd");
        SimpleDateFormat jam = new SimpleDateFormat("HH");
        String Tahun = tahun.format(cal.getTime());
        String Bulan = bulan.format(cal.getTime());
        String Hari = hari.format(cal.getTime());
        String Jam = jam.format(cal.getTime());
        Koneksi conn = new Koneksi();
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        try{
            String sql = "SELECT * FROM ms_tipelayanan";
            stm = kon.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                String w = rs.getString("tipeLayanan");
                cmbTipeLayanan.addItem(w);
            }
         } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameActivated
    
    private void cmbTipeLayananItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipeLayananItemStateChanged
        int cek = cmbTipeLayanan.getSelectedIndex();
        int angka = cek + 1;
        DefaultTableModel model = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
        };
        tblDetailPemesanan.setModel(model);
        
        model.addColumn("Nama Penyedia");
        model.addColumn("Harga");
        model.addColumn("Keterangan");
        model.isCellEditable(0, 0);
        Koneksi conn = new Koneksi();
        txtKodePemesanan.setText(conn.kodepesan);
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        try{
            String sql = "SELECT * FROM `ms_layanan` WHERE NOT EXISTS (SELECT * FROM `dtl_tr_pemesanan` WHERE EXISTS (SELECT * FROM `hdr_tr_pemesanan` WHERE `tanggalAcara` = '2018-05-10' AND ((`waktuMulaiAcara` BETWEEN '16:00:00' AND '19:00:00') OR `waktuSelesaiAcara` > '16:00:00') AND dtl_tr_pemesanan.kodePemesanan = hdr_tr_pemesanan.kodePemesanan AND ms_layanan.kodeLayanan = dtl_tr_pemesanan.kodeLayanan)) AND kodeTipeLayanan = "+angka;
            stm = kon.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                Object [] o = new Object[3];
                o[0] = rs.getString("kodePenyedia");
                o[1] = rs.getString("hargaSatuan");
                o[2] = rs.getString("keteranganLayanan");
                model.addRow(o);
            }
         } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbTipeLayananItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cmbTipeLayanan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblBanyak;
    private javax.swing.JLabel lblKeterangan;
    private javax.swing.JLabel lblKodePemesanan;
    private javax.swing.JLabel lblTipeLayanan;
    private javax.swing.JTable tblDetailPemesanan;
    private javax.swing.JTextField txtBanyak;
    private javax.swing.JTextField txtKodePemesanan;
    // End of variables declaration//GEN-END:variables
}
