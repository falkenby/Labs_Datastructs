
public class LinSearchIntSet implements IntSet {

	//Variables
	//int[intArray] = element;
	int size = 0;
	int capacity = 1;
	int[] intArray;	
	
	public LinSearchIntSet() {
		if(capacity < 1) {
			throw new IllegalArgumentException("Capacity cannot be less than 0.");
		}
		intArray = new int[capacity];
	}
	
	public void add(int element) {
		if(capacity == size) {
			capacity = capacity * 2;
		}
		size += 1;
	}

	public boolean contains(int element) {
		if(indexOf(element) != -1){
			return true;
		}
		else {
			return false;
		}
	}

	public void remove(int element) {
		int[] temp = new int[this.size-1];
		int index = indexOf(element);
		if(index == -1) {
		}
		else {
			for(int i = 0; i < this.size; i++) {
				if(index != i) {
					temp[i] += this.intArray[i];
				}
				else {
				}
			}
			
			this.intArray = temp;
		}
		
	}
	
	public int indexOf(int element) {
		for(int i = 0; i < this.size; i++) {
	        if(this.intArray[i] == element) {
	            return i;
	        }
	    }
	    return -1;
	}
	
	public static void main() {
		
	}
}
