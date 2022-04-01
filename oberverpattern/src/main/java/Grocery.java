import java.util.ArrayList;
class Grocery implements Subject {
	private double discount;
	private double open_time;
	private double close_time;
	private ArrayList<Observers> customers;
	
	public Grocery(){
			customers = new ArrayList<Observers>();
		}
	
	@Override
	public void register(Observers new_customer){
			customers.add(new_customer);
		}
		
	@Override
	public void notify_(){
			for(Observers customer:customers){
					customer.update(open_time,close_time,discount);
				}
			
		}
		
	public void set_open_time(double new_time){
			this.open_time = new_time;
			notify_();
		}
	public void set_close_time(double new_time){	
		this.close_time = new_time;
		notify_();
	}
	
	public void set_discount(double new_discount){
			this.discount = new_discount;
			notify_();
		}
		
		
		
}