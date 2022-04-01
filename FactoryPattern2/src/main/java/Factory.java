public class Factory {
	TelslaFactory tf = new TelslaFactory();
	
	public Car manufacture_telsla(){
			return tf.manufacture();
		}
}