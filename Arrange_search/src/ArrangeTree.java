public class ArrangeTree {
	private ArrangeNode overallRoot;
	
	public ArrangeTree(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			overallRoot = construct(overallRoot, numbers[i]);
		}
	}
	
	public String toString() {
		return toString(overallRoot);
	}
	
	private String toString(ArrangeNode root) {
		if (root == null) {
			return "";
		} else if (root.left == null && root.right == null) {
			return "" + root.number;
		} else if (root.left == null && root.right != null) {
			return root.number + " " + toString(root.right);
		} else if (root.left != null && root.right == null) {
			return toString(root.left) + " " + root.number;
		} else {
			return toString(root.left) + " " + root.number + " " + toString(root.right);
		}
	}
	
	private ArrangeNode construct(ArrangeNode current, int data) {
		if (current == null) {
			return new ArrangeNode(data);
		} else if (current.number < data) {
			current.right = construct(current.right, data);
		} else {
			current.left = construct(current.left, data);
		}
		return current;
	}
}
