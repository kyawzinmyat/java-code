public class Main {
	public static void main(String[] args) {
		Factory f = new Factory();
		Car telsla = f.manufacture_telsla();
		telsla.drive();
		telsla.stop();
	}
}