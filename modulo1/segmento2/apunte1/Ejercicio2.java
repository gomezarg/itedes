import java.util.Scanner;

public class Ejercicio2{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese datos personales. DNI : ");
		int  dni = teclado.nextInt();
		
		System.out.print("Ingrese nombre y apellido : ");
		String nombre = teclado.next();

		System.out.print("Ingrese su direccion : ");
		String direccion = teclado.next();

		System.out.print("Ingrese su telefono : ");
		int  telefono = teclado.nextInt();

		System.out.println("DNI : " + dni + " Nombre y apellido : " + nombre + " Direccion : " + direccion + " Tel : " + telefono);
	}
}


