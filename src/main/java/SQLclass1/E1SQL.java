package SQLclass1;

import java.sql.*;

public class E1SQL {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String userName = "syntax_hrm";
        String password = "syntaxhrm123";
        try {
            //we need to create connection to connect to the database first
            Connection connection = DriverManager.getConnection(dbUrl,userName,password);
            //takes your queries, executes them to database and brings the results back
            Statement statement = connection.createStatement();
            String query = "select * from person";
            //results contains the result  of the query that we executed on the database in the form of tbl
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                String firstName = resultSet.getString("FirstName");
                int age = resultSet.getInt("age");
                String city = resultSet.getString("City");
                System.out.println(firstName+" "+age+" "+city);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
