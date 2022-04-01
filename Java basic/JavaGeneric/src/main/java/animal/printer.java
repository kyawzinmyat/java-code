package animal;

public class printer<t extends Animal> {
	t animal;
	
	
	public printer(t animal){
			this.animal = animal;
		}
		
	public void print(){
			System.out.println(animal.getType());
		}
}