public class Adapter  implements Attacker{
	Samuri samuri;
	
	
	public Adapter(Samuri new_attacker){
			samuri = new_attacker;
		}
	
	
	public void punch(){
			samuri.throw_shuriken();
		}
	
	public void smash(){
			samuri.cut();
		}
	
	
}