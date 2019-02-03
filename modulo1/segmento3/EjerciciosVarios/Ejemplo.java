import java.util.ArrayList;
public class Ejemplo {
	public static void main(String args[]) {

		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Victor");
		nombres.add("Luis");
		nombres.add("Elena");

		Arrays.sort(nombres);
		for (int i : nombres) {
            System.out.print(i + ", ");
        }
	}
}