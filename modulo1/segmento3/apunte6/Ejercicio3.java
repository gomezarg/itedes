import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

			Double result , num1, num2;
				do{
					

					System.out.print("Ingrese base del rectangulo: ");
					num1 = keyboard.nextDouble();

					System.out.print("Ingrese altura del rectangulo : ");
					num2 = keyboard.nextDouble();
					if(num1 > 0 && num2 > 0) {
					result = num1 * num2;

					System.out.println(" ");
						
					System.out.println("El area del rectangulo es : " + result);
					} else  {
						System.out.println("Error! Area y altura deben ser mayores a cero ! Vuelve a ingresar ");
					}
					System.out.println("==================================");
			} while(num1 <= 0 || num2 <= 0);
	}
}