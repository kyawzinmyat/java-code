package Test;
import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
	String brand;
	
	public void setTyre(String newBrand){
			this.brand = newBrand;
		}
	public String getTyre(){
			return brand;
		}
	public String toString(){
			return "its working";
		}
}