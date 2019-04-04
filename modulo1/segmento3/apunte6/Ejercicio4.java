import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

			Double num = 1.0;
			Double sum = 0.0;
				do{
					

					System.out.print("Ingrese un numero (0 Finaliza ): ");
					num = keyboard.nextDouble();
				
					sum += num;
					
						
				
					System.out.println("==================================");
			} while(num != 0 );
			System.out.println("La suma de todos los numeros ingresados es : " + sum);
	}
}