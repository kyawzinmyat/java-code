public class SaladShop extends Shop{
	String meal = "Salad";
	public void prepare(){
			System.out.println("We are making your salad");
			pack(meal);
			deliver(meal);
		}
		
}