import java.util.ArrayList;

public class BubbleSort {

    public static ArrayList populate( int size, int lo, int hi ) {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }

    public static void shuffle( ArrayList al ) {
	int randomIndex;
	for( int i = al.size()-1; i > 0; i-- ) {
	    randomIndex = (int)( (i+1) * Math.random() );
	    al.set( i, al.set( randomIndex, al.get(i) ) );
	}
    }

    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
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

    // ArrayList-returning bubbleSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input ){
	for (Comparable a: input) { 
	    for (int x = 0; x < input.size() -1; x++) {
		if (input.get(x).compareTo(input.get(x+1)) > 0){
		    Comparable y = input.get(x);
		    input.set(x, input.get(x+1));
		    input.set(x+1, y); 
		} 
	    }
	}
	ArrayList<Comparable> data = new ArrayList<>(); 
	for (int x = 0; x < input.size(); x++) {
	    data.add(x, input.get(x)); 
	} 
	return data; 
    }

	public static void main( String [] args ){
	    /*
	      ArrayList glen = new ArrayList<Integer>();
	      glen.add(7);
	      glen.add(1);
	      glen.add(5);
	      glen.add(12);
	      glen.add(3);
	      System.out.println( "ArrayList glen before sorting:\n" + glen );
	      bubbleSortV(glen);
	      System.out.println( "ArrayList glen after sorting:\n" + glen );

	      ArrayList coco = populate( 10, 1, 1000 );
	      System.out.println( "ArrayList coco before sorting:\n" + coco );
	      bubbleSortV(coco);
	      System.out.println( "ArrayList coco after sorting:\n" + coco );
*/
	      ArrayList glen = new ArrayList<Integer>();
	      glen.add(7);
	      glen.add(1);
	      glen.add(5);
	      glen.add(12);
	      glen.add(3);
	      System.out.println( "ArrayList glen before sorting:\n" + glen );
	      ArrayList glenSorted = bubbleSort( glen );
	      System.out.println( "sorted version of ArrayList glen:\n" 
	      + glenSorted );
	      System.out.println( "ArrayList glen after sorting:\n" + glen );

	      ArrayList coco = populate( 10, 1, 1000 );
	      System.out.println( "ArrayList coco before sorting:\n" + coco );
	      ArrayList cocoSorted = bubbleSort( coco );
	      System.out.println( "sorted version of ArrayList coco:\n" 
	      + cocoSorted );
	      System.out.println( "ArrayList coco after sorting:\n" + coco );
	      System.out.println( coco );

	}//end main

    }//end class BubbleSort
