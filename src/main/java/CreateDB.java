import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstjdbc","root", "root");
        System.out.println("Connection Establish Succesfully");

        Statement statement = connection.createStatement();
        String sql = "Create DataBase employee";
        statement.executeUpdate(sql);
        System.out.println("DataBase Created successfully");
        connection.close();

    }
}
