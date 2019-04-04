import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Burbujeo {
	public static void main(String args[]) {
		ArrayList<Integer> vector = new ArrayList<Integer>();

		for(int i = 0; i < 5; i ++ )
			vector.add(ThreadLocalRandom.current().nextInt(0,1000 + 1));

			for(int i = 0; i < vector.size() - 1; i++){
				for(int k = i; k < vector.size(); k++){
					if(vector.get(i) > vector.get(k)) {
						Integer auxiliar = vector.get(k);
						vector.set(k, vector.get(i));
						vector.set(i,auxiliar);
					}
				}
			}
		System.out.println(vector);
	}
}