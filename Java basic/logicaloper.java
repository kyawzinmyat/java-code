import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ur age");
		int age = s.nextInt();
		if (age<14  || age >=18){
				System.out.println("Wellcome");
			}
		else if(age>=15 && age<=17){
				System.out.println("You are half wellcome");			
			}
		else if(age == 18){
				System.out.println("Wellcome");
			
			}
		else{
			System.out.println("Not wellcome");
		}	
	}
}