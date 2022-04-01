
abstract class Android {
	private int price;
	private String version;
	
	 public void call(){
	 		System.out.println("Calling");
	 	} 
	 public void open(){
	 		System.out.println("Open the phone");
	 	}
	 public void close(){
	 		System.out.println("Close the phone");
	 	}
	 public void set_version(String new_version){
	 		this.version = new_version;
	 	}
	 public  void set_price(int new_price){
	 		this.price = new_price;
	 	}
}