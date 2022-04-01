public class CurrentNormalDisplay implements Observers,Display {
	
	private double temperature;
	private double pressure;
	private WeatherData weatherData;
	
	
	public CurrentNormalDisplay(WeatherData newWeatherData){
			this.weatherData = newWeatherData;
			weatherData.registerObserver(this);
		}
	
	
	public void display(){
			System.out.println("Tempertaure / "+this.temperature+" "+"Pressure / "+this.pressure);
		}
		
		
	public void setData(double newTemperature,double newPressure){
			this.temperature = newTemperature;
			this.pressure = newPressure;
		}

		
	public void update(double newTemperature,double newPressure){
			setData(newTemperature,newPressure);
			display();
		}
}