import java.util.ArrayList;

public class InsertionSort {
    public static ArrayList populate( int size, int lo, int hi ) {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
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

    public static void insertionSortV( ArrayList<Comparable> data ) {
	for (int x = 1; x < data.size(); x++) {
	    for (int a = 0; a < x; a++) {
		if (data.get(a).compareTo(data.get(x)) > 0) 
		    data.set(a, data.set(x, data.get(a))); 
	    } 
	} 
	
    }//end insertionSortV

    public static ArrayList<Comparable>
	insertionSort( ArrayList<Comparable> input ) {
	insertionSortV(input); 
	return input; 
    }//end insertionSort


    public static void main( String [] args ) {
	/*
	  System.out.println("\n*** Testing sort-in-place (void) version... *** ");
	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "\nArrayList glen before sorting:\n" + glen );
	  insertionSortV(glen);
	  System.out.println( "\nArrayList glen after sorting:\n" + glen );

	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "\nArrayList coco before sorting:\n" + coco );
	  insertionSortV(coco);
	  System.out.println( "\nArrayList coco after sorting:\n" + coco );
	*/

	  System.out.println( "*** Testing non-void version... *** " );
	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "\nArrayList glen before sorting:\n" + glen );
	  ArrayList glenSorted = insertionSort( glen );
	  System.out.println( "\nsorted version of ArrayList glen:\n" 
	  + glenSorted );
	  System.out.println( "\nArrayList glen after sorting:\n" + glen );

	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "\nArrayList coco before sorting:\n" + coco );
	  ArrayList cocoSorted = insertionSort( coco );
	  System.out.println( "\nsorted version of ArrayList coco:\n" 
	  + cocoSorted );
	  System.out.println( "\nArrayList coco after sorting:\n" + coco );
	  System.out.println( coco );

    }//end main
}//end class InsertionSort
