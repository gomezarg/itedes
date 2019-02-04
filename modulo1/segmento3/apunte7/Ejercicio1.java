import java.util.Scanner;

public class Ejercicio1 {
	public static Integer cantidad(Integer number){
		Integer cantidad = 0;
		for (Integer i = 1; i <= number; i++){
			if (number%i == 0){
				cantidad += 1;
			}

		}
		return cantidad;
	}
	public static void main(String args[]){
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un numero: ");
		Integer number= Integer.parseInt(teclado.nextLine());

		Integer divisores;

		divisores = cantidad(number);
	
		System.out.println("El numero " + number + " tiene : " + divisores + " divisores");
	}


}
