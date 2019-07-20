
public class SelectionSort {
	
	// It looks like doubling the size of the array increases the number of comparisons by a factor of 4 for an array in descending order. 
	// For instance, hi2Lo made 250,000 comparisons for 1,000 elements, 1,000,000 comparisons for 2,000 elements, and 4,000,000 comparisons 
	// for 4,000 elements. 1,000,000 divided by 250,000 is 4 and 4,000,000 divided by 1,000,000 is 4.  	
	
	// For an array in a random order, the increase factor is is closer to 2. For instance, random made 5,401 comparisons for 1,000 elements, 
	//	12,099 comparisons for 2,000 elements, and 27,236 comparisons for 4,000 elements. 12,099 divided by 5,401 is 2.2 and 27,236 divided 
	//	by 12,099 is 2.3.
	
	public static void main(String[] args) {
		
		final int NUM_ELEMENTS =4000;
		
		double[] lo2Hi = new double[NUM_ELEMENTS];
		double[] hi2Lo = new double[NUM_ELEMENTS];
		double[] random = new double[NUM_ELEMENTS];
		
		for ( int i = 0; i < NUM_ELEMENTS; i++) {
			lo2Hi[i] = (double)i+1;
		}
		
		for ( int i = 0; i < NUM_ELEMENTS; i++) {
			hi2Lo[i] = (double)NUM_ELEMENTS-i;
		}
		
		for ( int i = 0; i < NUM_ELEMENTS; i++) {
			random[i] = Math.random();
		}
		
		selectionSort(lo2Hi);
		selectionSort(hi2Lo);
		selectionSort(random);
		
	}
	
	/** The method for sorting the numbers */
	public static void selectionSort(double[] list) {
		
		int comparisons = 0;
		int swaps = 0;
	  
		for (int i = 0; i < list.length - 1; i++) {
			
			// Find the minimum in the list[i..list.length-1]
			double currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				comparisons++;
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
	
			// Swap list[i] with list[currentMinIndex] if necessary;
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
				swaps++;
			}
		}
		
		System.out.println("Sorted array size: " + list.length);
		System.out.println("Number of comparisons " + comparisons);
		System.out.println("Number of Swaps: " + swaps);
		System.out.println("");
		
	}
}
