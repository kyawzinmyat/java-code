package Config;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MoblieCpu  {
	public void process(){
		System.out.println("Processing ....... ");
	}
}