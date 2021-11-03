import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root", "root");
        System.out.println("Connection Establish Successfully");

        Statement statement = connection.createStatement();
        String sql = "CREATE Table EmployeeDetails(ID INT NOT NULL AUTO_INCREMENT, NAME VARCHAR(20), AGE INT , C VARCHAR(45), DESIG VARCHAR(45), QUALIFICATION VARCHAR(45),EMAIL_ID VARCHAR(45),CONTACT INT, SALARY DECIMAL(18,2), TOTAL_YEARS_OF_EXP INT ,PRIMARY KEY (ID) )";
        statement.executeUpdate(sql);
        System.out.println("Table Created Successfully");
        connection.close();

    }
}
