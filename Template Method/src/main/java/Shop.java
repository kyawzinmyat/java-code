public abstract class Shop {
	public void deliver(String meal){
			System.out.println("We\'re delivering your order  /"+meal);
		}
		
	public void pack(String meal){
			System.out.println("We\'re packing your order /  "+meal);	
		}
	public abstract void prepare();
		
	
}