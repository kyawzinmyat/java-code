

public class TurnOff implements Command {
	EDevice device;
	
	public TurnOff(EDevice new_device){
			device = new_device;
		}
		
	@Override
	public void execute(){
			device.off();	
		}
}