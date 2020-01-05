package views.dark;

import utils.PasswordUtils;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

import static utils.Constants.LOGIN_ENTER_COLOR;
import static utils.Constants.LOGIN_NORMAL_COLOR;

/**
 * @author Fakhri MF
 */
public class RegisterForm extends javax.swing.JFrame {

    public RegisterForm() {
        initComponents();
        setLocation();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelUsername = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        buttonLogin = new javax.swing.JButton();
        passwordField1 = new javax.swing.JPasswordField();
        labelPassword1 = new javax.swing.JLabel();
        labelPassword2 = new javax.swing.JLabel();
        passwordField3 = new javax.swing.JPasswordField();
        labelPassword3 = new javax.swing.JLabel();
        usernameField1 = new javax.swing.JTextField();
        labelUsername1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMain.setBackground(new java.awt.Color(102, 102, 102));

        panelHeader.setBackground(new java.awt.Color(32, 34, 37));
        panelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(32, 34, 37));

        labelUsername.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(255, 255, 255));
        labelUsername.setText("Nama Lengkap");

        usernameField.setBackground(new java.awt.Color(47, 49, 54));
        usernameField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(255, 255, 255));
        usernameField.setBorder(null);
        usernameField.setCaretColor(new java.awt.Color(255, 255, 255));

        labelPassword.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setText("Username");

        passwordField.setBackground(new java.awt.Color(47, 49, 54));
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(null);
        passwordField.setCaretColor(new java.awt.Color(255, 255, 255));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        buttonLogin.setBackground(new java.awt.Color(85, 99, 233));
        buttonLogin.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin.setText("REGISTER");
        buttonLogin.setBorder(null);
        buttonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonLoginMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonLoginMouseEntered(evt);
            }
        });
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        passwordField1.setBackground(new java.awt.Color(47, 49, 54));
        passwordField1.setForeground(new java.awt.Color(255, 255, 255));
        passwordField1.setBorder(null);
        passwordField1.setCaretColor(new java.awt.Color(255, 255, 255));
        passwordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordField1ActionPerformed(evt);
            }
        });

        labelPassword1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        labelPassword1.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword1.setText("Password");

        labelPassword2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        labelPassword2.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword2.setText("Role");

        passwordField3.setBackground(new java.awt.Color(47, 49, 54));
        passwordField3.setForeground(new java.awt.Color(255, 255, 255));
        passwordField3.setBorder(null);
        passwordField3.setCaretColor(new java.awt.Color(255, 255, 255));
        passwordField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordField3ActionPerformed(evt);
            }
        });

        labelPassword3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        labelPassword3.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword3.setText("Nomor Induk Siswa");

        usernameField1.setBackground(new java.awt.Color(47, 49, 54));
        usernameField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        usernameField1.setForeground(new java.awt.Color(255, 255, 255));
        usernameField1.setBorder(null);
        usernameField1.setCaretColor(new java.awt.Color(255, 255, 255));

        labelUsername1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        labelUsername1.setForeground(new java.awt.Color(255, 255, 255));
        labelUsername1.setText("Email");

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() & ~java.awt.Font.BOLD));
        jLabel1.setForeground(new java.awt.Color(85, 99, 233));
        jLabel1.setText("Already Have Account?");

        jComboBox1.setBackground(new java.awt.Color(32, 34, 37));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelPassword1)
                            .addComponent(labelPassword)
                            .addComponent(labelUsername)
                            .addComponent(usernameField)
                            .addComponent(passwordField)
                            .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPassword2)
                            .addComponent(labelPassword3)
                            .addComponent(labelUsername1)
                            .addComponent(usernameField1)
                            .addComponent(passwordField3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelUsername1)
                        .addGap(58, 58, 58))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelPassword)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelPassword3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelPassword1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelPassword2)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordField1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="UI Listeners">
    private void buttonLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseEntered
        buttonLogin.setBackground(Color.decode(LOGIN_ENTER_COLOR));
    }//GEN-LAST:event_buttonLoginMouseEntered

    private void buttonLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseExited
        buttonLogin.setBackground(Color.decode(LOGIN_NORMAL_COLOR));
    }//GEN-LAST:event_buttonLoginMouseExited

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        testPassword(passwordField.getPassword());
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        testPassword(passwordField.getPassword());
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void passwordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordField1ActionPerformed

    private void passwordField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordField3ActionPerformed
    //</editor-fold>

    // <editor-fold defaultstate="expanded" desc="Functions">
    private void testPassword(char[] password) {
        PasswordUtils passwordUtils = new PasswordUtils();
        byte[] convertedPass = passwordUtils.convert(password);
        String deconvertedPass = passwordUtils.deconvert(convertedPass);
        System.out.println("Unconverted Password : " + Arrays.toString(password));
        System.out.println("Converted Password : " + Arrays.toString(convertedPass));
        System.out.println("Deconverted Password : " + deconvertedPass);
    }

    final public void setLocation() {
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    }
    // </editor-fold>

    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new RegisterForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPassword1;
    private javax.swing.JLabel labelPassword2;
    private javax.swing.JLabel labelPassword3;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel labelUsername1;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JPasswordField passwordField3;
    private javax.swing.JTextField usernameField;
    private javax.swing.JTextField usernameField1;
    // End of variables declaration//GEN-END:variables
}