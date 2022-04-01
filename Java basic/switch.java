import java.util.Scanner ;


public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String k;
		System.out.println("Enter the day /");
		k = s.nextLine();
		switch(k){
			case "Monday":System.out.println("Its Monday");
			break;
			case "Tuesday":System.out.println("Its Tuesday");
			break;
			case "Wednesday":System.out.println("Its Wednesday");
			break;
			default :System.out.println("Its no day");
			}
		}
				
	}
