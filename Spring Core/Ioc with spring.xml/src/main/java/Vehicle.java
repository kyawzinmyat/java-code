public abstract class Vehicle {
	
	String name;
	
	public abstract void drive();
	
	
	
	public void setName(String newName){
			this.name = newName;
		}
	public String getName(){
			return name;
		}
}