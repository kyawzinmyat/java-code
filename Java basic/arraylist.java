import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//String [] name = new String [3]; //Array
		
		ArrayList<String> food = new ArrayList<String>();
		food.add("Pizza");
		food.add("Coffee");
		food.set(1,"Tea");
		food.add("Cake");
		food.remove(1);
		for(int i=0;i<food.size();i++){
				System.out.println(food.get(i));
			}
		
	}
}
