class Customers implements Observers {
	double open_time;
	double close_time;
	double discount;
	Subject grocery;
	
	public Customers(){
			grocery = new Grocery();	
		}
	public void update(double open_time,double close_time,double discount){
			this.open_time = open_time;
			this.close_time = close_time;
			this.discount = discount;
			printupdate();
		}
	public void printupdate(){
			System.out.println("Our grocery open at "+this.open_time+"\n"+"Our grocery close at"+this.close_time+"\n"+"Currently discount is"+this.discount);
		}
}