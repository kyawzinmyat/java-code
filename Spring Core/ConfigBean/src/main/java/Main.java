import org.springframework.context.ApplicationContext;
import Config.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s7 = (Samsung)factory.getBean("samsung");
		s7.config();
		
	}
}