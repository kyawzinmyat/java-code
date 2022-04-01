public abstract class ToppingsDecorator implements Pizza {
	
	Pizza temp_pizza;
	public ToppingsDecorator(Pizza new_pizza){
			temp_pizza = new_pizza;
		}
	
	public String get_des(){
			return temp_pizza.get_des();
		}
	public double get_cost(){
			return temp_pizza.get_cost();
		}
}