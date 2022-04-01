import java.util.ArrayList;


public class AllOn implements Command {
	ArrayList<EDevice> devices;
	
	
	public AllOn(ArrayList new_devices){
			devices = new_devices;
		}
	
	@Override
	public void execute(){
			for(EDevice device:devices){
					device.on();	
				}
	}	
}