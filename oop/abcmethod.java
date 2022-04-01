public class Main {
	public static void main(String[] args) {
		Person kyaw = new Doctor();
		kyaw.talk();	
	}
}

abstract class  Person{
	
	abstract void talk();
	}
	
	
class Doctor extends Person{
		@Override
		void talk(){
				System.out.println("Doctor is talking");
			}
	
	}