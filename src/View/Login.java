/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import javax.swing.JOptionPane;

/**
 *
 * @author giria
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginMainPanel = new javax.swing.JPanel();
        registerButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        titlePanel = new javax.swing.JPanel();
        loginTitle = new javax.swing.JLabel();
        loginBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginMainPanel.setBackground(new java.awt.Color(250, 250, 250));

        registerButton.setBackground(new java.awt.Color(255, 255, 0));
        registerButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registerButton.setText("User registration soon!!!");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(255, 255, 0));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        usernameField.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        usernameField.setText("  ");
        usernameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        passwordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        usernameLabel.setText("Username");

        passwordLabel.setText("Password");

        javax.swing.GroupLayout loginMainPanelLayout = new javax.swing.GroupLayout(loginMainPanel);
        loginMainPanel.setLayout(loginMainPanelLayout);
        loginMainPanelLayout.setHorizontalGroup(
            loginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginMainPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(loginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginMainPanelLayout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginMainPanelLayout.createSequentialGroup()
                        .addGroup(loginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginMainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addGroup(loginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(loginMainPanelLayout.createSequentialGroup()
                                .addGroup(loginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameLabel)
                                    .addComponent(passwordLabel))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(35, 35, 35))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginMainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        loginMainPanelLayout.setVerticalGroup(
            loginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginMainPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        getContentPane().add(loginMainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 300, 310));

        titlePanel.setBackground(new java.awt.Color(102, 102, 102));

        loginTitle.setBackground(new java.awt.Color(46, 46, 46));
        loginTitle.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        loginTitle.setForeground(new java.awt.Color(255, 255, 0));
        loginTitle.setText("MOVIE COLLECTION MANAGEMENT SYSTEM");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(loginTitle)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginTitle)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 420, 40));

        loginBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login background.png"))); // NOI18N
        getContentPane().add(loginBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();
    
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both username and password!", "Empty Fields", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (Controller.LoginController.validateAdmin(username, password)) {
            new Admin().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid credentials!", "Login Failed", JOptionPane.ERROR_MESSAGE);
            passwordField.setText("");
            usernameField.setText("");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
         JOptionPane.showMessageDialog(
            Login.this,
            "**Admin Access Only**\n\n" +
            "This system currently supports administrator access only.\n" +
            "User account registration will be available in a future update.\n\n" +
            "Please use admin credentials to login.",
            "Registration Information",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_registerButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel loginBG;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginMainPanel;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
