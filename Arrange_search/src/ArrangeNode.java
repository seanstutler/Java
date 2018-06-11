public class ArrangeNode implements Comparable<ArrangeNode>{
	public int number;
	public String word;
	public ArrangeNode left;
	public ArrangeNode right;
	
	public ArrangeNode(int number) {
		this.word = null;
		this.number = number;
	}
	
	public ArrangeNode(String word) {
		this.number = (Integer) null;
		this.word = word;
	}
	
	public int compareTo(ArrangeNode other) {
		if (this.word == null) {
			return this.number = other.number;
		} 
		return this.word.compareTo(other.word);
	}
}
