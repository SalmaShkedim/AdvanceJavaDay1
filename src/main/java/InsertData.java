import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID : ") ;String ID = scanner.next() ;
        System.out.println("NAME : ") ;String NAME = scanner.next() ;
        System.out.println("AGE : ") ;String AGE = scanner.next() ;
        System.out.println("DEPT : ") ;String DEPT = scanner.next() ;
        System.out.println("DESIG : ") ;String DESIG = scanner.next() ;
        System.out.println("QUALIFICATION : ") ;String QUALIFICATION = scanner.next() ;
        System.out.println("EMAIL_ID : ") ;String EMAIL_ID = scanner.next() ;
        System.out.println("CONTACT : ") ;String CONTACT = scanner.next() ;
        System.out.println("SALARY : ") ;String SALARY = scanner.next() ;
        System.out.println("TOTAL_YEARS_OF_EXP : ") ;String TOTAL_YEARS_OF_EXP = scanner.next() ;

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
        System.out.println("Connection Establish Successfully");

        Statement statement = connection.createStatement();
        String sql = "INSERT INTO EmployeeDetails VALUES("+ID+",'"+NAME+"',"+AGE+",'"+DEPT+"','"+DESIG+"','"+QUALIFICATION+"','"+EMAIL_ID+"',"+CONTACT+","+SALARY+","+TOTAL_YEARS_OF_EXP+")";
        int result = statement.executeUpdate(sql);
        if (result==1) {
            System.out.println("Transaction IS Successful");
        }else{
            System.out.println("Transaction Failed");
        }
        System.out.println("Table Updated Successfully");
        connection.close();
    }
}


