public class Stack {
	private static  int size; 
	private static int current=0;
	private static int[] array ;
	
	
	public Stack(int n_size){
			size = n_size;
			array =new  int[n_size];
		}
		
		
	public static void push(int item){
			if(current<size){
					array[current]=item;
					current++;
				}
		}
		
		
	public static  void push_all(int[] array){
			for(int i=0;i<array.length;i++){
					Stack.push(array[i]);
				}
		}
		
	public void pop(){
			if (current>=0){
					array[current-1]= 0;
					current--;
				}
		}
	
	public static void print() {
		for (int i = size-1; i >=0; i--) {
				System.out.println(" ____________");
				System.out.println("|" + "__" + i + "__" + "|"  + "__" + array[i] + "__" + "|");
				}
		}	
}