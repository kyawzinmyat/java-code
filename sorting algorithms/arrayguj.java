public class Main {
	public static void main(String[] args) {
		int[] array = new int[5];
		print_Array(array);
	}
	public static void print_Array(int[] array) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			System.out.println(" ____________");
			System.out.println("|" +"__"+i+"__"+ "|"+"|"+"__"+array[i]+"__"+"|");			
		}
	}
}

