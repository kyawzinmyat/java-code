public class Main {
	public static void main(String[] args) {
		PhoneFactory phone= new PhoneFactory();
		Android sam = phone.create('S');
		sam.call();
		
			
	}
}