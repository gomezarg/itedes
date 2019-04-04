import java.util.Scanner;

public class Ejercicio2{
	public static String multiplos(Integer number1, Integer number2){
		String result ="";
		if(number1%number2 == 0 && number2%number1 == 0){
			result = "Ambos numeros son multiplos";
		} else if(number2%number1 == 0){
			result = "El segundo numero (" + number2 + ") es multiplo del primer numero (" + number1 + ").";
		} else if (number1%number2 == 0){
			result = "El primer numero (" + number1 + ") es multiplo del segundo numero (" + number2 + ").";
		} else {
			result= "No son multiplos";
		}
		return result;
	}
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		String result ="";

		System.out.println("Ingrese primer numero: ");
		Integer number1 = Integer.parseInt(teclado.nextLine());

		System.out.println("Ingrese segundo numero: ");
		Integer number2 = Integer.parseInt(teclado.nextLine());

		result = multiplos(number1,number2);
		System.out.println(result);
	}
}