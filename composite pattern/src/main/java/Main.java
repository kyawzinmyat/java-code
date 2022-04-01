public class Main {
	public static void main(String[] args) {
		NoodleBox noodlebox = new NoodleBox();
		Noodlepack np = new Noodlepack();
		noodlebox.pack(np);
		noodlebox.pack(np);
		String des =noodlebox.get_des();
		int price = np.get_price();		
		System.out.println(price);
	}
}