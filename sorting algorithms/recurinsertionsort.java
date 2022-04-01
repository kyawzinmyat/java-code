public class Main {
	public static void main(String[] args) {
		int[] array = new int[3];
		array[0]=2;
		array[1]=4;
		array[2]=3;
		Sort pm = new Sort(array);	
		pm.sort();
		pm.show();
	}
}

class PreMax{	
	
	public int premax(int n ,int[] c_array){
			if(n >0){
					int j = this.premax(n-1,c_array);
					int c = c_array[j];
					//System.out.println(c_array[j]);
					int p = c_array[n];
					if(c>p){
						
						return j;
					}
					else{
							return n;
						}
	
			}				
			else{
					return n;
				}
		}	
}

class Sort{
	int[] array;
	PreMax pm = new PreMax();
	int n;
	public Sort(int[] c_array){
			array = c_array;
			n = array.length-1;
		}
	
	
	
	public void sort(){
		for(int i=0;i<n+1;i++){
			int j = pm.premax(n,array);
			int temp = array[i];
			array[i]= array[j];
			array[j]= temp;
		}
	}
	
	public void show(){
			for(int i=0;i<n+1;i++){
						System.out.println(array[i]);
				}
		}
	
	
	}