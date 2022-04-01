public class TelslaCar implements Car {
	@Override
	public void drive() {
		System.out.println("Telsla car is driving");
	};
	@Override
	public void stop() {
		System.out.println("Telsla car is stopped");
	};
}