
public class TestMain {
	public static void main(String[] args) {
		int[] numbers = {12, 34, 56, 78, 90};
		getOne(new boolean[numbers.length], numbers, "[");
	}
	
	public static void getOne(boolean[] flags, int[] number, String nowStr) {
		boolean print = true;
		for (int i = 0; i < number.length; i++) {
			print = print && flags[i];
		}
		if (print) {
			System.out.println(nowStr.substring(0, nowStr.length() - 2) + "]");
			return;
		}
		for (int i = 0; i < number.length; i++) {
			if (!flags[i]) {
				flags[i] = true;
				getOne(flags, number, nowStr + number[i] + ", ");
				flags[i] = false;
			}
		}
	}
}
