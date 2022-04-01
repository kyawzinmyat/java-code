public class Main {
	public static void main(String[] args) {
		Grocery grocery = new Grocery();
		Customers kyaw = new Customers();
		grocery.register(kyaw);
		grocery.set_close_time(4.0);
	}
}