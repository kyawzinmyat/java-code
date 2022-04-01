
import org.springframework.stereotype.Component;


public class Car extends Vehicle{
	
	Tyre carTyre;
	
	public Car(Tyre newTyre){
			this.carTyre = newTyre;
		}
	
	
	public Tyre getTyre(){
			return carTyre;
		}
	
	public void setTyre(Tyre newCarTyre){
			this.carTyre= newCarTyre;
		}
	
	
	@Override
	public String toString(){
			return "I'm from Car class \n"+this.carTyre.getBrand();
		}	
		
	@Override
	public void drive(){
			System.out.println("Car is driving");
		}
	
	
}