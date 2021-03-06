

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sidiq
 */
public class Setting_IPserver extends javax.swing.JInternalFrame {

    /**
     * Creates new form Setting
     */
    public Setting_IPserver() {
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

        jLabel2 = new javax.swing.JLabel();
        panelGlass1 = new usu.widget.glass.PanelGlass();
        txt_ipaddres_server = new javax.swing.JTextField();
        txt_port_server = new javax.swing.JTextField();
        btn_close_setting_server = new usu.widget.ButtonGlass();
        btn_setting_server = new usu.widget.ButtonGlass();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/options.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        txt_ipaddres_server.setText("127.0.0.1");
        txt_ipaddres_server.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_ipaddres_serverMouseClicked(evt);
            }
        });

        txt_port_server.setText("11111");
        txt_port_server.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_port_serverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_ipaddres_server)
                    .addComponent(txt_port_server, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(txt_ipaddres_server, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(txt_port_server, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(panelGlass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 390, 160));

        btn_close_setting_server.setForeground(new java.awt.Color(255, 255, 255));
        btn_close_setting_server.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close_delete.png"))); // NOI18N
        btn_close_setting_server.setText("Close");
        btn_close_setting_server.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_close_setting_serverActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close_setting_server, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 130, -1));

        btn_setting_server.setForeground(new java.awt.Color(255, 255, 255));
        btn_setting_server.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/check-64.png"))); // NOI18N
        btn_setting_server.setText("Set Setting");
        getContentPane().add(btn_setting_server, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Setting.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_close_setting_serverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_close_setting_serverActionPerformed
        dispose();
    }//GEN-LAST:event_btn_close_setting_serverActionPerformed

    private void txt_ipaddres_serverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ipaddres_serverMouseClicked
        txt_ipaddres_server.setText("");
    }//GEN-LAST:event_txt_ipaddres_serverMouseClicked

    private void txt_port_serverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_port_serverMouseClicked
       txt_port_server.setText("");
    }//GEN-LAST:event_txt_port_serverMouseClicked

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
            java.util.logging.Logger.getLogger(Setting_IPserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setting_IPserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setting_IPserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setting_IPserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Setting_IPserver().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.ButtonGlass btn_close_setting_server;
    private usu.widget.ButtonGlass btn_setting_server;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private usu.widget.glass.PanelGlass panelGlass1;
    private javax.swing.JTextField txt_ipaddres_server;
    private javax.swing.JTextField txt_port_server;
    // End of variables declaration//GEN-END:variables
}
