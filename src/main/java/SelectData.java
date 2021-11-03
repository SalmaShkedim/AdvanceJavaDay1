import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.sql.*;

public class SelectData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        PrintWriter writer = new PrintWriter("EmployeeDetails.txt", StandardCharsets.UTF_8);

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
        System.out.println("Connection Establish Successfully");

        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM EmployeeDetails;";
        ResultSet resultSet= statement.executeQuery(sql);
        while(resultSet.next()) {
            writer.println("Employee Details : ");
            writer.println("ID : " + resultSet.getString(1));
            writer.println("NAME : " + resultSet.getString(2));
            writer.println("AGE : " + resultSet.getString(3));
            writer.println("DEPT : " + resultSet.getString(4));
            writer.println("DESIG : " + resultSet.getString(5));
            writer.println("QUALIFICATION : " + resultSet.getString(6));
            writer.println("EMAIL_ID : " + resultSet.getString(7));
            writer.println("CONTACT : " + resultSet.getString(8));
            writer.println("SALARY : " + resultSet.getString(9));
            writer.println("TOTAL_YEARS_OF_EXP : " + resultSet.getString(10));

        }
        writer.close();
        connection.close();
        System.out.println("File Created");
    }
}
