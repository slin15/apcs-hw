import java.util.ArrayList; 

public class MySorts {

    /*the best case of selection sort is O(n) comparisions and swaps 
      beacuse it will go through size() times and no more 
      because it sorts every element 

      the worst case of selection sort is the same as the best case 
      and the run-time will be the same as well 
     */
    public static void selectionSortV( ArrayList<Comparable> data )  {
	for (int x = 0; x < data.size() - 1; x++) {
	    int index = x;
	    for (int y = x + 1; y < data.size(); y++) {
		if (data.get(y).compareTo(data.get(index)) < 0)
		    index = y;
	    }
	    data.set(x, data.set(index, data.get(x))); 
	} 
    }

    /* the best case of insertion sort is O(n) comparisons and O(1) swaps 
       because the algorithm will run trhough all the elements (ascending order)
       and never swap because every element is already sorted and then being
       sorted into the "sorted section" 

       the worst case of insertion sort is O(n^2) comparisons and swaps 
       because the algorithm will need to compare to every element 
       in the already sorted array and then swap, increasing run-time 
     */
    public static void insertionSortV( ArrayList<Comparable> data ) {
	for (int x = 1; x < data.size(); x++) {
	    for (int a = 0; a < x; a++) {
		if (data.get(a).compareTo(data.get(x)) > 0) 
		    data.set(a, data.set(x, data.get(a))); 
	    } 
	}
    }

    /*the best case of bubble sort is O(n) ascending order 
      because bubble sort inherently goes through every element but will 
      only need to pass through the arrayList size() times 
n      and no swaps are necessary 
      
      the worst case of bubble sort is O(n^2) descending order 
      because then you have to shift every element 
      and shift every element every pass, taking up run-time 
      */
    public static void bubbleSortV( ArrayList<Comparable> data ) {
	for (Comparable a: data) { 
	    for (int x = 0; x < data.size() -1; x++) {
		if (data.get(x).compareTo(data.get(x+1)) > 0){
		    Comparable y = data.get(x);
		    data.set(x, data.get(x+1));
		    data.set(x+1, y); 
		} 
	    }
	}
    }

    /*add method

      best case: O(1)

      worst case:  O(log2(n))

     */
    
    /*addBin 

      best case: O(1) 
      when the middle element is equal to or the least less than the input 
      then the algorithm will stop 

      worst case: O(n^2) 
      when the input is very close to the extremes of the range or to but not 
      being the middle element of the array 
      because it will then have to run the maximum number of times 
      (ceiling(2^n) = size())

     */
	
    public static void main (String[] args) {
    } 
} 
