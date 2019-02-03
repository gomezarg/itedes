import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese nombre de su barrio : ");
		String barrio = teclado.nextLine();

		System.out.print("Ingrese direccion postal de comisaria mas cercana : ");
		String calle = teclado.nextLine();

		System.out.print("Ingrese entre calles : ");
		String entrecalle = teclado.nextLine();

		System.out.println("La comisaria de " + barrio + " se encuentra en la calle " + calle + " entre " + entrecalle );
	}
}


