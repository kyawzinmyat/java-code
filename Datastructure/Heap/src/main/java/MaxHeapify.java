public class MaxHeapify extends Heap {
	
	int temp=1;
	
	public MaxHeapify(int new_size) {
		super(new_size);
	}

	public void add(int value) {
		super.add(value);
		heapify_up();
	
	}

	public void heapify_up() {
		if (counter > 1) {
			if (first_lessthan_sec(get_parent(array[counter - 1]), array[counter - 1])) {
				;
				swap(counter - 1, parent_formula(counter - 1));
				heapify_up(parent_formula(counter - 1));
			}
		}
	}


	public void heapify_up(int c_index) {
		if (c_index > 0) {
			if (first_lessthan_sec(get_parent(array[c_index]), array[c_index])) {
				;
				swap(c_index, parent_formula(c_index));
			}
			heapify_up(parent_formula(c_index));
		}

	}

	

	


	public boolean first_lessthan_sec(int first, int sec) {
		if (first < sec) {
			return true;
		} else {
			return false;
		}
	}

	public void delete () {
		if (counter != 0) {
			swap(0, counter - 1);
			counter--;
			heapify_down();
		}
	}


	public void heapify_down() {
		int g_child = return_greater(get_left_child(array[0]), get_right_child(array[0]));
		if (g_child > array[0]) {
			int temp = indexOf(g_child);
			swap(0, indexOf(g_child));
			heapify_down(temp);
		};
	}

	public void heapify_down(int index) {
		if (index < size - 1) {
			int g_child = return_greater(get_left_child(array[index]), get_right_child(array[index]));
			if (g_child > array[index]) {
				int temp = indexOf(g_child);
				swap(index, indexOf(g_child));
				heapify_down(temp);
			}
		}
	}
	
}