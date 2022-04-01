import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		greet("Kyaw",18);	
		ArrayList<String> bwla = Return();
		System.out.println(bwla);
	}
	static void greet(String name,int age){
			System.out.println("Hello "+name);	
		}
	static ArrayList Return(){
			ArrayList <String> bwala = new ArrayList<String>();
			bwala.add("Bwala la la");
			return bwala;
		}
}