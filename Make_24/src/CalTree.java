import java.util.*;
public class CalTree {
	private CalNode overall;
	
	public CalTree(List<Integer> data) { //UNSOLVED
		List<Integer> firstHalf = data.subList(0, 1);
		List<Integer> secondHalf = data.subList(2, 3);
		
	}
	
	// UNSOLVED
	public CalNode construct(List<CalNode> list, String operator) {
		if (list.size() == 1) {
			if (list.get(1).num == 24) {
				return list.get(1);
			} else {
				return null;
			}
		} else {
			CalNode upper = new CalNode();
			upper.left = list.get(0);
			upper.right = list.get(1);
			upper.operator = operator;
			upper.num = calculate(list.get(0), list.get(1), operator);
			return upper;
		}
	}
	
	private int calculate(CalNode one, CalNode two, String operator) {
		if (operator == "+") {
			return one.num + two.num; 
		} else if (operator == "-") {
			return one.num - two.num;
		} else if (operator == "*") {
			return one.num * two.num;
		} else {
			return one.num / two.num;
		}
	}
	
	private String getOperator(int index) {
		String[] operators = {"+", "-", "*", "/"};
		return operators[index];
	}
}
