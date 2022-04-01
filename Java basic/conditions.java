import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ur age");
		int x = scanner.nextInt();
		if (x >= 75)
		{
			System.out.println("You are Old");;
			}
		else if (x >=18){
			System.out.println("You are adult");
			}
		else{
				System.out.println("You are child");
			}
	}
}