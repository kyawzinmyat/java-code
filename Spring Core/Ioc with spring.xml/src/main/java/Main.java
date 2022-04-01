import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/spring.xml");
			
		Vehicle car = (Car)context.getBean("car");
		System.out.println(car.toString());
	}
}