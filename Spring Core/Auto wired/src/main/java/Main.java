import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import Test.*;


public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/Test/spring.xml");
		
		
		Car car =(Car)context.getBean("car");
		System.out.println(car.toString());
		
	}
}