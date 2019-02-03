import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese un numero romano: ");
		String letter = keyboard.nextLine();

		if (letter.equals("I") || letter.equals("i")) {
			System.out.println("1");
		}else if (letter.equals("V") || letter.equals("v")){
			System.out.println("5");
		}else if (letter.equals("X") || letter.equals("x")){
			System.out.println("10");
		}else if (letter.equals("L") || letter.equals("l")){
			System.out.println("50");
		}else if (letter.equals("C") || letter.equals("c")){
			System.out.println("100");
		}else if (letter.equals("D") || letter.equals("d")){
			System.out.println("500");
		}else if (letter.equals("M") || letter.equals("m")){
			System.out.println("1000");
		}else {
			System.out.println("Error! No es un numero romano");
		}
	}
}
