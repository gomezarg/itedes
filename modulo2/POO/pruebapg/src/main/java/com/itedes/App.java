package com.itedes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String args[]) {
        try { 
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection(
        "jdbc:postgresql://localhost:5432/pedidos",
        "dba", 
        "1234"
        );

        System.out.println("Conexion establecida");

        Statement statement = connection.createStatement();

        //String queryString = "INSERT INTO categorias (categoriaid, nombrecat) "
        //+ "VALUES(800, 'GOLOSINAS');";

        //statement.executeUpdate(queryString);

        ResultSet resultSet = statement.executeQuery("SELECT * FROM categorias;");

        System.out.println("Categorias presentes en la base de datos:");
        System.out.println("========== ========= == == ==== == =====");
        System.out.println();

        while(resultSet.next()) {
        Integer categoriaid = resultSet.getInt("categoriaid");
        String nombrecat = resultSet.getString("nombrecat");

        System.out.println("ID = " + categoriaid);
        System.out.println("NOMBRE = " + nombrecat);
        System.out.println();
        }

        resultSet.close();

        statement.close();

        connection.close();
        } catch (Exception e) {
        System.out.println("Ha ocurrido un error");

        e.printStackTrace();

        System.err.println(e.getClass().getName() + ": " + e.getMessage());

        System.exit(0);
        }
    }
}