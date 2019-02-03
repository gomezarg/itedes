import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese un numero y se mostrara su tabla de multiplicar: ");
		Integer num = keyboard.nextInt();

		for(Integer i = 1; i <11; i++)
		System.out.println("|" + num + "X" + i + "=" + num * i);
	}
}
