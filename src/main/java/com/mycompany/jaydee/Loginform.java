package com.mycompany.jaydee;


import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Rica
 */

public class Loginform extends javax.swing.JFrame {

    /**
     * Creates new form Loginform
     */
    public Loginform() {
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

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabelRegister = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton_Login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(237, 237, 237));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(234, 234, 234));
        jPanel1.setLayout(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1533, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1533, 26);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1379, 0, 0, 0);

        jPanel3.setBackground(new java.awt.Color(107, 0, 215));

        jLabelClose.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelClose.setText("X");
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabelMin.setText("-");
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(1296, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(33, 33, 33)
                .addComponent(jLabelClose)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1373, 25);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Log in");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(240, 300, 140, 80);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("Jaydee.3b");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 790, 70, 20);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("The way to get started is to quit talking and begin doing.");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(70, 510, 490, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nature Work Place iPhone Wallpaper HD - iPhone Wallpapers (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 10, 650, 830);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(86, 54, 124));
        jPanel5.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jeydee-removebg-preview (8).png"))); // NOI18N
        jPanel5.add(jLabel2);
        jLabel2.setBounds(334, 49, 120, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Hello ! Welcome Back");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(270, 160, 250, 36);

        jCheckBox1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox1.setLabel("Remember me");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel5.add(jCheckBox1);
        jCheckBox1.setBounds(270, 430, 102, 19);

        jLabelRegister.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabelRegister.setForeground(new java.awt.Color(153, 153, 153));
        jLabelRegister.setText("Don't have an account?     ");
        jLabelRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelRegisterMouseExited(evt);
            }
        });
        jPanel5.add(jLabelRegister);
        jLabelRegister.setBounds(300, 580, 150, 20);

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("______________ or _______________________");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(290, 530, 240, 16);

        jButton_Login.setBackground(new java.awt.Color(154, 119, 196));
        jButton_Login.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton_Login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Login.setActionCommand("Login");
        jButton_Login.setAutoscrolls(true);
        jButton_Login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(107, 0, 215), 1, true));
        jButton_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Login.setLabel("Login");
        jButton_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_LoginMouseExited(evt);
            }
        });
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });
        jPanel5.add(jButton_Login);
        jButton_Login.setBounds(270, 470, 260, 43);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(107, 0, 215));
        jLabel4.setText("Username :");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(190, 300, 80, 20);

        jTextField_Username.setBackground(new java.awt.Color(247, 247, 247));
        jTextField_Username.setForeground(new java.awt.Color(204, 204, 204));
        jTextField_Username.setText("Username");
        jTextField_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusLost(evt);
            }
        });
        jTextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsernameActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField_Username);
        jTextField_Username.setBounds(270, 300, 260, 30);

        jPasswordField.setBackground(new java.awt.Color(247, 247, 247));
        jPasswordField.setText("Password");
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusLost(evt);
            }
        });
        jPanel5.add(jPasswordField);
        jPasswordField.setBounds(270, 370, 260, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(107, 0, 215));
        jLabel5.setText("Password :");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(190, 370, 80, 20);

        jLabel7.setBackground(new java.awt.Color(115, 72, 167));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(86, 54, 124));
        jLabel7.setText("  Click Here");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel7);
        jLabel7.setBounds(430, 580, 80, 20);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(650, 20, 720, 810);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost

        String pass = String.valueOf(jPasswordField.getPassword());

        if (pass.trim().equals("") ||
            pass.trim().toLowerCase().equals ("password"))

        jPasswordField.setText("password");
        jPasswordField.setForeground (new Color (153,153,153));
    }//GEN-LAST:event_jPasswordFieldFocusLost

    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained

        String pass = String.valueOf(jPasswordField.getPassword());

        if (pass.trim().toLowerCase().equals ("password"))
        {
            jPasswordField.setText("");
            jPasswordField.setForeground (Color.black);
        }

    }//GEN-LAST:event_jPasswordFieldFocusGained

    private void jTextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsernameActionPerformed

    private void jTextField_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusLost

        if (jTextField_Username.getText().trim().equals("") ||
            jTextField_Username.getText().trim().toLowerCase().equals ("username"))
        {
            jTextField_Username.setText("Username");
            jTextField_Username.setForeground (new Color (153, 153, 153));
        }
    }//GEN-LAST:event_jTextField_UsernameFocusLost

    private void jTextField_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusGained
        if (jTextField_Username.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_Username.setText("");
            jTextField_Username.setForeground (Color.black);

        }
    }//GEN-LAST:event_jTextField_UsernameFocusGained

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);

    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed

        PreparedStatement st;
        ResultSet rs;

        String username = jTextField_Username.getText();
        String password = String.valueOf(jPasswordField.getPassword());

        String query="SELECT * FROM users WHERE username = ? AND password = ?";

        try {
            st = My_CNX.getConnection().prepareStatement(query);

            st.setString(1, username);
            st.setString(2, password);

            rs = st.executeQuery();

            if(rs.next())
            {
                LandForm2 form = new LandForm2();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Invalid Username / Password", "Login Error", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Loginform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void jButton_LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LoginMouseExited

        jButton_Login.setBackground(new Color(138,25,255));
    }//GEN-LAST:event_jButton_LoginMouseExited

    private void jButton_LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LoginMouseEntered

        jButton_Login.setBackground(new Color(88,0,178));
    }//GEN-LAST:event_jButton_LoginMouseEntered

    private void jLabelRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelRegisterMouseExited

    private void jLabelRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelRegisterMouseEntered

    private void jLabelRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterMouseClicked
        RegisterForm rgf = new RegisterForm();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelRegisterMouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       RegisterForm rgf = new RegisterForm();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Login;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}