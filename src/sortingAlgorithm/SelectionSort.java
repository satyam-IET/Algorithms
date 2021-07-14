package sortingAlgorithm;

public class SelectionSort {

	public static void main(String[] args) {
		// This is Selection Sorting algorithm
		
		int[] sort = { 20, 35, -15, 7, 55, 1, -22 };
		
	for(int lastUnsortedIndex = sort.length-1 ; lastUnsortedIndex >0 ; lastUnsortedIndex--) {
		
		int largest = 0;
		for(int i =0; i<= lastUnsortedIndex ; i++) {
			
			if(sort[i] > sort[largest]) {
				
				largest =i;
			}
			
		}
		swap(sort , largest , lastUnsortedIndex);
	}
	
	
    for(int i=0; i < sort.length; i++) {
    	System.out.println(sort[i]);
    }
		

	}
	
	// Writing a method for swapping 
	
	public static void swap(int[] array , int i ,int j){
		
		if(i==j) {
			return;
		}
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}


}
