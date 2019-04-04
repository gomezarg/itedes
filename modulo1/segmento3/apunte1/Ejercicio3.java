import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese su genero : ( Masculino/ femenino) :");
		String sex = keyboard.nextLine();

		if(sex.equals("femenino"))
				System.out.println("Usted es femenino!");
	}
}

