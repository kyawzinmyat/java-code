
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		String [] name = new String[] {"kyaw","zin","myat"};
		ArrayList<Integer> age = new ArrayList<Integer>();
		age.add(18);
		age.add(19);
		age.add(20); 
		for (String i:name){
				System.out.println(i);			
			}
		for (int i:age){
				System.out.println(i);			
			}
	}
}