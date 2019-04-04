import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese numero a restar: ");
		Integer num1 = keyboard.nextInt();

		System.out.print("Ingrese otro numero: ");
		Integer num2 = keyboard.nextInt();

		Integer resta = num1 - num2;
		System.out.println("El resultado de la resta es : " + resta.toString());
	}
}

