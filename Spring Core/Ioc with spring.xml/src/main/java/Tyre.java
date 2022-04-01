public class Tyre {
	
	String brand;
	
	
	public void myInit(){
			System.out.println("---Init---");
		}
		
	public void myDestroy(){
			System.out.println("--Delete---");
		}
		
	
	
	public void setBrand(String newBrand){
			this.brand = newBrand;
		}
	public String getBrand(){
			return brand;
		}
	public String toString(){
			return "its working";
		}
}