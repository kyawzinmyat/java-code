import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		int[] array = new int[4];
		array[0]=5;
		array[1]= 4;
		array[2]=3;
		array[3]=2;
		InsSort item = new InsSort(array);
		item.sort();
		item.show();
	}
}


class InsSort{
	int[] array;
	int size;
	ArrayList<Integer> result= new ArrayList<Integer>();
	public InsSort(int[] new_array){
			array = new_array;
			size = array.length;
		}
	public void sort(){
			
			for(int i =0;i<size;i++){
					int j = i;
					while(j<size-1){
							if(array[i]>array[j+1]){
									int temp = array[i];
									array[i]= array[j+1];
									array[j+1]= temp;
									//current = array[j+1];
								}
							else{
									j++;
								}
						}
				}	
		}
		public void show(){
				for(int i=0;i<size;i++){
					result.add(array[i]);
				}
				System.out.println(result);					
			}
	
	}