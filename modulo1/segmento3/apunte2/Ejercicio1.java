import java.util.Scanner;

public class Ejercicio1{
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese un numero entero para saber si es multiplo de 2 : ");
		Integer num = Integer.parseInt(keyboard.nextLine());
		Integer resto = num % 2;

		if(resto == 0) {
			System.out.println("El numero ingresado es multiplo de 2 ");
			}else{
				System.out.println("El numero ingresado NO es multiplo de 2 ");
			}
	}
}

