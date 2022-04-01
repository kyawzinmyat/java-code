package Test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	
	String name;
	
	@Autowired
	Tyre carTyre;
	
	public void setTyre(Tyre newCarTyre){
			this.carTyre = newCarTyre;
		}
		
	public Tyre getTyre(){
			return this.carTyre;
		}

	public void drive(){
			System.out.println("Car is driving");
		}
	public String toString(){
			return "Car "+carTyre;
		}
	
	
}