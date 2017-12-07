//Susan Lin
//APCS1 pd2
//HW12--- stAtistically sPeaking
//2017-10-05

public class Stats{
    public static void main(String[] args) {
	/*	System.out.println(mean(2, 4, 4)); //should be 5
	System.out.println(mean(2.0, 4.0, 4.0)); //should be 5.0
	System.out.println(max(2, 4, 7)); //should be 7
	System.out.println(max(2.0, 4.0, 7.0)); //should be 7.0
	System.out.println(max(3.0, 3.0, 9.0)); //should be 9.0
	System.out.println(geoMean(3, 3, 9)); //should be 9
	System.out.println(geoMean(3.0, 3.0, 9.0)); //should be around 9.0
	*/
	System.out.println(gcd(54,24));
    }

    //should return the int mean of two ints 
    public static int mean(int a, int b, int c) {
	return (a + b + c) / 3; 
    }

    //should return the double mean of two doubles 
    public static double mean(double a, double b, double c) {
	return (a + b + c) / 3; 
    }

    //should return the bigger int of two ints 
    public static int max(int a, int b, int c) {
	int answer = 0;
	if (a >= b && a >= c)
	    {return a;}
	if (b >= c)
	    {return b;}
	else {return c;} 
    }

    //should return the bigger double of two doubles 
    public static double max(double a, double b, double c) {
	double answer = 0;
	if (a >= b && a >= c)
	    {return a;}
	if (b >= c)
	    {return b;}
	else {return c;} 
    }

    //should return the int geometric mean of two ints 
    public static int geoMean(int a, int b, int c) {
	return (int)Math.sqrt(a * b * c) ;  	
    }

    //should return the double geometric mean of two doubles 
    public static double geoMean(double a, double b, double c) {
	return (int)Math.sqrt(a * b * c) ;  	
    }
//Euclid's Algorithm for calculating the greatest common divisor asks first if one of the two numbers is 
//able to divide into the other with no remainder. If so, the that number is the greatest common divisor. 
//If not, then the greater of thw two numbers must be first determined so that we can guarantee a nonnegative
//number. Then once the larger of the two is determined, we can subtract the lesser number from the greater sum 
//until one of the numebrs eventually reaches zero. The other nonzero number is then the greatest common 
//divisor. 
    public static int gcd (int a, int b) { 
      int ans = 1; 
      int holder = ans; 
      if (a == b) 
      {ans = a;} 
      else if (a > b) { 
         while (b >= holder) { 
            if (a % holder == 0 && b % holder == 0){
               ans = holder; 
               holder += 1;} 
            else {holder += 1;} 
         } 
      } 
      else { 
         while (a >= holder) { 
            if (a % holder == 0 && b % holder == 0)
            {ans = holder; 
		holder += 1;} 
            else {holder += 1;} 
         } 
      } 
      return ans; 
} 

    /*		    
    //employs Euclid's algorithm recursively	 
    public static int gcdER(int a, int b) {
	int large = max(a,b);
	// find the max of a and b, set the result to large
	int small = min(a,b);
	//find the min of a and b, set the result to small
	if (small == 0) {
	    return large; // base case
	} else {
	    int c = max(large - small, small); 
	    int d = min(large - small, small);
	    large = c;
	    small = d;
	    /* keep resetting large and small with the result of min and max method on (large - small) and small until base case is reached 
	    return(gcdER(c,d));
	}
    }

    //employs Euclid's algorithm iteratively with a while loop
    public static int gcdEW(int a, int b) {
	int large = max(a,b);
	int small = min(a,b);
	//keep resetting large and small with the result of min and max method on (large - small) and small until small is 0
	while (small != 0) {
	    int c = max(large - small, small);
	    int d = min(large - small, small);
	    large = c;
	    small = d;
	}
	return large; //once small is 0, loop is broken and return large
    } */
}

