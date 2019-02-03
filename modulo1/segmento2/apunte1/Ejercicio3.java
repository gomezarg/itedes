import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Ingrese primer numero: ");
		int num1 = keyboard.nextInt();

		System.out.print("Ingrese segundo numero: ");
		int num2 = keyboard.nextInt();

		System.out.print("Ingrese tercer numero: ");
		int num3 = keyboard.nextInt();

		System.out.print("Ingrese cuarto numero: ");
		int num4 = keyboard.nextInt();

		System.out.print("Ingrese ultimo numero: ");
		int num5 = keyboard.nextInt();

		System.out.println( " - " + num5 + "-" + num4 + "-" + num3 + "-" + num2 + "-" + num1 + "-" );
	}
}


