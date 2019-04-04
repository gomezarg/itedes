import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese primer numero: ");
		Integer num1 = Integer.parseInt(keyboard.nextLine());

		System.out.print("Ingrese segundo numero: ");
		Integer num2 = Integer.parseInt(keyboard.nextLine());

		System.out.print("Ingrese tercer numero: ");
		Integer num3 = Integer.parseInt(keyboard.nextLine());

		if(num1 < num2 && num2 < num3) {
			System.out.println(num1 + " " + num2 + " " + num3);
		} else if(num2 < num1 && num1 < num3){
			System.out.println(num2 + " " +  num1 + " " + num3);
		}else if(num3 < num2 && num2 < num1){
			System.out.println(num3 + " " +  num2 + " " + num1);
		}else if(num3 < num1 && num1 < num2){
			System.out.println(num3 + " " +  num1 + " " + num2);
		}else if(num1 < num3 && num3 < num2){
			System.out.println(num1 + " " +  num3 + " " + num2 );
		}else if(num2 < num3 && num3 < num1){
			System.out.println(num2 + " " + num3 + " " + num1);
		}
	}
}


