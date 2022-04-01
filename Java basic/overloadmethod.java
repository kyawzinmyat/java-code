public class Main {
	public static void main(String[] args) {
		int z = add(1,2);
		double j = add(2.9,3.6);
		int x = add(1,2,3);
		System.out.println(x);	
	}
	
	static int add(int a,int b){
			return a+b;
		}
	static int add(int a,int b,int c){
			return a+b+c;
		}
		
	static double add(double a,double b){
			return a+b;
		}
}