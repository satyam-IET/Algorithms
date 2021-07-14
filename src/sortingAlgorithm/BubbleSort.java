package sortingAlgorithm;

public class BubbleSort {

	public static void main(String[] args) {
		// This is Bubble sorting algorithm
		
		int[] sort = { 20, 35, -15, 7, 55, 1, -22 };
		
	for(int lastUnsortedIndex = sort.length-1 ; lastUnsortedIndex >0 ; lastUnsortedIndex--) {
		for(int i =0; i< lastUnsortedIndex ; i++) {
			
			if(sort[i]>sort[i+1]) {
				
				swap(sort, i, i+1);
			
			}
			
		}
	}
	
    for(int i=0; i < sort.length; i++) {
    	System.out.println(sort[i]);
    }
		

	}
	
	// Writing a method for swaping 
	
	public static void swap(int[] array , int i ,int j){
		
		if(i==j) {
			return;
		}
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}

}
