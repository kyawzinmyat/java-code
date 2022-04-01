public class Bst {
	private Node root;
	
	
	public void add(Node nodeToInsert){
			if(checkNullForRootNode()){
				setRootNode(nodeToInsert);
				}	
			else{
				compare(nodeToInsert);
				}
			}
		
	public void setRootNode(Node rootNode){
				this.root = rootNode;
		}	
		
	//for root node
	void compare(Node nodeToInsert){
				compareValueOfNode(root,nodeToInsert);
	}
	
	
	void compareValueOfNode(Node currentNode,Node nodeToInsert){
			if(nodeToInsert.getValue()>currentNode.getValue()){
						goRight(currentNode,nodeToInsert);
					}
			else{
						goLeft(currentNode,nodeToInsert);
					}
		}
	
	
	
	
	
	
	void goLeft(Node currentNode,Node nodeToInsert){
			if(checkNull(currentNode.getLeftChild())){
					currentNode.setLeftChild(nodeToInsert);
				}
			else{
					compareValueOfNode(currentNode.getLeftChild(),nodeToInsert);
				}	
		}
	
	void goRight(Node currentNode,Node nodeToInsert){
			if(checkNull(currentNode.getRightChild())){
					currentNode.setRightChild(nodeToInsert);
				}
			else{
					compareValueOfNode(currentNode.getRightChild(),nodeToInsert);
				}	
		}
	
	
	
	boolean checkNull(Node childNode){
			return childNode ==null;
		}
	
	
	boolean checkNullForRootNode(){
			return root==null;
		}
		
		
		
	public Node getRoot(){
			return this.root;
		}
		
	public void setNode(Node nodeToInsert,Node parentNode){
		
		}
}