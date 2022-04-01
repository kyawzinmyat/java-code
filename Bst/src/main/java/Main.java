public class Main {
	public static void main(String[] args) {
		Node test = new Node(10);
		Node sec = new Node(9);
		Node third = new Node(8);
		Node fourth = new Node(12);
		Bst bst = new Bst();
		bst.add(test);
		bst.add(sec);
		bst.add(third);
		bst.add(fourth);
		System.out.println(bst.getRoot());
	
		System.out.println(test.getRightChild());
		System.out.println(sec.getLeftChild());
	}
}