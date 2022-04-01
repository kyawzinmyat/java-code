package test;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	
	String name ;
	
	public void drive(){
			System.out.println("Car is driving");
		}
}