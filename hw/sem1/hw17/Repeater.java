//Susan Lin
//APCS pd 2
//hw17 -- Do I repeat myself?
//2017-10-17 

public class Repeater {
    public static  String fenceW (int numPosts) {
	String fence = "";
	while (numPosts > 0) {
	    if (numPosts == 1) {
		fence += "|";
		numPosts -= 1;   
	    }
	    else {
		fence += "|--";
		numPosts -= 1; 
	    } 
	}
	return fence; 
    } 

    public static String fenceR(int numPosts) {
	if (numPosts == 1) {
	    return "|"; 
	} 
	return "|--" + fenceR( numPosts - 1); 
    } 
    
    public static void main (String [] args) {
	//	System.out.println( fenceW(1) );
	//	System.out.println( fenceW(3) );
        //System.out.println( fenceW(0));
	//System.out.println( fenceR(1) );
	System.out.println( fenceR(3) );
    } 
} 
