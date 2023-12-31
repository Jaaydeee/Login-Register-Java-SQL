package com.mycompany.jaydee;


import com.mysql.cj.protocol.Resultset;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
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
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
        
        
        ButtonGroup bg = new ButtonGroup(); 
        bg.add(jRadioButtonMale); 
        bg.add(jRadioButtonFemale);
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // </editor-fold>
 
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabelClose1 = new javax.swing.JLabel();
        jLabelMin1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldLastname = new javax.swing.JTextField();
        jTextFieldFirstname = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldUsername = new javax.swing.JTextField();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButtonRegister = new javax.swing.JButton();
        jPasswordFieldPassword2 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabelClose2 = new javax.swing.JLabel();
        jLabelMin2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel5.setBackground(new java.awt.Color(107, 0, 215));

        jLabelClose1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelClose1.setText("X");
        jLabelClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClose1MouseClicked(evt);
            }
        });

        jLabelMin1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabelMin1.setText("-");
        jLabelMin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMin1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin1)
                .addGap(33, 33, 33)
                .addComponent(jLabelClose1)
                .addGap(28, 28, 28))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClose1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 1370, 25);

        jPanel2.setBackground(new java.awt.Color(226, 226, 226));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(107, 0, 215));
        jLabel7.setText("Username :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(150, 270, 110, 23);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(107, 0, 215));
        jLabel9.setText("Email :");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(150, 210, 110, 23);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(107, 0, 215));
        jLabel11.setText("First Name :");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(150, 80, 110, 30);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(107, 0, 215));
        jLabel8.setText("Last Name :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(150, 150, 110, 30);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(107, 0, 215));
        jLabel10.setText("Password :");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(150, 320, 110, 40);

        jTextFieldLastname.setBackground(new java.awt.Color(242, 242, 242));
        jTextFieldLastname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldLastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldLastnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldLastnameFocusLost(evt);
            }
        });
        jTextFieldLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastnameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldLastname);
        jTextFieldLastname.setBounds(300, 140, 300, 30);

        jTextFieldFirstname.setBackground(new java.awt.Color(242, 242, 242));
        jTextFieldFirstname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldFirstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFirstnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldFirstnameFocusLost(evt);
            }
        });
        jTextFieldFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFirstnameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldFirstname);
        jTextFieldFirstname.setBounds(300, 80, 300, 30);

        jTextFieldEmail.setBackground(new java.awt.Color(242, 242, 242));
        jTextFieldEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldEmailFocusLost(evt);
            }
        });
        jPanel2.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(300, 200, 300, 30);

        jTextFieldUsername.setBackground(new java.awt.Color(242, 242, 242));
        jTextFieldUsername.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jTextFieldUsername.setForeground(new java.awt.Color(107, 0, 215));
        jTextFieldUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldUsernameFocusLost(evt);
            }
        });
        jPanel2.add(jTextFieldUsername);
        jTextFieldUsername.setBounds(300, 260, 300, 30);

        jPasswordFieldPassword.setBackground(new java.awt.Color(242, 242, 242));
        jPasswordFieldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldPasswordFocusLost(evt);
            }
        });
        jPasswordFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordFieldPassword);
        jPasswordFieldPassword.setBounds(300, 320, 300, 30);

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(107, 0, 215));
        jLabel12.setText("Retype Password :");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(150, 380, 160, 40);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(107, 0, 215));
        jLabel13.setText("Gender :");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(150, 500, 90, 20);

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(107, 0, 215));
        jLabel14.setText("Address :");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(150, 440, 110, 40);

        jButtonRegister.setBackground(new java.awt.Color(107, 0, 215));
        jButtonRegister.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonRegister.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegister.setText("Sign Up");
        jButtonRegister.setAutoscrolls(true);
        jButtonRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRegisterMouseExited(evt);
            }
        });
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonRegister);
        jButtonRegister.setBounds(340, 550, 210, 60);

        jPasswordFieldPassword2.setBackground(new java.awt.Color(242, 242, 242));
        jPasswordFieldPassword2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldPassword2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldPassword2FocusLost(evt);
            }
        });
        jPasswordFieldPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPassword2ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordFieldPassword2);
        jPasswordFieldPassword2.setBounds(300, 380, 300, 30);

        jTextAreaAddress.setBackground(new java.awt.Color(242, 242, 242));
        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextAreaAddress.setRows(5);
        jTextAreaAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextAreaAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAreaAddressFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaAddress);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(300, 440, 300, 30);

        jRadioButtonMale.setForeground(new java.awt.Color(107, 0, 215));
        jRadioButtonMale.setText("Male");
        jRadioButtonMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMaleActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButtonMale);
        jRadioButtonMale.setBounds(370, 500, 50, 21);

        jRadioButtonFemale.setForeground(new java.awt.Color(107, 0, 215));
        jRadioButtonFemale.setText("Female");
        jPanel2.add(jRadioButtonFemale);
        jRadioButtonFemale.setBounds(450, 500, 70, 21);

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("By signing up, you agree in this site's");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(340, 630, 210, 15);

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 255));
        jLabel17.setText("Terms and Condtions");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(330, 640, 120, 30);

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("and");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(450, 640, 30, 30);

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 255));
        jLabel19.setText("Privacy Policy");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(480, 640, 90, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Coloring dark1 (1).jpg"))); // NOI18N
        jPanel2.add(jLabel15);
        jLabel15.setBounds(0, 670, 680, 200);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(107, 0, 215));
        jLabel2.setText("Sign up Now!");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(380, 450, 200, 60);

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(140, 140, 140));
        jLabel3.setText("Tomorrow is always fresh, with no mistakes in yet");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(320, 530, 340, 20);

        jLabelLogin.setFont(new java.awt.Font("Calibri Light", 2, 13)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(107, 0, 215));
        jLabelLogin.setText("already have account? Click here.");
        jLabelLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLoginMouseClicked(evt);
            }
        });
        jPanel3.add(jLabelLogin);
        jLabelLogin.setBounds(390, 620, 180, 17);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Sign up Now!");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(380, 460, 210, 50);

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("___________________________________________________");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(350, 580, 270, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/signin-image.png"))); // NOI18N
        jPanel3.add(jLabel1);
        jLabel1.setBounds(350, 60, 310, 390);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(550, 0, 820, 880);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Coloring dark1 (1).jpg"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, -10, 660, 690);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 20, 1370, 880);

        jPanel4.setBackground(new java.awt.Color(107, 0, 215));
        jPanel4.setLayout(null);

        jLabelClose.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelClose.setText("X");
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        jPanel4.add(jLabelClose);
        jLabelClose.setBounds(1337, 6, 8, 13);

        jLabelMin.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabelMin.setText("-");
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });
        jPanel4.add(jLabelMin);
        jLabelMin.setBounds(1296, 3, 8, 13);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 0, 0);

        jPanel6.setBackground(new java.awt.Color(107, 0, 215));
        jPanel6.setLayout(null);

        jLabelClose2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelClose2.setText("X");
        jLabelClose2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClose2MouseClicked(evt);
            }
        });
        jPanel6.add(jLabelClose2);
        jLabelClose2.setBounds(1337, 6, 8, 13);

        jLabelMin2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabelMin2.setText("-");
        jLabelMin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMin2MouseClicked(evt);
            }
        });
        jPanel6.add(jLabelMin2);
        jLabelMin2.setBounds(1296, 3, 8, 13);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastnameActionPerformed

    private void jTextFieldFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFirstnameActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed

        String fname = jTextFieldFirstname.getText();
        String lname = jTextFieldLastname.getText();
        String email = jTextFieldEmail.getText();
        String username = jTextFieldUsername.getText();
        String address = jTextAreaAddress.getText();
        String pass1 = String.valueOf(jPasswordFieldPassword.getPassword());
        String pass2 = String.valueOf(jPasswordFieldPassword2.getPassword());
        String gender = "Male";
        
        if(jRadioButtonFemale.isSelected()){
            gender = "Female";
        }
        
        if(verifyFields())
        {
            if(!checkUsername(username))
            {
                PreparedStatement ps;
                Resultset rs;
                String registerUserQuery = "INSERT INTO users(firstname, lastname, email, username, password, address, gender) VALUES (?,?,?,?,?,?,?)";
                
                try {
                   
                    ps = My_CNX.getConnection().prepareStatement(registerUserQuery);
                    ps.setString(1, fname);
                    ps.setString(2, lname);
                    ps.setString(3, email);
                    ps.setString(4, username);
                    ps.setString(5, pass1);
                    ps.setString(6, address);
                    ps.setString(7, gender);
                    
                    //Save the image as Blob in database
               
                    if(ps.executeUpdate() != 0 ){
                        JOptionPane.showMessageDialog(null, "Your account has been Created");
                    }else{
                        JOptionPane.showMessageDialog(null, "Error Check your Information");
                    }
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }      
        
        
        
        
        
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jLabelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginMouseClicked
        Loginform rgf = new Loginform();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelLoginMouseClicked

    private void jButtonRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegisterMouseEntered
        
         jButtonRegister.setBackground(new Color(88,0,178));
        
    }//GEN-LAST:event_jButtonRegisterMouseEntered

    private void jButtonRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegisterMouseExited
      
         jButtonRegister.setBackground(new Color(138,25,255));
        
    }//GEN-LAST:event_jButtonRegisterMouseExited

    private void jPasswordFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordActionPerformed
       
  
        
    }//GEN-LAST:event_jPasswordFieldPasswordActionPerformed

    private void jPasswordFieldPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPassword2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPassword2ActionPerformed

    private void jTextFieldFirstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFirstnameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFirstnameFocusGained

    private void jTextFieldFirstnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFirstnameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFirstnameFocusLost

    private void jTextFieldLastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldLastnameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastnameFocusGained

    private void jTextFieldLastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldLastnameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastnameFocusLost

    private void jTextFieldEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailFocusGained

    private void jTextFieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailFocusLost

    private void jTextFieldUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsernameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameFocusGained

    private void jTextFieldUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsernameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameFocusLost

    private void jPasswordFieldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPasswordFocusGained

    private void jPasswordFieldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPasswordFocusLost

    private void jPasswordFieldPassword2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldPassword2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPassword2FocusGained

    private void jPasswordFieldPassword2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldPassword2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPassword2FocusLost

    private void jTextAreaAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAreaAddressFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAreaAddressFocusGained

    private void jTextAreaAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAreaAddressFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAreaAddressFocusLost

    private void jRadioButtonMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMaleActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose1MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelClose1MouseClicked

    private void jLabelMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMin1MouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMin1MouseClicked

    private void jLabelClose2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose2MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelClose2MouseClicked

    private void jLabelMin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMin2MouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMin2MouseClicked

    public boolean verifyFields()
    {
    String fname = jTextFieldFirstname.getText();
    String lname = jTextFieldLastname.getText();
    String email = jTextFieldEmail.getText();
    String uname = jTextFieldUsername.getText();
    String pass1 = String.valueOf(jPasswordFieldPassword.getPassword());
    String pass2 = String.valueOf(jPasswordFieldPassword2.getPassword());
    String address = jTextAreaAddress.getText();
    
    if(fname.trim().equals("") || lname.trim().equals("")|| email.trim().equals("")|| uname.trim().equals("")|| 
        pass1.trim().equals("") || pass2.trim().equals("") || address.trim().equals("")) 
               
       {
        JOptionPane.showMessageDialog(null, "One or more fields are empty", "Empty Fields", 2);
         return false;
       }
           
           else if(!pass1.equals(pass2))
        {
           JOptionPane.showMessageDialog(null, "Password Doensn't Match", "Confirm Password", 2);
           return false;
        }
        else{
               
        return true;
       }
    }
    
        public boolean checkUsername(String username){
        
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "SELECT * FROM users WHERE username =?";
        
        try {
            st = My_CNX.getConnection().prepareStatement(query);
            st.setString(1, username);
            rs = st.executeQuery();
            
            if(rs.next()){
                username_exist = true;
                JOptionPane.showMessageDialog(null, "This Username is Already Taken , Choose Another One", "Username Failed",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return username_exist;
        
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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelClose1;
    private javax.swing.JLabel jLabelClose2;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelMin1;
    private javax.swing.JLabel jLabelMin2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JPasswordField jPasswordFieldPassword2;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstname;
    private javax.swing.JTextField jTextFieldLastname;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables


}
