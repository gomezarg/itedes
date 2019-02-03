import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese numero a dividir: " );
		Integer num1 = keyboard.nextInt();

		System.out.print("Ingrese por cuanto desea dividir : ");
		Integer num2 = keyboard.nextInt();

		Integer result = num1 / num2;
		System.out.println("El resultado de la division es: " + result.toString());
	}
}

