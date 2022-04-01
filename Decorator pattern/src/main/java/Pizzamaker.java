public class Pizzamaker {
	public void make_pizza(){
		Pizza dcpizza = new 							DoubleCheese(new PlainPizza());
		String des = dcpizza.get_des();
		double price = dcpizza.get_cost();
		System.out.println(price);
	}
		
}