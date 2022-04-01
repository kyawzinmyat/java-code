public class Main {
	public static void main(String[] args) {
		Rabbit rab = new Rabbit();
		Hawk haw = new Hawk();
		Fish fi = new Fish();
		rab.flee();
		haw.hunt();
		fi.flee();
		fi.hunt();
	}
}

interface  Prey{
		abstract void flee();
	}
	
interface Predactor{
		public abstract void hunt();
	}
	
class Hawk implements Predactor{
	@Override
	public void hunt(){
			System.out.println("The hawk is hunting");
		}
	
	}
	
class Rabbit implements Prey{
	@Override
	public void flee(){
			System.out.println("The rabbit is running");
		}	
	}
	
	
class Fish implements Prey,Predactor{
	@Override
	public void hunt(){
			System.out.println("Big fish is hunting the small fish");
		}
	@Override
	public void flee(){
			System.out.println("Small fish is running away from big fish");
		}
	
	}