/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giria
 */
package Controller;

import javax.swing.JOptionPane;

public class LoginController {
    
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "123";
    
    public static boolean validateAdmin(String username, String password) {
        
        boolean isValid = ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password);
        
        if (!isValid) {
            System.out.println("Login failed. Username: " + username + ", Password: " + password);
        } else {
            System.out.println("Admin login successful!");
        }
        
        return isValid;
    }
    
    public static void showLoginError(javax.swing.JFrame parent) {
        JOptionPane.showMessageDialog(parent, "Invalid username or password!" + JOptionPane.ERROR_MESSAGE);
    }
}