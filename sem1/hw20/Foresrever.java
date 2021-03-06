///Susan Lin
//APCS pd 2
//hw20 -- For the Love of Strings
//2017-10-20

public class Foresrever {
    
    public static void main (String [] args) {
	//tests for fence with for loop
	System.out.println("------FENCE FOR LOOP------");
	System.out.println("should be nothing: " + fenceF(0));
	System.out.println("should be |: " + fenceF(1));
	System.out.println("should be |--|: " + fenceF(2));
	System.out.println("should be |--|--|: " + fenceF(3));
	//test for reverse with recursion
	System.out.println("------REVERSE WITH RECURSION------");
	System.out.println("should be olleH: " + reverseR("Hello"));
	//test for reverse with for loop
	System.out.println("------REVERSE FOR LOOP------");
	System.out.println("should be olleH: " + reverseF("Hello"));
	//I used the test below to experiment with substring() and length() 
	System.out.println("should be e: " + "Hello Su".substring(1, 2));
	System.out.println("should be 8: " + "Hello Su".length());
	System.out.println("should be 5: " + ("Hello Su".substring(0, 5)).length());
    }

    //takes a nonnegative post number and builds a fence with that amount of posts 
    public static String fenceF(int posts){
	String ans = "";
	int x;
	for (x = 1; x <= posts; x ++) {
	    if (x == posts)
		{ans += "|";}
	    else
		{ans += ("|--");}
	}
	return ans; 
    }

    //takes a string and put the last char first and second to last as
    //second and so forth via a for loop 
    public static String reverseF(String a) {
	String ans = ""; 
	int x;
	for (x = a.length(); x > 0; x --) {
	    ans += a.substring(x - 1, x); 
	}
	return ans;
    }

    //takes a string and put the last char first and second to last as
    //second and so forth via recursion  
    public static String reverseR(String a) {
	String ans = "";
	int place = a.length();
	if (place == 1)
	    {ans += a.substring(0, 1);}
	else {
	    ans += a.substring(place - 1, place);
	    ans += reverseR(a.substring(0, place - 1)); 
	}
	return ans; 
    } 
    
} 
