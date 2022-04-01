public class DoubleCheese extends ToppingsDecorator {
	public DoubleCheese(Pizza pizza){
			super(pizza);	
		}
	public String get_des(){
			return "double cheese "+temp_pizza.get_des();
		}
	public double get_cost(){
			return 3000.00 + temp_pizza.get_cost();
		}
}