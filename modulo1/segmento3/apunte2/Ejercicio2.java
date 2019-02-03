import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese su nombre: ");
		String name = keyboard.nextLine();

		System.out.print("Ingrese la contraseña : ");
		Integer password = Integer.parseInt(keyboard.nextLine());

		if(name.equals("juan") && password == 1234 || name.equals("pedro") && password == 5678) {
			System.out.println("Hola " + name);
		}else{
			System.out.println("Usuario invalido!");
		}
	}
}

