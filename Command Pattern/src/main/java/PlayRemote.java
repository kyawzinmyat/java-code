import java.util.ArrayList ;


public class PlayRemote {
	public void play(){
		EDevice radio = RadioRemote.get_device();
		EDevice tv = TvRemote.get_device();
		ArrayList<EDevice> devices= new ArrayList<EDevice>();
		devices.add(tv);
		devices.add(radio);
		Command allon = new AllOn(devices);
		Buttom buttom1 = new Buttom(allon);
		buttom1.pressed();
	}	
}