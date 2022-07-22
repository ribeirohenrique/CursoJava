package application;

import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DB.getConnection();
            preparedStatement = connection.prepareStatement(
                    "UPDATE SELLER " +
                            "SET BaseSalary = BaseSalary + ?" +
                            "WHERE " +
                            "(DepartmentId = ?)");

            preparedStatement.setDouble(1, 200.0);
            preparedStatement.setInt(2, 2);

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Done, Rows Affected: " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }

    }
}
