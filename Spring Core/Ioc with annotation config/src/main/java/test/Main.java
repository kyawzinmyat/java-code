package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;






public class Main {
	public static void main(){
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/spring.xml");		
		Vehicle vehicle = (Vehicle)context.getBean("Car");
		vehicle.drive();
	}
}