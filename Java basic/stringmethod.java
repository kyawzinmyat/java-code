public class Main {
	public static void main(String[] args) {
		String name = "Kyaw";
		boolean y = name.equals("Kyaw");
		boolean z = name.equalsIgnoreCase("kyaw");
		System.out.println(y);
		System.out.println(z);
		int x = name.length();
		System.out.println(x);
		char j = name.charAt(3);
		int k = name.indexOf('K');
		boolean n = name.isEmpty();
		System.out.println(j);
		System.out.println(k);
		System.out.println(n);
		String main = "     Kyaw   ";
		String a = main.toUpperCase();
		String b = main.toLowerCase();
		String c = main.trim();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int g = 10;
		Integer f = new Integer(10);
		System.out.println(g==f);
		
	}
}