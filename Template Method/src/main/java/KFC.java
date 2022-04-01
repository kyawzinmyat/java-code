public class KFC extends Shop{
	String meal = "KFC fried chicken";
	public void prepare(){
			System.out.println("We are frying the chicken");
			pack(meal);
			deliver(meal);	
		}	
}