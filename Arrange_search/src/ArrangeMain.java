import java.util.*;
public class ArrangeMain {
	public static final int TOTAL = 100;
	
	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[TOTAL];
		for (int i = 0; i < TOTAL; i++) {
			array[i] = rand.nextInt(TOTAL);
		}
		System.out.println("Data is " + Arrays.toString(array));
		ArrangeTree tree = new ArrangeTree(array);
		System.out.println("After sorting is " + tree);
	}
}
