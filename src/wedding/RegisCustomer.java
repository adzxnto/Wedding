package wedding;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class RegisCustomer extends javax.swing.JInternalFrame {
    public RegisCustomer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegister = new javax.swing.JButton();
        lblAlamat = new javax.swing.JLabel();
        btnClearAll = new javax.swing.JButton();
        txtAlamat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNoRek = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        cmbKodeBank = new javax.swing.JComboBox<>();
        lblKodeBank = new javax.swing.JLabel();
        lblCustomerId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtNama = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnCheckId = new javax.swing.JButton();
        lblNama = new javax.swing.JLabel();
        lblNoTelp = new javax.swing.JLabel();
        txtNoTelp = new javax.swing.JTextField();

        setTitle("Register Customer");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
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

        btnRegister.setText("Register");
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });

        lblAlamat.setText("Alamat");

        btnClearAll.setText("Clear All");
        btnClearAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearAllMouseClicked(evt);
            }
        });

        jLabel5.setText("No Rekening");

        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        lblKodeBank.setText("Kode Bank");

        lblCustomerId.setText("Customer ID");

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        lblPassword.setText("Password");

        btnCheckId.setText("Check ID");
        btnCheckId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCheckIdMouseClicked(evt);
            }
        });

        lblNama.setText("Nama");

        lblNoTelp.setText("No Telepon");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomerId)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblNama, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblAlamat, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblKodeBank, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(lblNoTelp)))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNoRek, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbKodeBank, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNoTelp)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCheckId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnRegister)
                .addGap(18, 18, 18)
                .addComponent(btnClearAll)
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblCustomerId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCheckId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(lblPassword))
                    .addComponent(txtPassword))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(lblNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addComponent(txtAlamat))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNoTelp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbKodeBank))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblKodeBank, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(txtNoRek, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(btnClearAll)
                    .addComponent(btnCancel))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        String username = txtId.getText();
        String password = txtPassword.getText();
        String nama = txtNama.getText();
        String alamat = txtAlamat.getText();
        String rekening = txtNoRek.getText();
        String notelp = txtNoTelp.getText();
        int bank = cmbKodeBank.getSelectedIndex();
        Koneksi conn = new Koneksi();
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        try{
            String sql = "INSERT INTO `ms_customer` (`customerID`, `password`, `namaCustomer`, `alamatCustomer`, `telpCustomer`, `noRekeningCustomer`, `kodeBank`) "
                    + "VALUES ('"+username+"', '"+password+"', '"+nama+"', '"+alamat+"', '"+notelp+"', '"+rekening+"', '"+(bank+1)+"');" ;
            stm = kon.createStatement();
            stm.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Register Berhasil");
                this.setVisible(false);
                
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Register Gagal");
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnRegisterMouseClicked

    private void btnCheckIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckIdMouseClicked
        String username = txtId.getText();
        Koneksi conn = new Koneksi();
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        try{
            String sql = "SELECT * FROM ms_customer WHERE customerID = '"+username+"' UNION ALL SELECT * FROM ms_penyedia WHERE kodePenyedia = '"+username+"'";
            stm = kon.createStatement();
            rs = stm.executeQuery(sql);
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "ID tidak dapat digunakan");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "ID dapat digunakan");
                btnRegister.setEnabled(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCheckIdMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        btnRegister.setEnabled(false);
        
        Koneksi conn = new Koneksi();
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        try{
            String sql = "SELECT * FROM ms_bank";
            stm = kon.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                String w = rs.getString("namaBank");
                cmbKodeBank.addItem(w);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        btnRegister.setEnabled(false);
    }//GEN-LAST:event_txtIdKeyTyped

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
       this.setVisible(false);
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnClearAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearAllMouseClicked
        txtId.setText("");
        txtPassword.setText("");
        txtNama.setText("");
        txtAlamat.setText("");
        txtNoRek.setText("");
        txtNoTelp.setText("");
        cmbKodeBank.setSelectedIndex(0);
        btnRegister.setEnabled(false);
    }//GEN-LAST:event_btnClearAllMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCheckId;
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbKodeBank;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAlamat;
    private javax.swing.JLabel lblCustomerId;
    private javax.swing.JLabel lblKodeBank;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNoTelp;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoRek;
    private javax.swing.JTextField txtNoTelp;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
