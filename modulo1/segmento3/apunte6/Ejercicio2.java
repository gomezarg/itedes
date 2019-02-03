import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

			String otro = "n";

				do{

				System.out.print("Ingrese primer numero a sumar: ");
				Integer num1 = keyboard.nextInt();

				System.out.print("Ingrese segundo numero a sumar : ");
				Integer num2 = keyboard.nextInt();
				Integer result = num1 + num2;

				System.out.println("El resultado es: " + result);

				System.out.println("==================================");
				
				System.out.println("Desea hacer otra suma (s/n) : ");
				otro = keyboard.next();

			} while(otro.equals("s"));
			
	}
}