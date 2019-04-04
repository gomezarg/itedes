import java.util.ArrayList;

public class Prueba {
	public static void main(String args[]) {
		ArrayList<String> nombres = new ArrayList<String>();

		nombres.add("Mateo");
		nombres.add("Marcos");
		nombres.add("Lucas");
		nombres.add("Juan");

		Integer tamanio = nombres.size();
		System.out.println("Tamanio de la lista: " + tamanio.toString());

		for(String nombre : nombres)
			System.out.println(nombre);

		System.out.println();

		for(Integer i = 0; i < 4; i++)
			System.out.println(nombres.get(i));

		nombres.remove("Mateo");

		nombres.remove(1);

		System.out.println();

		System.out.println(nombres);
	}
}
