import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		Integer number = 0;

		while(number <= 100) {
			System.out.print("Ingrese un numero : ");
			number = Integer.parseInt(keyboard.nextLine());
		}
	}
}