import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese un numero entero: ");
		Integer number = keyboard.nextInt();

		if(number==10)
			System.out.println("El numero ingresado es 10 ");
	}
}

