import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		int num , max = 0 ;

		do
			{
				System.out.print("Ingrese un numero entero positivo (0 Finalizar): ");
				num = keyboard.nextInt();
				if (num >= max){
					max = num; 
				}
			}
			while(num != 0);
			System.out.println("El mayor de todos los numeros ingresados es : " + max);
        }
}