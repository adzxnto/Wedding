package wedding;

import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {
    public MainFrame() {
        initComponents();
        mnPemesanan.setVisible(false);
        mnLayanan.setVisible(false);
        mnLogout.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mdiMainMenu = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnUser = new javax.swing.JMenu();
        mnLogin = new javax.swing.JMenuItem();
        mnLogout = new javax.swing.JMenuItem();
        mnRegisterC = new javax.swing.JMenuItem();
        mnRegisterP = new javax.swing.JMenuItem();
        mnLayanan = new javax.swing.JMenu();
        mnPemesanan = new javax.swing.JMenu();
        mnPembayaran = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wedding Organizer");

        mdiMainMenu.setDesktopManager(null);

        javax.swing.GroupLayout mdiMainMenuLayout = new javax.swing.GroupLayout(mdiMainMenu);
        mdiMainMenu.setLayout(mdiMainMenuLayout);
        mdiMainMenuLayout.setHorizontalGroup(
            mdiMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 993, Short.MAX_VALUE)
        );
        mdiMainMenuLayout.setVerticalGroup(
            mdiMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        mnUser.setText("User");
        mnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnUserActionPerformed(evt);
            }
        });

        mnLogin.setText("Login");
        mnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLoginActionPerformed(evt);
            }
        });
        mnUser.add(mnLogin);

        mnLogout.setText("Logout");
        mnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLogoutActionPerformed(evt);
            }
        });
        mnUser.add(mnLogout);

        mnRegisterC.setText("Register Customer");
        mnRegisterC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRegisterCActionPerformed(evt);
            }
        });
        mnUser.add(mnRegisterC);

        mnRegisterP.setText("Register Penyedia");
        mnRegisterP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRegisterPActionPerformed(evt);
            }
        });
        mnUser.add(mnRegisterP);

        jMenuBar1.add(mnUser);

        mnLayanan.setText("Layanan");
        mnLayanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnLayananMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnLayanan);

        mnPemesanan.setText("Pemesanan");
        mnPemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnPemesananMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnPemesanan);

        mnPembayaran.setText("Pembayaran");
        jMenuBar1.add(mnPembayaran);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mdiMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mdiMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnRegisterCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRegisterCActionPerformed
        RegisCustomer regcus = new RegisCustomer();
        mdiMainMenu.add(regcus);
        regcus.setVisible(true);
    }//GEN-LAST:event_mnRegisterCActionPerformed

    private void mnRegisterPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRegisterPActionPerformed
        RegisPenyedia regpen = new RegisPenyedia();
        mnRegisterP.setVisible(false);
        mdiMainMenu.removeAll();
        repaint();
        mdiMainMenu.add(regpen);
        regpen.setVisible(true);
    }//GEN-LAST:event_mnRegisterPActionPerformed

    private void mnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLoginActionPerformed
        Login login = new Login();
        mdiMainMenu.add(login);
        login.setVisible(true);
        
    }//GEN-LAST:event_mnLoginActionPerformed

    private void mnLayananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnLayananMouseClicked
        Layanan layanan = new Layanan();
        mdiMainMenu.add(layanan);
        layanan.setVisible(true);
    }//GEN-LAST:event_mnLayananMouseClicked

    private void mnPemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPemesananMouseClicked
        Pemesanan pemesanan = new Pemesanan();
        mdiMainMenu.add(pemesanan);
        pemesanan.setVisible(true);
    }//GEN-LAST:event_mnPemesananMouseClicked

    private void mnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnUserActionPerformed

    private void mnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLogoutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Selamat Tinggal");
        mnLogout.setVisible(false);
        mnLogin.setVisible(true);
        mdiMainMenu.removeAll();
        Koneksi.username="";
        repaint();
    }//GEN-LAST:event_mnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JDesktopPane mdiMainMenu;
    public static javax.swing.JMenu mnLayanan;
    public static javax.swing.JMenuItem mnLogin;
    public static javax.swing.JMenuItem mnLogout;
    public static javax.swing.JMenu mnPembayaran;
    public static javax.swing.JMenu mnPemesanan;
    public static javax.swing.JMenuItem mnRegisterC;
    public static javax.swing.JMenuItem mnRegisterP;
    private javax.swing.JMenu mnUser;
    // End of variables declaration//GEN-END:variables
}
