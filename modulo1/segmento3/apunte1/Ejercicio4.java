import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese primer numero: ");
		Integer num1 = Integer.parseInt(keyboard.nextLine());

		System.out.print("Ingrese segundo numero: ");
		Integer num2 = Integer.parseInt(keyboard.nextLine());

		System.out.print("Ingrese tercer numero: ");
		Integer num3 = Integer.parseInt(keyboard.nextLine());

		System.out.print("Ingrese cuarto numero: ");
		Integer num4 = Integer.parseInt(keyboard.nextLine());
		
		if(num1==num2 || num3==num4){
			System.out.println("Los numeros ingresados son iguales");
		}else{
			System.out.println("Los numeros ingresados No son iguales");
		}

	}
}

