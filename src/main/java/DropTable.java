import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DropTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Drop Table : ");
        System.out.println("Enter The Name Of Table To Drop  :") ;String TABLE_N = scanner.next() ;

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
        System.out.println("Connection Establish Successfully");

        Statement statement = connection.createStatement();
        String sql = "DROP TABLE "+TABLE_N+";";
        statement.executeUpdate(sql);
        System.out.println("Table Dropped Successfully");
        connection.close();
    }
}
