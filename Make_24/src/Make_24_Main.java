import java.util.*;
public class Make_24_Main {
	public static final int LENGTH = 4;
	//public static List<List<Integer>> all;
	public static List<CalNode> overall;
	
	public static void main(String[] args) {
		overall = new LinkedList<CalNode>();
		askForInput();
	}
	
	public static void askForInput() {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter " + LENGTH + " numbers line by line");
		List<Integer> data = new LinkedList<Integer>();
		for (int i = 0; i < LENGTH; i++) {
			System.out.print("Please enter a number: ");
			int num = console.nextInt();
			data.add(num);
		}
		//all = new LinkedList<List<Integer>>();
		makeLists(data, new LinkedList<Integer>());
	}
	
	public static void makeLists(List<Integer> data, List<Integer> current) {
		if (data.size() > 0) {
			int size = data.size();
			for (int i = 0; i < size; i++) {
				int num = data.remove(i);
				current.add(num);
				makeLists(data, current);
				current.remove(current.size() - 1);
				data.add(i, num);
			}
		} else {
			calculate(current);
		}
	}
	
	public static void calculate(List<Integer> data) {
		
	}
	
	private static String getOperator(int index) {
		String[] operators = {"+", "-", "*", "/"};
		return operators[index];
	}
}
