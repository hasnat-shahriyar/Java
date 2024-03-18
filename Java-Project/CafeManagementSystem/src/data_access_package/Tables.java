// Tables.java
package data_access_package;

import javax.swing.JOptionPane;

public class Tables {

    public static void main(String[] args) {
        try {
            String userTable = "CREATE TABLE users (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(200), email VARCHAR(200), password VARCHAR(200), status VARCHAR(20), UNIQUE (email))";
            String adminDetails = "INSERT INTO users (name, email, password, status) VALUES ('Admin', 'admin@email.com', 'admin', 'true')";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key, name varchar(200))";
            String productTable = "create table product(id int AUTO_INCREMENT primary key, name varchar(200), category varchar(200), price varchar(200))";
            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
            DbOperations.setDataOrDelete(adminDetails, "Admin details added Successfully!");
            DbOperations.setDataOrDelete(categoryTable, "Category Table Created Successfully!");
            DbOperations.setDataOrDelete(productTable, "Product Table Created Successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

