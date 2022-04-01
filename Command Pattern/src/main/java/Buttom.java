public class Buttom {
	Command command;
	public Buttom(Command new_command){
			command = new_command;	
		}
	public void  pressed(){
			command.execute();
		}
}