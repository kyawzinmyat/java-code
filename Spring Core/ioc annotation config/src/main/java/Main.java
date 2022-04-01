import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import test.* ;



public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/test/spring.xml");		
		Vehicle vehicle = (Vehicle)context.getBean("car");
		vehicle.drive();
	}
}