import java.sql.*;

public class DisplayStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "your_mysql_password"; // Change it to your actual password

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Course: " + rs.getString("course") +
                        ", Marks: " + rs.getInt("marks"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
