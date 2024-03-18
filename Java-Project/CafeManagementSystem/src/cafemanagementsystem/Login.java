/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafemanagementsystem;

import javax.swing.JOptionPane;
import model.User;
import data_access_package.UserDAO;
import javax.swing.ImageIcon;

/**
 *
 * @author Nahin
 */
public class Login extends javax.swing.JFrame {

    public String emailPattern = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+$";

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        loginBtn.setEnabled(false);
    }

    public void clear() {
        email.setText("");
        password.setText("");
        loginBtn.setEnabled(false);
    }

    public void validateField() {
        String emailText = email.getText(); // Renamed to avoid conflict with instance variable
        String passwordText = new String(password.getPassword()); // Get password correctly from JPasswordField
        if (emailText.matches(emailPattern) && !passwordText.equals("")) {
            loginBtn.setEnabled(true);
        } else {
            loginBtn.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cafetitle = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        emailLabel = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passLabel = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        exitBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        closed = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 102));
        jLabel1.setText("LogIn");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 183, -1));

        cafetitle.setFont(new java.awt.Font("JetBrains Mono", 1, 60)); // NOI18N
        cafetitle.setForeground(new java.awt.Color(204, 0, 102));
        cafetitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cafetitle.setText("ALPINE");
        jPanel1.add(cafetitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 570, 190));

        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 1, 32)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CAFE MANAGEMENT SYSTEM");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 570, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 768));

        emailLabel.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        emailLabel.setText("Email:");
        getContentPane().add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 257, -1, -1));

        email.setBackground(new java.awt.Color(255, 153, 153));
        email.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(153, 0, 102));
        email.setText("your-email");
        email.setCaretColor(new java.awt.Color(255, 153, 153));
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 300, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(255, 153, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 230, 46, 124));

        passLabel.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        passLabel.setText("Password:");
        getContentPane().add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 294, -1, -1));

        password.setBackground(new java.awt.Color(255, 153, 153));
        password.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(153, 0, 102));
        password.setText("password");
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 302, -1));

        exitBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit small.png"))); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 370, -1, 30));

        clearBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, -1, -1));

        loginBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 420, -1, 40));

        closed.setBackground(new java.awt.Color(255, 153, 153));
        closed.setFont(new java.awt.Font("JetBrains Mono", 1, 48)); // NOI18N
        closed.setForeground(new java.awt.Color(153, 0, 102));
        closed.setText("×");
        closed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closedActionPerformed(evt);
            }
        });
        getContentPane().add(closed, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, 80, 40));

        jButton1.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jButton1.setText("SignUp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 98, 40));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 750, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        // TODO add your handling code here:
        email.setText("");
    }//GEN-LAST:event_emailFocusGained

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_emailKeyReleased

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        // TODO add your handling code here:
        password.setText("");
    }//GEN-LAST:event_passwordFocusGained

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_passwordKeyReleased

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you Really Want To Close the Application?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed

        clear();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void closedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closedActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closedActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        String inputEmail = email.getText(); // Renamed variable to resolve conflict
        String inputPassword = new String(password.getPassword()); // Get password correctly from JPasswordField
        User user = UserDAO.login(inputEmail, inputPassword); // Corrected variable names
        if (user == null) {
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">Incorrect Username or Password</b></html>", "Login Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (user.getStatus().equals("false")) { // Changed to compare with string "false"
                ImageIcon icon = new ImageIcon("src/popupicon/wait.png");
                JOptionPane.showMessageDialog(null, "<html><b>Wait for Admin Approval</b></html>", "Message", JOptionPane.INFORMATION_MESSAGE, icon);
                clear();
            }
            if (user.getStatus().equals("true")) {
                setVisible(false);
                // Pass the email to the Home constructor
                new Home(inputEmail).setVisible(true);
            }
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new SignUp().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cafetitle;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton closed;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
