package Controller;  

import javax.swing.JOptionPane;

/**
 * Controller class responsible for handling login authentication.
 * Validates admin credentials and manages login-related UI interactions.
 * 
 * @author giria
 */
public class LoginController {
    
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "123";
    
    /**
     * Validates admin login credentials.
     * Checks if the provided username and password match the predefined admin credentials.
     * Logs the result to console for debugging purposes.
     * 
     * @param username The username entered by the user
     * @param password The password entered by the user
     * @return true if credentials are valid, false otherwise
     */
    public static boolean validateAdmin(String username, String password) {
        
        boolean isValid = (ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password));
        
        if (!isValid) {
            System.out.println("Login failed. Username: " + username + ", Password: " + password);
        } else {
            System.out.println("Admin login successful!");
        }
        
        return isValid;
    }
    
    /**
     * Displays a login error dialog to the user.
     * Shows a modal error message when invalid credentials are entered.
     * 
     * @param parent The parent JFrame to center the dialog on
     */
    public static void showLoginError(javax.swing.JFrame parent) {
        JOptionPane.showMessageDialog(parent, "Invalid username or password!", "Login Error", JOptionPane.ERROR_MESSAGE);
    }
}