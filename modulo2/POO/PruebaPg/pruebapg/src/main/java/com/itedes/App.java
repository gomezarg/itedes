package com.itedes;

import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    private static Connection connection = null;
    private static Statement statement = null;
    private static ResultSet resultSet = null;

    public static void initializeConnection() {
    try {
        Class.forName("org.postgresql.Driver");

        connection = DriverManager.getConnection (
        "jdbc:postgresql://localhost:5432/pedidos",
        "dba", 
        "1234"
        );

        System.out.println("Conexion establecida");

        statement = connection.createStatement();
    } catch(Exception e) {
        System.out.println("Error al conectar");
        }
    }

    private static void closeConnection() {
        try {
            statement.close();
            connection.close();
        } catch(Exception e) {
            System.out.println("Error al desconectar");
        }
    }
    //CLIENTES
    //listar
    public static void listClientes() {
    try {
        resultSet = statement.executeQuery("SELECT * FROM clientes;");

        while(resultSet.next()) {
        Integer clienteid = resultSet.getInt("clienteid");
        String cedula_ruc = resultSet.getString("cedula_ruc");
        String nombrecia = resultSet.getString("nombrecia");
        String nombrecontacto = resultSet.getString("nombrecontacto");
        String direccioncli = resultSet.getString("direccioncli");
        String fax = resultSet.getString("fax");
        String email = resultSet.getString("email");
        String celular = resultSet.getString("celular");
        String fijo = resultSet.getString("fijo");

        System.out.println("ID: " + clienteid + " | CEDULA:" + cedula_ruc + " | NOMBRECIA: " + nombrecia + " | NOMBRE: " + nombrecontacto + " | DIRECCION: " + direccioncli + " | FAX: " + fax + " | EMAIL: " + email + " | CELULAR: " + celular + " | FIJO: " + fijo);
        }

        resultSet.close();
        } catch(Exception e) {
        System.out.println("ERROR AL LISTAR LOS NOMBRES");
        }

    }
    //Agregar cliente
     public static void addCliente(Integer clienteid, String cedula_ruc, String nombrecia , String nombrecontacto , String direccioncli , String fax, String email , String celular , String fijo) {
    try {
        String queryString = "INSERT INTO clientes (clienteid, cedula_ruc, nombrecia, nombrecontacto, direccioncli, fax, email, celular, fijo) "
        + "VALUES(" + clienteid + ", '" + cedula_ruc + ", '" + nombrecia + ", '" + nombrecontacto + ", '" + direccioncli + ", '" + fax + ", '" + email + ", '" + celular + ", '" + fijo + "');";

        statement.executeUpdate(queryString);
        } catch(Exception e) {
        System.out.println("ERROR AL CREAR CLIENTES");
        }
    }
    //________
    public static void listCategorias() {
    try {
        resultSet = statement.executeQuery("SELECT * FROM categorias;");

        while(resultSet.next()) {
        Integer categoriaid = resultSet.getInt("categoriaid");
        String nombrecat = resultSet.getString("nombrecat");

        System.out.println("ID: " + categoriaid + " | NOMBRE:" + nombrecat);
        }

        resultSet.close();
        } catch(Exception e) {
        System.out.println("ERROR AL LISTAR LAS CATEGORIAS");
        }

    }


    public static void addCategoria(Integer categoriaid, String nombrecat) {
    try {
        String queryString = "INSERT INTO categorias (categoriaid, nombrecat) "
        + "VALUES(" + categoriaid + ", '" + nombrecat + "');";

        statement.executeUpdate(queryString);
        } catch(Exception e) {
        System.out.println("ERROR AL CREAR CATEGORIAS");
        }
    }


    public static void removeCategoria(Integer categoriaid) {
    try {
        String queryString = "DELETE FROM categorias WHERE categoriaid = " + categoriaid;

        statement.executeUpdate(queryString);
        } catch(Exception e) {
        System.out.println("ERROR AL CREAR CATEGORIAS");
        }
    }

public static void main(String args[]) {
    initializeConnection();

    Scanner keyboard = new Scanner(System.in);
    Integer opcion;

    do {
        System.out.println("Gestion de Categorias");
        System.out.println("======= == ==========");
        System.out.println();
        System.out.println(" 1) Listar categorias");
        System.out.println(" 2) Agregar categoria");
        System.out.println(" 3) Eliminar categoria");
        System.out.println("======= == ==========");
        System.out.println("Gestion de CLIENTES");
        System.out.println(" 4) Listar clientes");
        System.out.println(" 5) Agregar clientes");
        System.out.println(" 0) salir");
        System.out.println();
        System.out.print("Seleccione una opcion: ");

        try {
            opcion = Integer.parseInt(keyboard.nextLine());
        } catch(Exception e) {
            System.out.println("Ingrese un numero valido");
        opcion = -1;
        continue;
    }

    Integer categoriaid;
    Integer clienteid;

    switch(opcion) {
        case 1:
            System.out.println("Listado de categorias:");
            System.out.println("======= == ==========");
            System.out.println();

            listCategorias();

        break;

        case 2:
            System.out.println("Alta de categoria:");
            System.out.println("==== == =========");
            System.out.println("");

            System.out.print("Ingrese ID: ");

            try {
                categoriaid = Integer.parseInt(keyboard.nextLine());
            } catch(Exception e) {
                System.out.println("Error en el ingreso de datos");
                continue;
        }
            System.out.print("Ingrese Nombre: ");
            String nombrecat = keyboard.nextLine();

            addCategoria(categoriaid, nombrecat);

            break;

        case 3:	
            System.out.print("Ingrese ID: ");

        try {
            categoriaid = Integer.parseInt(keyboard.nextLine());
        } catch(Exception e) {
            System.out.println("Error en el ingreso de datos");
            continue;
        }

        removeCategoria(categoriaid);

        case 4:
            System.out.println("Listado de clientes:");
            System.out.println("======= == ==========");
            System.out.println();

            listClientes();

        break;
        case 5:
            System.out.println("Alta de cliente:");
            System.out.println("==== == =========");
            System.out.println("");

            System.out.print("Ingrese ID del cliente: ");

            try {
                clienteid = Integer.parseInt(keyboard.nextLine());
            } catch(Exception e) {
                System.out.println("Error en el ingreso de datos");
                continue;
        }
            System.out.print("Ingrese cedula: ");
            String cedula_ruc = keyboard.nextLine();

            System.out.print("Ingrese nombrecia: ");
            String nombrecia = keyboard.nextLine();

            System.out.print("Ingrese nombre de contacto: ");
            String nombrecontacto = keyboard.nextLine();

            System.out.print("Ingrese direccion: ");
            String direccioncli = keyboard.nextLine();

            System.out.print("Ingrese fax: ");
            String fax = keyboard.nextLine();

            System.out.print("Ingrese email: ");
            String email = keyboard.nextLine();

            System.out.print("Ingrese celular: ");
            String celular = keyboard.nextLine();

            System.out.print("Ingrese fijo: ");
            String fijo = keyboard.nextLine();

            addCliente(clienteid, cedula_ruc, nombrecia, nombrecontacto, direccioncli, fax, email, celular, fijo);

            break;

        case 0:
            System.out.println("Saliendo...");
        break;

        default:
            System.out.println("Ingrese un numero valido");	
        break;
        }
        } while(opcion != 0);

        closeConnection();
    }
}