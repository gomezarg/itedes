import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese un numero romano: ");
		String letter = keyboard.nextLine();

		switch(letter) {
			case "I":
				System.out.println("1");
				break;

			case "V":
				System.out.println("5");
				break;

			case "X":
				System.out.println("10");
				break;
			case "L":
				System.out.println("50");
				break;
			case "C":
				System.out.println("100");
				break;
			case "D":
				System.out.println("500");
				break;
			case "M":
				System.out.println("1000");
				break;
			default:
				System.out.println("Error!");
				break;
		}
	}
}



