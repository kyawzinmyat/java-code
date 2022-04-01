public class CloseState implements State {
	
	Fan fan;
	
	public CloseState(Fan new_fan){
			fan = new_fan;
		}
	
	
	@Override
	public void open(){
			System.out.println("Fan is opened");
			fan.set_state(fan.get_open_state());
		}
	@Override
	public void close(){
		System.out.println("Fan is already closed");
	}
		
}