public class Queue {
	private static  int size; 
	static int current=0;
	private static int[] array ;
	
	
	public Queue(int n_size){
			size = n_size;
			array =new  int[n_size];

		}
		
		
	public static void get_value(int index){
				if(index<current){
					System.out.println(array[index]);
				}
				else{
						System.out.println("Queue index out of range");	
					}
			}
		
		
	public static void insert(int item){
			if(current<size){
					array[current]=item;
					current++;
				}
		}
		
		
		
	public static void remove(){
			if (current>=0){
					shift();	
					current--;
					array[current]=0;
				}
		}
		
		
		
	public static void shift(){
			for(int j=1;j<current;j++){
					array[j-1]=array[j];
				}	
		}	
	
	public static void print(){
		for (int i = 0; i <size; i++) {
				System.out.print("|" + "__" +array[i] + "__" + "|");
		}
				
		}	
}