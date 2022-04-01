public class Fan {
	State open;
	State close;
	State fan_state;
	
	public Fan(){
			open = new OpenState(this);
			close = new CloseState(this);
			set_state(close);
		}
		
	public void set_state(State new_state){
			fan_state = new_state;
		}
		
	public State get_open_state(){return open;}
	public State get_close_state(){return close;}
	
	public void open(){
			fan_state.open();
		}
	public void close(){
			fan_state.close();
		}
		
	
}