import java.sql.*;
import java.util.Scanner;

public class CRUDprogram {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        int choice;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
        System.out.println("Connection Establish Successfully");
        Statement statement = connection.createStatement();
        do {
            System.out.println("CRUD Program");
            System.out.println("1 : Add/Insert Values");
            System.out.println("2 : Update Values");
            System.out.println("3 : Delete Values");
            System.out.println("4 : View Values");
            System.out.println("Enter Your Choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    String sql = "INSERT INTO EmployeeDetails VALUES(3,'Akaber', 31,'R&D','Developer','Bagrut','akaber20@gmail.com',34699721,7000,4)";
                    statement.executeUpdate(sql);
                    System.out.println("Successfully Inserted/Added");
                    break;
                case 2:
                    String sql1 = "Update EmployeeDetails SET AGE = 30  WHERE ID = 1 ;";
                    statement.executeUpdate(sql1);
                    System.out.println("Successfully Updated");
                    break;
                case 3:
                    String sql2 = "DELETE FROM EmployeeDetails WHERE ID = 1;";
                    statement.executeUpdate(sql2);
                    System.out.println("Successfully Updated");
                    break;
                case 4:
                    Statement stat = connection.createStatement();
                    String sql3 = "SELECT * FROM EmployeeDetails;";
                    ResultSet resultSet = stat.executeQuery(sql3);
                    while (resultSet.next()) {
                        System.out.println("Employee Details : ");
                        System.out.println("ID : " + resultSet.getString(1));
                        System.out.println("NAME : " + resultSet.getString(2));
                        System.out.println("AGE : " + resultSet.getString(3));
                        System.out.println("DEPT : " + resultSet.getString(4));
                        System.out.println("DESIG : " + resultSet.getString(5));
                        System.out.println("QUALIFICATION : " + resultSet.getString(6));
                        System.out.println("EMAIL_ID : " + resultSet.getString(7));
                        System.out.println("CONTACT : " + resultSet.getString(8));
                        System.out.println("SALARY : " + resultSet.getString(9));
                        System.out.println("TOTAL_YEARS_OF_EXP : " + resultSet.getString(10));
                    }
                    break;
            }
        } while (choice != 5);
        connection.close();

    }
}
