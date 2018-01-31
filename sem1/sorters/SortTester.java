import java.util.ArrayList; 

public class SortTester {
    public static ArrayList populate( int size, int lo, int hi ) {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }
    
    public static void main (String[] args) {
	// BEST CASE FOR ALL: ALREADY SORTED
	ArrayList<Comparable> sorted = new ArrayList<>() ;
	sorted.add(1);
	sorted.add(2);
	sorted.add(3);
	
	System.out.println(sorted);
	MySorts.bubbleSortV(sorted);
	System.out.print(sorted);
	System.out.println();

	System.out.println(sorted);
	MySorts.selectionSortV(sorted);
	System.out.print(sorted);
	System.out.println();
	
	System.out.println(sorted);
	MySorts.insertionSortV(sorted);
	System.out.println(sorted);
	System.out.println();

	//WORST CASE FOR BUBBLES: 	
	ArrayList bubbles = populate(10, 0, 100);
	System.out.println(bubbles);
	MySorts.bubbleSortV(bubbles);
	System.out.print(bubbles);
	System.out.println();

	//WORST CASE FOR SELECTION: 
	ArrayList select = populate(10, 0, 100);
	System.out.println(select);
	MySorts.selectionSortV(select);
	System.out.print(select);
	System.out.println();

	//WORST CASE FOR INSERTION: 
	ArrayList insert = populate(10, 0, 100);
	System.out.println(insert);
	MySorts.insertionSortV(insert);
	System.out.println(insert);

    } 
} 
