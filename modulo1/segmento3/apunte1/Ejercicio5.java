import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Hola! Ingrese su genero (Masculino/Femenino) : ");
		String sex = keyboard.nextLine();
		System.out.print("Ingrese su edad : ");
		Integer age = Integer.parseInt(keyboard.nextLine());

		if(sex.equals("masculino") && age>=18){
			System.out.println("Usted es masculino mayor de edad !");
		}else{
			System.out.println("Usted no es masculino o no es mayor de edad!");
		}
	}
}
