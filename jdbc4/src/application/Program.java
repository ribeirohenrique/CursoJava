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
            /*
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO SELLER " +
                            "(Name,Email,BirthDate,BaseSalary,DepartmentId)" +
                            "VALUES " +
                            "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, "Carl Purple");
            preparedStatement.setString(2, "carl@gmail.com");

            //Precisa chamar desta maneira quando for passar uma data para o SQL
            preparedStatement.setDate(3, new java.sql.Date(sdf.parse("22/04/1996").getTime()));
            preparedStatement.setDouble(4, 3000.00);
            preparedStatement.setInt(5, 4);
            */

            //Outro Prepared Statement de exemplo
            preparedStatement = connection.prepareStatement("INSERT INTO DEPARTMENT (NAME) VALUES ('D1'), ('D2')",
                    preparedStatement.RETURN_GENERATED_KEYS);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    System.out.println("Done! id = " + id);

                }

            } else {
                System.out.println("No rows affected!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }

    }
}
