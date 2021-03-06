//Susan Lin
//apcs pd02
//hw47 -- ascending
//W 2017-12-06

import java.util.ArrayList;

public class OrderedArrayList {
    // instance of class ArrayList, holding objects of type Comparable 
    // (ie, instances of a class that implements interface Comparable)
    private ArrayList<Comparable> _data;

    // default constructor initializes instance variable _data
    public OrderedArrayList() {
	_data = new ArrayList<>(); 
    }

    public String toString() {
	return _data.toString(); 
    }

    public Comparable remove( int index )  {	
    	Comparable ans = _data.get(index); 
	_data.remove(index);
	int passes = 0; 

        while (passes < _data.size() - 1) { 
            for (int i = _data.size() - 1; i > 0; i--) {
                Comparable first = _data.get(i);
                Comparable second = _data.get(i-1);
                if (first.compareTo(second) == -1) {
                    Comparable temp = first;
                    _data.set(i, second);
                    _data.set(i-1, temp);
                }
            }
	    passes += 1;
	}
	return ans; 
    }

    public int size() { 
    	return _data.size();
    }
    
    public Comparable get( int index ) { 
 	return _data.get(index);
    }

    public void add(Comparable newVal) { 
    	_data.add(newVal); 
	int passes = 0; 

        while (passes < _data.size() - 1) { 
            for (int i = _data.size() - 1; i > 0; i--) {
                Comparable first = _data.get(i);
                Comparable second = _data.get(i-1);
                if (first.compareTo(second) == -1) {
                    Comparable temp = first;
                    _data.set(i, second);
                    _data.set(i-1, temp);
                }
            }
	    passes += 1;
	}
    } 

    public static void main( String[] args ) {
	OrderedArrayList Franz = new OrderedArrayList();

	// testing linear search
	for( int i = 0; i < 15; i++ )
	    Franz.add( (int)( 50 * Math.random() ) );
	System.out.println( Franz );

	//check for sorted-ness
	//if msg does not appear, list was sorted
	for( int i=0; i<Franz.size()-1; i++ ) {
	    System.out.println("at i: " + Franz.get(i) );
	    if ( Franz.get(i).compareTo(Franz.get(i+1)) > 0 ) {
		System.out.println( " *** NOT sorted *** " );
		break;
	    }
	}
    }//end main()
}//end class OrderedArrayList
