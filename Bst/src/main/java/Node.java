public class Node {
	
	private int value;
	private Node leftChild;	
	private Node rightChild;
	private Node parent;
	
	public Node(int value){
			setValue(value);
		}
	
	public void setValue(int value){
			this.value = value;
		}
	public void setLeftChild(Node leftChild){
			this.leftChild = leftChild;
		}
	public void setRightChild(Node rightChild){
			this.rightChild = rightChild;
		}
	public void setParent(Node parent){
			this.parent = parent;
		}
		
	public int getValue(){
			return this.value;
		}
	public Node getLeftChild(){
			return this.leftChild;
		}
	public Node getRightChild(){
			return this.rightChild;
		}
	public Node getParent(){
			return this.parent;
		}
	
	

}