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
	return _data.remove(index);
    }

    public int size() { 
    	return _data.size();
    }
    
    public Comparable get( int index ) { 
 	return _data.get(index);
    }

    public void add(Comparable newVal) {  
	for (int x = 0; x < _data.size(); x++) {
	    if (newVal.compareTo(_data.get(x)) < 0) {
		_data.add(x, newVal);
		return; 
	    } 
	}
	_data.add(newVal); 
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
