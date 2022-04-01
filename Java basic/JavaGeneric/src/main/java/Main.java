
import animal.*;


public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		printer p = new printer(cat);
		p.print();
	}
}