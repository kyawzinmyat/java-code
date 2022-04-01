public class Main {
	public static void main(String[] args) {
		WeatherData station1 = new WeatherData();
		Display display = new CurrentNormalDisplay(station1);
		//display.display();
		station1.setMeasurement(97.4,6.00);
	}
}