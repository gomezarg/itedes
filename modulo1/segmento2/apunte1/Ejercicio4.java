import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese primer numero a sumar: ");
		Integer num1 = keyboard.nextInt();

		System.out.print("Ingrese segundo numero a sumar : ");
		Integer num2 = keyboard.nextInt();

		Integer suma = num1 + num2 ;
		System.out.println("El resultado de la suma es : " + suma.toString());
	}
}

