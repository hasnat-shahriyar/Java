package data_access_package;

import model.User;
import javax.swing.JOptionPane;
import java.sql.*;

public class UserDAO {
    public static void save(User user) {
        String query = "INSERT INTO users (name, email, password, status) VALUES ('" + user.getName() + "', '" + user.getEmail() + "', '" + user.getPassword() + "', 'false')";
        DbOperations.setDataOrDelete(query, "Registered Successfully!");
    }
    
    public static User login(String email, String password) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("SELECT * FROM users WHERE email='" + email + "' AND password='" + password + "'");
            if (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return user;
    }
}
