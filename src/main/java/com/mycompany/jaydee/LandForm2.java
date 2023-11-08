/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jaydee;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rica
 */
public class LandForm2 extends javax.swing.JFrame {
    private Timer fadeTimer; 

    /**
     * Creates new form LandForm2
     */
    public LandForm2() {
    initComponents();
    LoadEmployeeNo();
    Fetch();

           int totalDuration = 3000;
        // Calculate the step size based on the total duration and the timer interval
        int alphaStep = 255 * 50 / totalDuration;

        // Set the text color to white
        fadingLabel.setForeground(new Color(255, 255, 255));

        // Add a Timer for fading animation
        fadeTimer = new Timer(50, new ActionListener() {
            int alpha = 0;
            boolean fadingIn = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (fadingIn) {
                    if (alpha < 255) {
                        alpha += alphaStep;
                        alpha = Math.min(alpha, 255); // Ensure alpha doesn't exceed 255
                        fadingLabel.setForeground(new Color(255, 255, 255, alpha)); // White color
                    } else {
                        fadingIn = false;
                    }
                } else {
                    if (alpha > 0) {
                        alpha -= alphaStep;
                        alpha = Math.max(alpha, 0); // Ensure alpha doesn't go below 0
                        fadingLabel.setForeground(new Color(255, 255, 255, alpha)); // White color
                    } else {
                        fadingIn = true;
                        fadeTimer.stop(); // Stop the timer after fade-out
                        fadingLabel.setVisible(false); // Hide the text component
                    }
                }
            }
        });

        fadeTimer.start();
    }
     Connection con;
     PreparedStatement pst;
     ResultSet rs;
     
public class My_CNX {
    
    private static String servername = "jdbc:mysql://127.0.0.1/users_db";
    private static String username = "root";
    private static String password = "";

    public static Connection getConnection() {
        Connection cnx = null;
        
        MysqlDataSource dataSource = new MysqlDataSource();
        
          dataSource.setURL(servername);
          dataSource.setUser(username);
          dataSource.setPassword(password);

        try {
            cnx = dataSource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cnx;
    }
}

