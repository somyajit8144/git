import java.sql.*;

public class JDBC {
    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db1", 
                "root", 
                "mysql@1234"
            );
            
            // Create statement
            Statement stmt = con.createStatement();
            
            // Execute query
            String sqlQuery = "SELECT * FROM student_table";
            ResultSet rs = stmt.executeQuery(sqlQuery);
            
            // Process results
            while (rs.next()) {
                System.out.println("Result: " + rs.getString(1));
            }
            
            // Close resources
            rs.close();
            stmt.close();
            con.close();
            
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
