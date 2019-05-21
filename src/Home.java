
import Database.Star_server;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Sidiq
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        btn_log_Off.setVisible(false);
        btn_formMobil.setVisible(false);
        btn_formPeminjam.setVisible(false);
        btn_formUser.setVisible(false);
        btn_transaksi.setVisible(false);
        Btn_setting.setVisible(false);




    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_formUser = new usu.widget.ButtonGlass();
        btn_transaksi = new usu.widget.ButtonGlass();
        btn_formPeminjam = new usu.widget.ButtonGlass();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btn_formMobil = new usu.widget.ButtonGlass();
        btn_login = new usu.widget.ButtonGlass();
        btn_log_Off = new usu.widget.ButtonGlass();
        btn_closee = new usu.widget.ButtonGlass();
        Btn_setting = new usu.widget.ButtonGlass();
        jLabel2 = new javax.swing.JLabel();
        btn_closee1 = new usu.widget.ButtonGlass();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Server");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_formUser.setForeground(new java.awt.Color(255, 255, 255));
        btn_formUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user_iconn.png"))); // NOI18N
        btn_formUser.setText("Add User");
        btn_formUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_formUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_formUserActionPerformed(evt);
            }
        });
        getContentPane().add(btn_formUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 210, 80));

        btn_transaksi.setForeground(new java.awt.Color(255, 255, 255));
        btn_transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transaksi.png"))); // NOI18N
        btn_transaksi.setText("Pengembalian Mobil");
        btn_transaksi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transaksiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 210, 80));

        btn_formPeminjam.setForeground(new java.awt.Color(255, 255, 255));
        btn_formPeminjam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pinjam.png"))); // NOI18N
        btn_formPeminjam.setText("Pinjam Mobil");
        btn_formPeminjam.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_formPeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_formPeminjamActionPerformed(evt);
            }
        });
        getContentPane().add(btn_formPeminjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 210, 80));
        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1220, 891));

        btn_formMobil.setForeground(new java.awt.Color(255, 255, 255));
        btn_formMobil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_mobil.png"))); // NOI18N
        btn_formMobil.setText("Add Mobil");
        btn_formMobil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_formMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_formMobilActionPerformed(evt);
            }
        });
        getContentPane().add(btn_formMobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 210, 80));

        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loginoke.png"))); // NOI18N
        btn_login.setText("Login");
        btn_login.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 210, 80));

        btn_log_Off.setForeground(new java.awt.Color(255, 255, 255));
        btn_log_Off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/log_off copy.png"))); // NOI18N
        btn_log_Off.setText("Log Off");
        btn_log_Off.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_log_Off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_log_OffActionPerformed(evt);
            }
        });
        getContentPane().add(btn_log_Off, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 210, 80));

        btn_closee.setForeground(new java.awt.Color(255, 255, 255));
        btn_closee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        btn_closee.setText("Exit");
        btn_closee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_closee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_closee, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 210, 80));

        Btn_setting.setForeground(new java.awt.Color(255, 255, 255));
        Btn_setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/connecttt.png"))); // NOI18N
        Btn_setting.setText("Start Server");
        Btn_setting.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Btn_setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_settingActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 210, 80));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Server");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        btn_closee1.setForeground(new java.awt.Color(255, 255, 255));
        btn_closee1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/about.png"))); // NOI18N
        btn_closee1.setText("About");
        btn_closee1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_closee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closee1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_closee1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 210, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/homeoke.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_formUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_formUserActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        Form_user fm = new Form_user();
        fm.setVisible(true);
        jDesktopPane1.add(fm);

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_formUserActionPerformed

    private void btn_formPeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_formPeminjamActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        Form_Peminjam fm = new Form_Peminjam();
        fm.setVisible(true);
        jDesktopPane1.add(fm);
    }//GEN-LAST:event_btn_formPeminjamActionPerformed

    private void btn_formMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_formMobilActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        Form_mobil fm = new Form_mobil();
        fm.setVisible(true);
        jDesktopPane1.add(fm);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_formMobilActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed

        //     jDesktopPane1.removeAll();
        //     jDesktopPane1.repaint();
        dispose();
        Login_server fm = new Login_server();
        fm.setVisible(true);
        //jDesktopPane1.add(fm);


    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksiActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        Form_Pengembalian fm = new Form_Pengembalian();
        fm.setVisible(true);
        jDesktopPane1.add(fm);// TODO add your handling code here:
    }//GEN-LAST:event_btn_transaksiActionPerformed

    private void btn_log_OffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_log_OffActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        btn_login.setVisible(true);
        btn_log_Off.setVisible(false);
        btn_log_Off.setVisible(false);
        btn_formMobil.setVisible(false);
        btn_formPeminjam.setVisible(false);
        btn_formUser.setVisible(false);
        btn_transaksi.setVisible(false);
        Btn_setting.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_log_OffActionPerformed

    private void btn_closeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_closeeActionPerformed

    private void Btn_settingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_settingActionPerformed
        /*
         * jDesktopPane1.removeAll(); jDesktopPane1.repaint(); Setting_IPserver
         * fm = new Setting_IPserver(); fm.setVisible(true);
         * jDesktopPane1.add(fm);
         *
         */

        Star_server s = new Star_server();
    }//GEN-LAST:event_Btn_settingActionPerformed

    private void btn_closee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closee1ActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        About_ a = new About_();
        a.setVisible(true);
        jDesktopPane1.add(a);
    }//GEN-LAST:event_btn_closee1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    public void admin() {

        btn_formMobil.setVisible(true);
        btn_formPeminjam.setVisible(true);
        btn_formUser.setVisible(true);
        btn_log_Off.setVisible(true);
        btn_login.setVisible(false);
        btn_transaksi.setVisible(true);
        Btn_setting.setVisible(true);

    }

    public void user() {
        btn_formMobil.setVisible(true);
        btn_formPeminjam.setVisible(true);
        btn_formUser.setVisible(false);
        btn_log_Off.setVisible(true);
        btn_login.setVisible(false);
        btn_transaksi.setVisible(true);
        Btn_setting.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static usu.widget.ButtonGlass Btn_setting;
    public static usu.widget.ButtonGlass btn_closee;
    public static usu.widget.ButtonGlass btn_closee1;
    public static usu.widget.ButtonGlass btn_formMobil;
    public static usu.widget.ButtonGlass btn_formPeminjam;
    public static usu.widget.ButtonGlass btn_formUser;
    public static usu.widget.ButtonGlass btn_log_Off;
    public static usu.widget.ButtonGlass btn_login;
    public static usu.widget.ButtonGlass btn_transaksi;
    public static javax.swing.JDesktopPane jDesktopPane1;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}