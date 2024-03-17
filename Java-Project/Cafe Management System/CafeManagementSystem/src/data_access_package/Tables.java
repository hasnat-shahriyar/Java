// Tables.java
package data_access_package;

import javax.swing.JOptionPane;

public class Tables {
    public static void main(String[] args) {
        try {
            String userTable = "CREATE TABLE users (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(200), email VARCHAR(200), password VARCHAR(200), status VARCHAR(20), UNIQUE (email))";
            String adminDetails = "INSERT INTO users (name, email, password, status) VALUES ('Admin', 'admin@email.com', 'admin', 'true')";
            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
            DbOperations.setDataOrDelete(adminDetails, "Admin details added Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}