     public void LoadEmployeeNo(){
         
        try {
            pst = com.mycompany.jaydee.My_CNX.getConnection().prepareStatement("SELECT id FROM crud");
            rs = pst.executeQuery();
            txtEmpid.removeAllItems();
            while(rs.next()){
                txtEmpid.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LandForm2.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
     
     
     private void Fetch(){
        try {
            int q;
            pst = com.mycompany.jaydee.My_CNX.getConnection().prepareStatement("SELECT * FROM crud");
            rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            q = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel)jTable.getModel();
            df.setRowCount(0);
            while(rs.next()){
            Vector v2 = new Vector();
            for(int a=1; a<=q; a++){
                    v2.add(rs.getString("id"));
                     v2.add(rs.getString("firstname"));
                      v2.add(rs.getString("lastname"));
                       v2.add(rs.getString("username"));
                        v2.add(rs.getString("email"));
                         v2.add(rs.getString("phoneno"));
                          v2.add(rs.getString("gender"));
                           v2.add(rs.getString("manager"));
                            v2.add(rs.getString("project"));
                             v2.add(rs.getString("due"));
            }
            df.addRow(v2);
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(LandForm2.class.getName()).log(Level.SEVERE, null, ex);
        }
            
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        txtEmpid = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtManager = new javax.swing.JTextField();
        txtProject = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        fadingLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1500));
        getContentPane().setLayout(null);

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
                .addContainerGap(1293, Short.MAX_VALUE)
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
        jPanel3.setBounds(0, 0, 1370, 25);

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
        jPanel1.setLayout(null);

        jTable.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Firstname", "Lastname", "Username", "Email", "Phone no.", "Gender", "Manager", "Project", "Due Date"
            }
        ));
        jTable.setRowHeight(40);
        jTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 80, 1060, 510);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel2.setText("Employee's");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 50, 80, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clipart3477367 (2) (1).png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 40, 20, 40);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(40, 590, 1030, 10);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(30, 120, 10, 480);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(240, 160, 1130, 780);

        jPanel9.setBackground(new java.awt.Color(165, 134, 202));
        jPanel9.setLayout(null);

        btnAdd.setText("Add");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnAddFocusGained(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel9.add(btnAdd);
        btnAdd.setBounds(40, 20, 70, 46);

        btnDelete.setText("Delete");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel9.add(btnDelete);
        btnDelete.setBounds(130, 20, 72, 46);

        btnEdit.setText("Update");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel9.add(btnEdit);
        btnEdit.setBounds(40, 80, 70, 45);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton4.setText("i");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton4);
        jButton4.setBounds(130, 80, 70, 45);

        getContentPane().add(jPanel9);
        jPanel9.setBounds(0, 160, 240, 140);

        jPanel4.setBackground(new java.awt.Color(122, 77, 177));
        jPanel4.setLayout(null);

        btnSearch.setText("Search");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel4.add(btnSearch);
        btnSearch.setBounds(70, 290, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emp (1).png"))); // NOI18N
        jPanel4.add(jLabel1);
        jLabel1.setBounds(20, 10, 200, 152);

        jPanel11.setBackground(new java.awt.Color(165, 134, 202));
        jPanel11.setAutoscrolls(true);
        jPanel11.setLayout(null);

        txtUsername.setBackground(new java.awt.Color(204, 204, 204));
        txtUsername.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel11.add(txtUsername);
        txtUsername.setBounds(102, 90, 117, 22);

        txtEmpid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtEmpid.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtEmpid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpidActionPerformed(evt);
            }
        });
        jPanel11.add(txtEmpid);
        txtEmpid.setBounds(102, 50, 117, 22);

        txtEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jPanel11.add(txtEmail);
        txtEmail.setBounds(102, 130, 117, 20);

        txtPhone.setBackground(new java.awt.Color(204, 204, 204));
        txtPhone.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jPanel11.add(txtPhone);
        txtPhone.setBounds(102, 170, 117, 22);

        jLabel3.setText("Emp id :");
        jPanel11.add(jLabel3);
        jLabel3.setBounds(33, 53, 50, 16);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username :");
        jPanel11.add(jLabel4);
        jLabel4.setBounds(21, 93, 80, 16);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email :");
        jPanel11.add(jLabel5);
        jLabel5.setBounds(31, 133, 50, 16);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone no :");
        jPanel11.add(jLabel6);
        jLabel6.setBounds(21, 173, 60, 16);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Manager :");
        jPanel11.add(jLabel7);
        jLabel7.setBounds(21, 210, 60, 16);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Project :");
        jPanel11.add(jLabel8);
        jLabel8.setBounds(31, 250, 50, 24);

        txtManager.setBackground(new java.awt.Color(204, 204, 204));
        txtManager.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jPanel11.add(txtManager);
        txtManager.setBounds(102, 210, 117, 22);

        txtProject.setBackground(new java.awt.Color(204, 204, 204));
        txtProject.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jPanel11.add(txtProject);
        txtProject.setBounds(102, 251, 117, 22);

        jPanel4.add(jPanel11);
        jPanel11.setBounds(0, 300, 240, 310);

        jButton2.setBackground(new java.awt.Color(167, 75, 187));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Logout");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(0, 610, 240, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jeydee-removebg-preview (8).png"))); // NOI18N
        jPanel4.add(jLabel10);
        jLabel10.setBounds(60, 670, 130, 40);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 20, 240, 920);

        fadingLabel.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        fadingLabel.setText("WELCOME TO DASHBOARD");
        getContentPane().add(fadingLabel);
        fadingLabel.setBounds(530, 60, 590, 80);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg (1).jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(240, 20, 1130, 140);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void btnAddFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnAddFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddFocusGained

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        AddAccount acc = new AddAccount();
        acc.setVisible(true);
        acc.pack();
        acc.setLocationRelativeTo(null);
        acc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        try {
            String id = txtEmpid.getSelectedItem().toString();

            // Display a confirmation dialog centered on the screen
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (dialogResult == JOptionPane.YES_OPTION) {
                pst = com.mycompany.jaydee.My_CNX.getConnection().prepareStatement("DELETE FROM crud WHERE id=?");
                pst.setString(1, id);

                int k = pst.executeUpdate();
                if (k == 1) {
                    JOptionPane.showMessageDialog(null, "Record has been successfully Deleted!!");
                    txtUsername.setText("");
                    txtEmail.setText("");
                    txtPhone.setText("");
                    txtManager.setText("");
                    txtProject.setText("");
                    txtUsername.requestFocus();
                    LoadEmployeeNo();
                    Fetch();
                } else {
                    JOptionPane.showMessageDialog(null, "Record Failed to Delete!!");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LandForm2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        About rgf = new About();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        try {
            String username = txtUsername.getText();
            String email = txtEmail.getText();
            String phoneno = txtPhone.getText();
            String manager = txtManager.getText();
            String project = txtProject.getText();
            String id = txtEmpid.getSelectedItem().toString();

            if (username.isEmpty() || email.isEmpty() || phoneno.isEmpty() || manager.isEmpty() || project.isEmpty() || id.isEmpty()) {
                // Show an error message if any of the fields is empty
                JOptionPane.showMessageDialog(null, "Empty field. Please fill in all the fields.");
            } else {
                pst = com.mycompany.jaydee.My_CNX.getConnection().prepareStatement("UPDATE crud SET username=?, email=?, phoneno=?, manager=?, project=? WHERE id = ?");

                pst.setString(1, username);
                pst.setString(2, email);
                pst.setString(3, phoneno); // Assuming phoneno is a string
                pst.setString(4, manager);
                pst.setString(5, project);
                pst.setString(6, id);

                int k = pst.executeUpdate();
                if (k == 1) {
                    JOptionPane.showMessageDialog(null, "Record has been successfully updated!!");
                    txtUsername.setText("");
                    txtEmail.setText("");
                    txtPhone.setText("");
                    txtManager.setText("");
                    txtProject.setText("");
                    txtUsername.requestFocus();
                    LoadEmployeeNo();
                    Fetch();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LandForm2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        try {
            String id = txtEmpid.getSelectedItem().toString();

            pst = com.mycompany.jaydee.My_CNX.getConnection().prepareStatement("SELECT * FROM crud WHERE id=?");
            pst.setString(1, id);
            rs = pst.executeQuery();

            if (rs.next()==true){
                txtUsername.setText(rs.getString(4));
                txtEmail.setText(rs.getString(5));
                txtPhone.setText(rs.getString(6));
                txtManager.setText(rs.getString(8));
                txtProject.setText(rs.getString(9));

            }else{
                JOptionPane.showMessageDialog(null, "No record found!!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LandForm2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Loginform rgf = new Loginform();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtEmpidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpidActionPerformed

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
            java.util.logging.Logger.getLogger(LandForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LandForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LandForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LandForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LandForm2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel fadingLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JComboBox<String> txtEmpid;
    private javax.swing.JTextField txtManager;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtProject;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
