package Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;


@Component
public class Samsung {
	
	@Autowired
	@Qualifier("snapDragon")
	MoblieCpu cpu;
	
	public void setCpu(MoblieCpu newCpu){
			this.cpu = newCpu;
		}
		
	public MoblieCpu getCpu(){
			return cpu;
		}
	
	public void config(){
			System.out.println("Octa core ,4 Gb of ram,64 Gb of rom");
			cpu.process();
		}
}