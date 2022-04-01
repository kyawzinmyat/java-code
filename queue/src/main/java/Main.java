public class Main {
	public static void main(String[] args) {
			Queue q = new Queue(5);
			for(int i=0;i<5;i++){
				q.insert(i);
			}
			q.remove();
			q.get_value(5);
			q.print();
	}
}