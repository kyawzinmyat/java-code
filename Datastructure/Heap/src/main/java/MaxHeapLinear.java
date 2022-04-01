public class MaxHeapLinear extends Heap {
	int temp = size - 1;
	public MaxHeapLinear(int new_size) {
		super(new_size);
	}



	public void linearSort() {
		for (int i = size / 2; i >= 0; i--) {
			heapify_down(i);
		}

		
	}



	public void heapify_down(int index) {
		if (index >= 0) {
			int g_child = return_greater(get_left_child(array[index]), get_right_child(array[index]));
			if (g_child > array[index]) {
				int temp = indexOf(g_child);
				swap(index, indexOf(g_child));
				heapify_down(temp);
			}
		}
	}


}