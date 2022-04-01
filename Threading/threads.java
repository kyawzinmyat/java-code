public class Main {
	public static void main(String[] args) {
		System.out.println(Thread.activeCount());
		Thread.currentThread().setName("Name");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}