

public class NoodleBox implements Box {
	
	int size;
	Noodlepack[] box; 
	int current_size=0;
	
	
	public NoodleBox(){
			size  = 12;
			box = new Noodlepack[size];
		}	
	
	@Override
	public int get_price() {
		int price=0;
		for(int i=0;i<current_size;i++){
				price += box[i].get_price();
			}
		return price;
	}
	@Override
	public String get_des() {
		String des ="";
		System.out.println("12 bags of noodle pack");
		for(int i=0;i<current_size;i++){
				des += box[i].get_des()+"\n";
			}
		return des;
		
	}
	
	public void pack(Noodlepack item){
			if(current_size<size){
					box[current_size]=item;
					current_size++;
				}
			else{
					System.out.println("Out of space!");
				}
		}
	
	
}