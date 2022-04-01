public class Main {
	public static void main(String[] args) {
		//MaxHeapify h = new MaxHeapify(11);
		MaxHeapLinear h = new MaxHeapLinear(10);
		h.add(0);
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(7);
		h.add(8);
		h.add(9);
		h.add(10);
		h.linearSort();
	/*
		h.delete();
		h.delete();
		h.delete();
		h.delete();
		h.delete();
		h.delete();
		h.delete();
		h.delete();
		h.delete();
		h.delete();
		h.print();
	*/
		h.print();
		//System.out.println(h.print());
	}
}