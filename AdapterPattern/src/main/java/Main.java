public class Main {
	public static void main(String[] args) {
		Attacker john_cena = new Wrestler();
		Samuri kyaw = new Samuri();
		Adapter adapter = new Adapter(kyaw);		adapter.punch();
	}
}