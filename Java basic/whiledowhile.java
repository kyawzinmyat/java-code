
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name;
		System.out.println("Enter ur name");
		name = s.nextLine();
		while(name.isBlank()){
				System.out.println("Enter ur name");
				name = s.nextLine();
			}
		
		do{
				System.out.println("Enter ur name");
				name = s.nextLine();
					
		}while(name.isBlank());		
		System.out.println("Hello"+name);
	}
}