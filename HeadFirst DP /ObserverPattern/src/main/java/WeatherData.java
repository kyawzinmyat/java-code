import java.util.ArrayList;


public class WeatherData implements Subject {
	private ArrayList<Observers> collectionOfObservers;
	private double temperature;
	private double pressure;
	private int totalObservers =0;

	public WeatherData(){
			collectionOfObservers=new ArrayList<Observers>();
		}
		
	public void registerObserver(Observers new_observer){
			collectionOfObservers.add(new_observer);
			totalObservers++;
		}
		
	public void removeObserver(Observers observer){
		
		}
	
	public void notifyObservers(){
			for(int i =0;i<totalObservers;i++){
								callNotifyOnObserver(collectionOfObservers.get(i));
				}
		}
		
	public void callNotifyOnObserver(Observers observer){
			observer.update(this.temperature,this.pressure);
		}
		
	public void changedData(){
			notifyObservers();
		}
	
	public void setMeasurement(double temperature,double pressure){
			this.temperature = temperature;
			this.pressure = pressure;
			changedData();
			
		}

}