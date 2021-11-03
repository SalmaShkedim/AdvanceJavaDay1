import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Update Of Employee details  : ");
        System.out.println("Enter The Employee ID : ") ;String ID = scanner.next() ;
        System.out.println("Enter The Column Name  : ") ;String Column = scanner.next() ;
        System.out.println("Enter The Column Value You Want To Change: ") ;String VALUE_C = scanner.next() ;

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
        System.out.println("Connection Establish Successfully");

        Statement statement = connection.createStatement();
        String sql = "Update EmployeeDetails SET "+Column+" = "+VALUE_C+" WHERE ID = "+ID+" ;";
        statement.executeUpdate(sql);
        System.out.println("Table Updated Successfully");
        connection.close();
    }
}
