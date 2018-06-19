public class CalNode {
	public int num;
	public String operator;
	public CalNode left;
	public CalNode right;
	
	public CalNode(int num, String operator) {
		this.num = num;
		this.operator = operator;
	}
	
	public CalNode(int num) {
		this(num, null);
	}
	
	public CalNode() {
		this(0, null);
	}
}
