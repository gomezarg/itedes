package com.itedes;

import javax.swing.*;
import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
	//
    private static Connection connection = null;
    private static Statement statement = null;
    private static ResultSet resultSet = null;

    public static void initializeConnection() {
    try {
        Class.forName("org.postgresql.Driver");

        connection = DriverManager.getConnection (
        "jdbc:postgresql://localhost:5432/pedidos",
        "postgres", 
        "root"
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

    //Categoria
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
	// detalle_ordenes
	public static void listDetalle() {
    try {
        resultSet = statement.executeQuery("SELECT * FROM detalle_ordenes;");

        while(resultSet.next()) {
        Integer ordenid = resultSet.getInt("ordenid");
		Integer detalleid = resultSet.getInt("detalleid");
		Integer productoid = resultSet.getInt("productoid");
		Integer cantidad = resultSet.getInt("cantidad");

        System.out.println("ORDEN ID: " + ordenid + " | DETALLE ID:" + detalleid + " | PRODUCTO ID : " + productoid + " | CANTIDAD : " + cantidad);
        }

        resultSet.close();
        } catch(Exception e) {
        System.out.println("ERROR AL LISTAR DETALLES ORDENES");
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



//MAIN
	public static void main(String[] args) {
		initializeConnection();

		Scanner keyboard = new Scanner(System.in);
		
		int opc=0;

		Integer categoriaid;
		Integer clienteid;
		//Integer ordenid , detalleid , productid , cantidad;

		do{

			System.out.println("Gestion de pedidos:");
			System.out.println("__________________");

			System.out.println("1.CATEGORIAS");
			System.out.println("2.CLIENTES");
			System.out.println("3.DETALLE DE ORDENES");
			System.out.println("4.EMPLEADOS");
			System.out.println("5.ORDENES");
			System.out.println("6.PRODUCTOS");
			System.out.println("7.PROVEEDORES");

			System.out.println("0.Salir");

			System.out.print("selecciona una opcion : ");

			opc=keyboard.nextInt();

			
			
			
			switch(opc){

			case 1:
			
				System.out.println("__________________");
				System.out.println("Menu categorias");
				System.out.println();

				int opc1=0;

				do{

				System.out.println(" 1) Listar categorias");
       			System.out.println(" 2) Agregar categoria");
        		System.out.println(" 3) Eliminar categoria");
				System.out.println(" 0) Salir");

				System.out.print("selecciona una opcion : ");

				opc1=keyboard.nextInt();

			
			
			switch(opc1){
				
				case 1:
					System.out.println();
					System.out.println("Listado de categorias:");
					System.out.println();
					listCategorias();
				break;

				case 2:
					System.out.println();
					System.out.println("Agregado de categoria");
					System.out.println();
					System.out.print("Ingrese ID: ");
					try {
                		categoriaid = Integer.parseInt(keyboard.nextLine());
           			} catch(Exception e) {
                		System.out.println("Error en el ingreso de datos");
               			continue;
        			}
           			System.out.println("Ingrese Nombre: ");
            		String nombrecat = keyboard.nextLine();

            		addCategoria(categoriaid, nombrecat);
				break;

				case 3:
					System.out.println();
					System.out.println("Eliminado de categoria");
					System.out.println();
					System.out.print("Ingrese ID: ");

        			try {
            			categoriaid = Integer.parseInt(keyboard.nextLine());
        			} catch(Exception e) {
           				System.out.println("Error en el ingreso de datos");
            			continue;
					}
        			removeCategoria(categoriaid);

				case 0:
					System.out.println();
					System.out.println("Saliendo de categorias");
					System.out.println();

				break;

				default:
					System.out.println();
					System.out.println("Opcion invalida");
					System.out.println();
				}

			

			}while(opc1!=0);

			break;

			

			case 2:

				System.out.println("MENU CLIENTES:");
				System.out.println();
				int opc2=0;

			do{

				System.out.println(" 1) Listar clientes");
       			System.out.println(" 2) Agregar cliente");
        		System.out.println(" 3) Eliminar cliente");
				System.out.println(" 0) Salir");

				System.out.print("selecciona una opcion : ");

				opc2=keyboard.nextInt();

				switch(opc2){

				case 1:
					System.out.println();
					System.out.println("Listado de clientes:");
            		System.out.println();

            		listClientes();

				break;

				case 2:
					System.out.println();
					System.out.println("Agregado de cliente");
					System.out.println();
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

				case 3:
					System.out.println();
					System.out.println("Eliminado de cliente");
					System.out.println();


				break;

				case 0:
					System.out.println();
					System.out.println(" Saliendo de clientes");
					System.out.println();

				break;

				default:
					System.out.println();
					System.out.println("Opcion invalida");
					System.out.println();
				}

			}while(opc2 != 0);

			break;
			case 3:
				System.out.println("__________________");
				System.out.println("Menu detalle de ordenes:");
				System.out.println();

				int opc3=0;

				do{

				System.out.println(" 1) Listar ordenes");
       			System.out.println(" 2) Agregar ordenes");
        		System.out.println(" 3) Eliminar ordenes");
				System.out.println(" 0) Salir");

				System.out.print("selecciona una opcion : ");

				opc3=keyboard.nextInt();

			

			switch(opc3){

				case 1:
					System.out.println();
					System.out.println("Listado de detalle de ordenes:");
					System.out.println();

            		listDetalle();
				break;

				case 2:
					System.out.println();
					System.out.println("Agregado de detalles de ordenes");
					System.out.println();

				

				break;

				case 3:
					System.out.println();
					System.out.println("Eliminado detalle de ordenes");
					System.out.println();


				break;

				case 0:
					System.out.println();
					System.out.println(" Saliendo de detalle de ordenes");
					System.out.println();

				break;

				default:
					System.out.println();
					System.out.println("Opcion invalida");
					System.out.println();
				}

			

			}while(opc3!=0);


			break;

			case 4:
				System.out.println("__________________");
				System.out.println("MENU DE EMPLEADOS:");
				System.out.println();

				int opc4=0;

				do{

				System.out.println(" 1) Listar empleados");
       			System.out.println(" 2) Agregar empleados");
        		System.out.println(" 3) Eliminar empleados");
				System.out.println(" 0) Salir");

				System.out.print("selecciona una opcion : ");

				opc4=keyboard.nextInt();

			

			switch(opc4){

				case 1:
					System.out.println();
					System.out.println("Listado de empleados:");
					System.out.println();

					

				break;

				case 2:
					System.out.println();
					System.out.println("Agregado de empleados");
					System.out.println();

				

				break;

				case 3:
					System.out.println();
					System.out.println("Eliminado de empleados");
					System.out.println();


				break;

				case 0:
					System.out.println();
					System.out.println(" Saliendo del menu empleados");
					System.out.println();

				break;

				default:
					System.out.println();
					System.out.println("Opcion invalida");
					System.out.println();
				}

			

			}while(opc4!=0);

			break;

			case 5:
				System.out.println("__________________");
				System.out.println("MENU DE ORDENES:");
				System.out.println();

				int opc5=0;

				do{

				System.out.println(" 1) Listar ordenes");
       			System.out.println(" 2) Agregar ordenes");
        		System.out.println(" 3) Eliminar ordenes");
				System.out.println(" 0) Salir");

				System.out.print("selecciona una opcion : ");

				opc5=keyboard.nextInt();

			

			switch(opc5){

				case 1:
					System.out.println();
					System.out.println("Listado de ordenes:");
					System.out.println();

					

				break;

				case 2:
					System.out.println();
					System.out.println("Agregado de ordenes");
					System.out.println();

				

				break;

				case 3:
					System.out.println();
					System.out.println("Eliminado de ordenes");
					System.out.println();


				break;

				case 0:
					System.out.println();
					System.out.println(" Saliendo del menu ordenes");
					System.out.println();

				break;

				default:
					System.out.println();
					System.out.println("Opcion invalida");
					System.out.println();
				}

			

			}while(opc5!=0);
			break;

			case 6 :
				System.out.println("__________________");
				System.out.println("MENU DE PRODUCTOS:");
				System.out.println();

				int opc6=0;

				do{

				System.out.println(" 1) Listar productos");
       			System.out.println(" 2) Agregar producto");
        		System.out.println(" 3) Eliminar producto");
				System.out.println(" 0) Salir");

				System.out.print("selecciona una opcion : ");

				opc6=keyboard.nextInt();

			

			switch(opc6){

				case 1:
					System.out.println();
					System.out.println("Listado de productos:");
					System.out.println();

					

				break;

				case 2:
					System.out.println();
					System.out.println("Agregado de productos");
					System.out.println();

				

				break;

				case 3:
					System.out.println();
					System.out.println("Eliminado de productos");
					System.out.println();


				break;

				case 0:
					System.out.println();
					System.out.println(" Saliendo del menu productos");
					System.out.println();

				break;

				default:
					System.out.println();
					System.out.println("Opcion invalida");
					System.out.println();
				}

			

			}while(opc6!=0);
			break;
			case 7:
				System.out.println("__________________");
				System.out.println("MENU DE PROVEEDORES:");
				System.out.println();

				int opc7=0;

				do{
				System.out.println();
				System.out.println(" 1) Listar proveedores");
       			System.out.println(" 2) Agregar proveedor");
        		System.out.println(" 3) Eliminar proveedor");
				System.out.println(" 0) Salir");

				System.out.print("selecciona una opcion : ");

				opc7=keyboard.nextInt();

			

			switch(opc7){

				case 1:
					System.out.println();
					System.out.println("Listado de proveedores:");
					System.out.println();

					

				break;

				case 2:
					System.out.println();
					System.out.println("Agregado de proveedores");
					System.out.println();

				

				break;

				case 3:
					System.out.println();
					System.out.println("Eliminado de proveedores");
					System.out.println();


				break;

				case 0:
					System.out.println();
					System.out.println(" Saliendo del menu proveedores");
					System.out.println();

				break;

				default:
					System.out.println();
					System.out.println("Opcion invalida");
					System.out.println();
				}

			

			}while(opc7!=0);
			break;
			default:
					System.out.println();
					System.out.println("Opcion invalida");
					System.out.println();
			}

		} while(opc != 0);
		closeConnection();

	}

}