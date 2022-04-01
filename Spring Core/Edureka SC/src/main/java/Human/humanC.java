package Human;

public class humanC {
	String name;
	int age;
	
	public void setName(String newName){
			this.name = newName;
		}
		
	public String getName(){
			return this.name;
		}
		
	public void myDestroy(){
			System.out.println("Is Destoryed.....");
		}
		
	public void myInit(){
			System.out.println("Initilizing object");
		}	
		
	public void setAge(int newAge){
		this.age = newAge;
	}
	
	public int getAge(){
			return this.age;
		}
		
	@Override
	public String toString(){
			return "Detail /:  name"+this.name+"\n" + "age"+" "+this.age;
		}
}