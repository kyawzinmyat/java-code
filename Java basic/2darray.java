import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> store = new ArrayList();
		ArrayList<String> meal = new ArrayList<String>();
		ArrayList<String> drink = new ArrayList<String>();
		meal.add("Chicken Curry");
		meal.add("Beef Curry");
		meal.add("Pork Curry");
		drink.add("Tea");
		drink.add("Coffee");
		drink.add("Milo");
		store.add(meal);
		store.add(drink);
		for(int i =0;i<store.size();i++){
				System.out.println(store.get(i));
				System.out.println(store.get(i).get(0));
		}
	}
}