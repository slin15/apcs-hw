import java.util.ArrayList;

public class SelectionSort {
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

    public static void selectionSortV( ArrayList<Comparable> data )  {
	for (int x = 0; x < data.size() - 1; x++) {
	    int index = x;
	    for (int y = x + 1; y < data.size(); y++) {
		if (data.get(y).compareTo(data.get(index)) < 0)
		    index = y;
	    }
	    data.set(x, data.set(index, data.get(x))); 
	} 
    }//end selectionSortV

    public static ArrayList<Comparable>
	selectionSort( ArrayList<Comparable> input ) {
	ArrayList<Comparable> data = new ArrayList<>();
	for (Comparable x: input)
	    data.add(x);
	selectionSortV(data); 
	return data; 
      
    }//end selectionSort 

    public static void main( String [] args ) {
	/*
	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
	  selectionSortV(glen);
	  System.out.println( "ArrayList glen after sorting:\n" + glen );

	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  selectionSortV(coco);
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
	  ============================================*/

	ArrayList glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	ArrayList glenSorted = selectionSort( glen );
	System.out.println( "sorted version of ArrayList glen:\n" 
			    + glenSorted );
	System.out.println( "ArrayList glen after sorting:\n" + glen );

	ArrayList coco = populate( 10, 1, 1000 );
	System.out.println( "ArrayList coco before sorting:\n" + coco );
	ArrayList cocoSorted = selectionSort( coco );
	System.out.println( "sorted version of ArrayList coco:\n" 
			    + cocoSorted );
	System.out.println( "ArrayList coco after sorting:\n" + coco );
	System.out.println( coco );

    }//end main

}//end class SelectionSort
