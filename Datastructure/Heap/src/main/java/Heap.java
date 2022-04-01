
import java.lang.Math;


public class Heap {
	int[] array;
	int size;
	int counter = 0;

	public Heap(int new_size) {
		size = new_size;
		array = new int[size];
	}

	public boolean check_range() {
		if (counter < size) {
			return true;
		} else {
			return false;
		}
	}


	public boolean is_valid(int index) {
		if (index != -1 && index < size) {
			return true;
		} else {
			return false;
		}
	}


	public int indexOf(int value) {
		int i = -1 ;
		for (int j = 0; j < size; j++) {

			if (array[j] == value) {
				i = j;
				break;
			}
		}
		return i;
	}


	public int parent_formula(int index) {
		double temp = (index + 1) / 2;
		int ans = (int) Math.floor(temp) - 1;
		return ans;
	}

	public int get_parent(int value) {
		int index = indexOf(value);
		if (is_valid(index) && index > 0) {
			int ans = parent_formula(index);
			return array[ans];
		} else {
			return -1;
		}
	}

	public int child_formula(int index, int num) {
		return (2 * index) + num;
	}

	public boolean check_left_child(int index) {
		int com = child_formula(index, 1);
		if (com < counter) {
			return true;
		} else {
			return false;
		}

	}

	public boolean check_right_child(int index) {
		int com = child_formula(index, 2);
		if (com < counter) {
			return true;
		} else {
			return false;
		}

	}


	public int get_left_child(int value) {
		int index = indexOf(value);
		int index_of_child = -1;
		if (check_left_child(index)) {
			index_of_child = child_formula(index, 1);
			return array[index_of_child];

		} else {
			return -1;
		}

	}

	public int return_greater(int first, int sec) {
		if (first > sec) {
			return first;
		} else {
			return sec;
		}
	}


	public void swap(int f_index, int s_index) {
		int temp = array[f_index];
		array[f_index] = array[s_index];
		array[s_index] = temp;
	}


	public int get_right_child(int value) {
		int index = indexOf(value);
		int index_of_child = 0;
		if (check_right_child(index)) {
			index_of_child = child_formula(index, 2);
			return array[index_of_child];
		} else {
			return -1;
		}



	}

	public void add(int value) {
		if (check_range()) {
			array[counter] = value;
			counter++;
		}
	}

	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}

	}


}