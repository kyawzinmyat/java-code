public class OpenState implements State{
	
	Fan fan;
	
	public OpenState(Fan new_fan){
			fan = new_fan;
		}
	
	
	@Override
	public void open(){
			System.out.println("Fan is already opened");
		}
	@Override
	public void close(){
		System.out.println("Fan is closed");
		fan.set_state(fan.get_close_state());
	}		
}