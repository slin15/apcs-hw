//Susan Lin
//APCS1 pd 2
//HW -- Get It While You Can
//2017-10-16

public class Driver {
    public static void main( String[] args ) {

	//test default constructor
	Coin mine = new Coin();

	//test 1st overloaded constructor
	Coin yours = new Coin( "quarter" );

	//test 2nd overloaded constructor
	Coin wayne = new Coin( "dollar", "heads" );
	
	//test toString() methods of each Coin
	System.out.println("mine: " + mine);
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);

	//test flip() method
	System.out.println("\nAfter flipping...");
	yours.flip();
	wayne.flip();
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne); 

	
	//flipping until...
	System.out.println("\nAfter flipping for 4 heads...");
	int count = yours.getHeadsCtr();
	while (count < 4) {
	    yours.flip();
	   	count = yours.getHeadsCtr();
	}
	System.out.println("yours: " + yours.getHeadsCtr());
	
	System.out.println("------------------------------");
	
	System.out.println("\nAfter flipping for 4 matches...");
	int count2 = 0;
	while (count2 < 4) {
	    wayne.flip();
	    yours.flip(); 
	    if (yours.equals(wayne)) {
		    count2 += 1; 
		} 
	}
	System.out.println("number of matches: " + count2);
	
	System.out.println("\nAfter flipping for at least 13000  matches and the divisible by 2001...");
	int count3 = 0; 
	while (count3 < 15000) {
	    yours.flip();
	    wayne.flip();
	    if (yours.equals(wayne)) {
		count3 += 1;
	    }
	    if (count3 >= 13000 &&
		count3 % 2001 == 0) {
		int matches = count3;
		count3 = 15000;
		System.out.println("matches: " + matches); 
	    } 
	}  
	
	
	//test equals() method
	if ( yours.equals(wayne) ) 
	    System.out.println( "Matchee matchee!" );
	else
	    System.out.println( "No match. Firestarter you can not be." );
	

	
    }//end main()
}//end class
