import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese un numero del 1 al 7 y se devolvera un dia de semana: ");
		Integer num = Integer.parseInt(keyboard.nextLine());

		if(num == 1) {
			System.out.println("Lunes");
		}else if(num == 2){
			System.out.println("Martes");
		}else if(num == 3){
			System.out.println("Miercoles");
		}else if(num == 4){
			System.out.println("Jueves");
		}else if(num == 5){
			System.out.println("Viernes");
		}else if(num == 6){
			System.out.println("Sabado");
		}else if(num == 7){
			System.out.println("Domingo");
		}
		else {
			System.out.println("Opcion Invalida");
		}
	}
}
