package data_access_package;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet; // Import for ResultSet
import java.sql.Statement;

public class DbOperations {
    public static void setDataOrDelete(String query, String msg) {
        try {
            Connection con = ConnectionProvider.getCon();
            if (con != null) {
                PreparedStatement pst = con.prepareStatement(query);
                pst.executeUpdate();
                if (!msg.equals(""))
                    JOptionPane.showMessageDialog(null, msg);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to establish connection", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static ResultSet getData(String query){
        try{
            Connection con = ConnectionProvider.getCon(); // Corrected variable name
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
