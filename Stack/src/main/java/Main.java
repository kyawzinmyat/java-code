public class Main {
	public static void main(String[] args) {
		int[] array = new int[3];
		array[0]=4;
		array[1]=5;
		array[2]=6;
		Stack s = new Stack(10);
		s.push(3);
		s.push(2);
		s.push_all(array);
		s.print();	
	}
}