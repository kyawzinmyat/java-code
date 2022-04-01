public class TurnOn implements Command {
	EDevice device;
	
	public TurnOn(EDevice new_device){
			device = new_device;
		}
	
	@Override
	public void execute(){
			device.on();	
		}	
}	