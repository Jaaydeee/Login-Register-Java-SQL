
package com.mycompany.jaydee;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;


public class About extends javax.swing.JFrame {
    
    private Timer fadeInTimer;
    private float currentAlpha = 0.0f;
    private final float targetAlpha = 1.0f;
    private final int animationDuration = 5000; 
   

public About() {
    initComponents();

    fadeInTimer = new Timer(16, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (currentAlpha < targetAlpha) {
                currentAlpha += 0.01f; 
                int alphaValue = (int) (255 * currentAlpha);
                if (alphaValue > 255) {
                    alphaValue = 255; 
                }
                txt1.setForeground(new Color(255, 255, 255, alphaValue));
                 txt2.setForeground(new Color(102,102,102, alphaValue));
                 txt3.setForeground(new Color(102,102,102, alphaValue));
                 txt4.setForeground(new Color(0,0,0, alphaValue));
                 txt5.setForeground(new Color(102,102,102, alphaValue));
                 txt6.setForeground(new Color(0,0,0, alphaValue));
                 txt7.setForeground(new Color(102,102,102, alphaValue));
                 txt8.setForeground(new Color(0,0,0, alphaValue));
                 txt9.setForeground(new Color(102,102,102, alphaValue));
                 txt10.setForeground(new Color(0,0,0, alphaValue));
                 txt11.setForeground(new Color(102,102,102, alphaValue));
                 txt12.setForeground(new Color(0,0,0, alphaValue));
                 txt13.setForeground(new Color(102,102,102, alphaValue));
                 txt14.setForeground(new Color(0,0,0, alphaValue));
                 txt15.setForeground(new Color(0,0,0, alphaValue));
                 txt16.setForeground(new Color(0,0,0, alphaValue));
                 txt17.setForeground(new Color(0,0,0, alphaValue));
                 txt18.setForeground(new Color(0,0,0, alphaValue));
                 txt19.setForeground(new Color(0,0,0, alphaValue));
                 txt20.setForeground(new Color(114,114,114, alphaValue));
           
            } else {
                fadeInTimer.stop();
            }
        }
    });

    txt1.setForeground(new Color(255, 255, 255, 0)); 
    txt1.setOpaque(false); 
    txt2.setForeground(new Color(255, 255, 255, 0)); 
    txt2.setOpaque(false);
    txt3.setForeground(new Color(255, 255, 255, 0)); 
    txt3.setOpaque(false); 
     txt4.setForeground(new Color(255, 255, 255, 0)); 
    txt4.setOpaque(false);
     txt5.setForeground(new Color(255, 255, 255, 0)); 
    txt5.setOpaque(false);
     txt6.setForeground(new Color(255, 255, 255, 0)); 
    txt6.setOpaque(false);
     txt7.setForeground(new Color(255, 255, 255, 0)); 
    txt7.setOpaque(false);
     txt8.setForeground(new Color(255, 255, 255, 0)); 
    txt8.setOpaque(false);
     txt9.setForeground(new Color(255, 255, 255, 0)); 
    txt9.setOpaque(false);
     txt10.setForeground(new Color(255, 255, 255, 0)); 
    txt10.setOpaque(false);
     txt11.setForeground(new Color(255, 255, 255, 0)); 
    txt11.setOpaque(false);
     txt12.setForeground(new Color(255, 255, 255, 0)); 
    txt12.setOpaque(false);
     txt13.setForeground(new Color(255, 255, 255, 0)); 
    txt13.setOpaque(false);
     txt14.setForeground(new Color(255, 255, 255, 0)); 
    txt14.setOpaque(false);
    txt15.setForeground(new Color(255, 255, 255, 0)); 
    txt15.setOpaque(false);
    txt16.setForeground(new Color(255, 255, 255, 0)); 
    txt16.setOpaque(false);
    txt17.setForeground(new Color(255, 255, 255, 0)); 
    txt17.setOpaque(false);
    txt18.setForeground(new Color(255, 255, 255, 0)); 
    txt18.setOpaque(false);
    txt19.setForeground(new Color(255, 255, 255, 0)); 
    txt19.setOpaque(false);
    txt20.setForeground(new Color(255, 255, 255, 0)); 
    txt20.setOpaque(false);
    
    startFadeInAnimation(); 
}
    private void startFadeInAnimation() {
        fadeInTimer.start();
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt2 = new javax.swing.JLabel();
        txt19 = new javax.swing.JLabel();
        txt15 = new javax.swing.JLabel();
        txt16 = new javax.swing.JLabel();
        txt17 = new javax.swing.JLabel();
        txt18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        txt6 = new javax.swing.JLabel();
        txt7 = new javax.swing.JLabel();
        txt8 = new javax.swing.JLabel();
        txt9 = new javax.swing.JLabel();
        txt10 = new javax.swing.JLabel();
        txt11 = new javax.swing.JLabel();
        txt12 = new javax.swing.JLabel();
        txt13 = new javax.swing.JLabel();
        txt14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(107, 0, 215));

        jLabelClose.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(204, 204, 204));
        jLabelClose.setText("X");
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(204, 204, 204));
        jLabelMin.setText("-");
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("<- Back");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1249, Short.MAX_VALUE)
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
                    .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1373, 27);

        txt1.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setText("ABOUT");
        getContentPane().add(txt1);
        txt1.setBounds(580, 100, 220, 60);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        txt2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txt2.setForeground(new java.awt.Color(102, 102, 102));
        txt2.setText("About to Amount");
        jPanel1.add(txt2);
        txt2.setBounds(260, 30, 140, 23);

        txt19.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txt19.setText("together with this for organizational growth.\"");
        jPanel1.add(txt19);
        txt19.setBounds(50, 150, 240, 30);

        txt15.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txt15.setText("it is platform for efficient and user-friendly organization management. Designed with administrators and");
        jPanel1.add(txt15);
        txt15.setBounds(60, 70, 520, 30);

        txt16.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txt16.setText("team leaders in mind, it simplifies the process of tracking and organizing your people, whether they are students,");
        jPanel1.add(txt16);
        txt16.setBounds(40, 90, 570, 30);

        txt17.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txt17.setText("employees, or team members. With easy registration and login options, you can quickly set up your account and ");
        jPanel1.add(txt17);
        txt17.setBounds(50, 110, 570, 30);

        txt18.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txt18.setText(" start building your tables to manage your workforce or students effectively. Collaborate, expand, and succeed ");
        jPanel1.add(txt18);
        txt18.setBounds(40, 120, 570, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(80, 270, 650, 220);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        txt3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txt3.setForeground(new java.awt.Color(102, 102, 102));
        txt3.setText("User Guides :");
        jPanel2.add(txt3);
        txt3.setBounds(30, 30, 80, 18);

        txt4.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txt4.setText("Develop easy-to-follow tutorials to help users navigate the platform.");
        jPanel2.add(txt4);
        txt4.setBounds(50, 60, 370, 15);

        txt5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txt5.setForeground(new java.awt.Color(102, 102, 102));
        txt5.setText("Contact Info:");
        jPanel2.add(txt5);
        txt5.setBounds(30, 100, 80, 18);

        txt6.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txt6.setText("Include a contact form or email address for user inquiries.");
        jPanel2.add(txt6);
        txt6.setBounds(50, 130, 350, 15);

        txt7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txt7.setForeground(new java.awt.Color(102, 102, 102));
        txt7.setText("Search and Filters:");
        jPanel2.add(txt7);
        txt7.setBounds(30, 170, 120, 18);

        txt8.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txt8.setText("Add search and filter options for efficient data retrieval.");
        jPanel2.add(txt8);
        txt8.setBounds(40, 200, 420, 15);

        txt9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txt9.setForeground(new java.awt.Color(102, 102, 102));
        txt9.setText("User Dashboard:");
        jPanel2.add(txt9);
        txt9.setBounds(30, 240, 100, 18);

        txt10.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txt10.setText("Enhance the dashboard for intuitive personnel management.");
        jPanel2.add(txt10);
        txt10.setBounds(50, 270, 350, 15);

        txt11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txt11.setForeground(new java.awt.Color(102, 102, 102));
        txt11.setText("Permissions:");
        jPanel2.add(txt11);
        txt11.setBounds(30, 310, 80, 18);

        txt12.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txt12.setText("Implement role-based access control for different user privileges.");
        jPanel2.add(txt12);
        txt12.setBounds(50, 350, 360, 15);

        txt13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txt13.setForeground(new java.awt.Color(102, 102, 102));
        txt13.setText("Data Management:");
        jPanel2.add(txt13);
        txt13.setBounds(30, 390, 130, 18);

        txt14.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txt14.setText("Enable data import, export, and backup features.");
        jPanel2.add(txt14);
        txt14.setBounds(60, 420, 360, 15);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(840, 270, 440, 470);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banner3.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), null, null));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 20, 1380, 210);

        txt20.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N
        txt20.setForeground(new java.awt.Color(114, 114, 114));
        txt20.setText("contact us drectly : 07902826544");
        getContentPane().add(txt20);
        txt20.setBounds(1100, 740, 170, 30);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nature-To-Nurture-Background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 10, 1380, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        LandForm2 rgf = new LandForm2();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt10;
    private javax.swing.JLabel txt11;
    private javax.swing.JLabel txt12;
    private javax.swing.JLabel txt13;
    private javax.swing.JLabel txt14;
    private javax.swing.JLabel txt15;
    private javax.swing.JLabel txt16;
    private javax.swing.JLabel txt17;
    private javax.swing.JLabel txt18;
    private javax.swing.JLabel txt19;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt20;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt7;
    private javax.swing.JLabel txt8;
    private javax.swing.JLabel txt9;
    // End of variables declaration//GEN-END:variables
}
