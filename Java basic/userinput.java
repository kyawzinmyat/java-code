import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What\'s your name");
		String name = scanner.nextLine();
		System.out.println("What\'s your age ");
		int age = scanner.nextInt();
		
		System.out.println("What\'s your favorite food");
		
		scanner.nextLine();//try without this line of code 
		//if u dont add above line u're not gonna see below input bcz when u press enter its add \n(escape key) but nextInt take only integer so left with escape key'
		
		String food = scanner.nextLine();
		
		System.out.println("Hello "+name);
		System.out.println("You are "+age+"years old");
		System.out.println("You like "+food);
	}
}