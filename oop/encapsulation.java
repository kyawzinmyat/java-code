public class Main {
	public static void main(String[] args) {
		Pizza pizza1 = new Pizza("Classic Cheese",12000);
		pizza1.set_price(130000);
		System.out.println(pizza1.get_price());
	}
	
}


class Pizza{
	private String name;
	private int price;
	Pizza(String name,int price){
			set_name(name);
			set_price(price);
		}
	public void set_name(String name){
			this.name = name;
		}
	public void set_price(int price){
			this.price = price;
		}
	public String get_name(){
			return name;
		}
	public int get_price(){
			return price;
		}	
	
	}