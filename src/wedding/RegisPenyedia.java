package wedding;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class RegisPenyedia extends javax.swing.JInternalFrame {
    public RegisPenyedia() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAlamat = new javax.swing.JLabel();
        btnClearAll = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        lblKodeBank = new javax.swing.JLabel();
        lblIdPenyedia = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNoRek = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        cmbKodeBank = new javax.swing.JComboBox<>();
        btnCheckId = new javax.swing.JButton();
        txtAlamat = new javax.swing.JTextField();
        lblNama = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        lblNoTelp = new javax.swing.JLabel();
        txtNoTelp = new javax.swing.JTextField();

        setTitle("Register Penyedia");
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

        lblIdPenyedia.setText("ID Penyedia");

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

        btnRegister.setText("Register");
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });

        lblNoTelp.setText("No Telepon");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdPenyedia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNama, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAlamat, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNoTelp, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblKodeBank, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbKodeBank, 0, 154, Short.MAX_VALUE)
                            .addComponent(txtNoRek))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAlamat)
                                    .addComponent(txtNama)
                                    .addComponent(txtId)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCheckId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnRegister)
                .addGap(18, 18, 18)
                .addComponent(btnClearAll)
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblIdPenyedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId)
                            .addComponent(btnCheckId))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtPassword)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtNama)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtAlamat)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtNoTelp))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblNoTelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblKodeBank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(cmbKodeBank)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txtNoRek)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(btnClearAll)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
       btnRegister.setEnabled(false);
    }//GEN-LAST:event_txtIdKeyTyped

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

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        MainFrame.mnRegisterP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelMouseClicked

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

    private void btnCheckIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckIdMouseClicked
        String username = txtId.getText();
        Koneksi conn = new Koneksi();
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        try{
            String sql = "SELECT * FROM ms_penyedia WHERE kodePenyedia = '"+username+"' UNION ALL SELECT * FROM ms_customer WHERE customerID = '"+username+"'";
            stm = kon.createStatement();
            rs = stm.executeQuery(sql);
            if(rs.next()){
                String w = rs.getString("kodePenyedia");
                JOptionPane.showMessageDialog(null, "Selamat Datang, "+w);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "TIDAK VALID BEGO");
                btnRegister.setEnabled(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCheckIdMouseClicked

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
            String sql = "INSERT INTO `ms_penyedia` (`kodePenyedia`, `password`, `namaPenyedia`, `alamatPenyedia`, `telpPenyedia`, `noRekeningPenyedia`, `kodeBank`) "
                    + "VALUES ('"+username+"', '"+password+"', '"+nama+"', '"+alamat+"', '"+notelp+"', '"+rekening+"', '"+(bank+1)+"');" ;
            stm = kon.createStatement();
            stm.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Selamat Datang, ");
                this.setVisible(false);
                
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "TIDAK VALID BEGO");
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnRegisterMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCheckId;
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbKodeBank;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAlamat;
    private javax.swing.JLabel lblIdPenyedia;
    private javax.swing.JLabel lblKodeBank;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNoTelp;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoRek;
    private javax.swing.JTextField txtNoTelp;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
