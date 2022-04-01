package Config;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
public class Intel implements MoblieCpu {
	public void process(){
			System.out.println("Intel is processing");
		}
}