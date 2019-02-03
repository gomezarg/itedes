import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese numero a multiplicar: ");
		Integer num1 = keyboard.nextInt();

		System.out.print("Ingrese otro numero: ");
		Integer num2 = keyboard.nextInt();

		Integer result = num1 * num2 ;
		System.out.println("El producto de los numero ingresados es : " + result.toString());
	}
}


