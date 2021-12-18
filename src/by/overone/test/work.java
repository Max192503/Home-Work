package by.overone.test;

import java.sql.*;

public class work {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/library";
        String user = "root";
        String password = "192503";

        Connection connection = DriverManager.getConnection(url, user, password);

        Statement statement =connection.createStatement();
        ResultSet resultSet= statement.executeQuery("SElECT * FROM library.library");
        while (resultSet.next()){
            System.out.println(resultSet.getString("title"));
            System.out.println(resultSet.getString("author"));
        }
    }
}
