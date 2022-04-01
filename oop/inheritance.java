public class Main {
	public static void main(String[] args) {
		Car car = new Car(2001);
		car.move();
		System.out.println(car.model);
		car.get_wheels();
	}
}

class Vehicle{
	
	public int model;
	
	
	public Vehicle(){
	//		this.model = model;
		}
	void move(){
			System.out.println("Vehicle is moving");
		}
	void stop(){
		System.out.println("Vehicle is stopped");
		}	
	}
	
class Car extends Vehicle{
	int wheels = 4;
	Car(int num ){
			super();
			model = num;	
			
		}
	
	
	void get_wheels(){
			System.out.println(wheels);
		}
	void move(){
			System.out.println("Car is moving");
		}
	}
	
	