public class Main {
	public static void main(String[] args) {
		String x = "H";
		String y = "G";
		String temp = y;
		y=x;
		x=temp;
		System.out.print("x is " +x+" "+ "y is "+y);
	}
}