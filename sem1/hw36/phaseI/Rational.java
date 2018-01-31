//Susan Lin
//apcs pd02
//hw36--- be rational
//2017-11-20

public class Rational {
    private int denominator;
    private int numerator;

    //default constructor sets Rational to 0/1 
    public Rational() {
	denominator = 1;
	numerator = 0;
    }

    //constructor takes two ints and sets them as the numerator and denominator
    public Rational(int num, int denom) {
	this();
	if (denom != 0){ 
	denominator = denom;
	numerator = num; }
	else 
	    System.out.println("you can't have a zero denominator"); 
    }

    //prints out string representation of Rational 
    public String toString() {
	String num = numerator + "/";
	num += denominator;
	return num; 
    }

    //returns the most precise value of Rational
    //typecasts to avoid loss of precision 
    public double floatValue() {
	return (double)numerator/denominator;
    }

    //takes another Rational and multiplies the two 
    public void multiply (Rational x) {
	numerator *= x.numerator;
	denominator *= x.denominator; 
    }

    //takes another Rational and multiplies the reciprocal of that Rational
    //with this Rational 
    public void divide (Rational x) {
	if (x.numerator != 0) { 
	numerator *= x.denominator;
	denominator *= x.numerator; }
	else 
	    System.out.println("you can't divide this"); 
    }

    public static int max (int a , int b) {
	if (a >= b)
	    return a;
	return b; 
    } 
    
    public static int min (int a , int b) {
	if (a >= b)
	    return b;
	return a; 
    }
    
    public static int gcd (int a, int b) {
	int large = max (a, b);
	int small = min (a, b);
	while (small != 0) {
	    int c = max (large - small, small);
	    int d = min(large - small, small);
	    large = c;
	    small = d; 
	}
	return large; 
    }

    public static int lcm (int a, int b) {
	return (a * b) / gcd(a, b); 	
    }

    public void add (Rational x) {
	int lcmA = lcm(this.denominator, x.denominator);
	int multiplierTHIS = lcmA / x.denominator;
	int multiplierX = lcmA / this.denominator;
	numerator = (numerator * multiplierTHIS) + (x.numerator * multiplierX);
	denominator = lcmA; 
    }

    public void subtract (Rational x) {
	int lcmA = lcm(this.denominator, x.denominator);
	int multiplierTHIS = lcmA / x.denominator;
	int multiplierX = lcmA / this.denominator;
	numerator = (numerator * multiplierTHIS) - (x.numerator * multiplierX);
	denominator = lcmA; 
    }

    public void reduce () {
	numerator /= gcd(numerator, denominator);
	denominator /= gcd(numerator, denominator); 
    } 

    public int compareTo (Rational x) {
	if (x.floatValue() == this.floatValue())
	    return 0;
	else if (this.floatValue() > x.floatValue())
	    return 1;
	return -1; 
    } 
    
    public static void main (String[] args) {
	Rational r = new Rational(2,3);
	Rational s = new Rational (1,2);
	System.out.println("-----------fractional values-----------");
	System.out.println(r.toString()); //should return 2/3
	System.out.println(s.toString()); //should return 1/2

	System.out.println();
	
	//tests floatValue
	System.out.println("-----------float values-----------");
	System.out.println(r.floatValue()); //should return .66666666
	System.out.println(s.floatValue()); //should return .5
	/*
	System.out.println();
	System.out.println("-----------multiply values-----------");
	
	r.multiply(s);
	System.out.println(r.toString()); //should return 2/6

	s.multiply(r);
	System.out.println(r.toString()); //should return 2/6

	System.out.println();
	System.out.println("-----------divide values-----------");
	
	r.divide(s);
	System.out.println(r.toString()); //should return 24/12
	//I multiplied beforehand 

	s.divide(r);
	System.out.println(r.toString()); //should return 24/12 
	//I multiplied beforehand

	System.out.println();
System.out.println("-----------max values-----------");
	System.out.println(max(2,3));
	
	System.out.println();
	System.out.println("-----------gcd-----------");
	
	System.out.println(gcd(2, 3));
	System.out.println(gcd(25, 5));
	System.out.println(gcd(54, 24));

	System.out.println();
	System.out.println("-----------lcm values-----------");
	
	System.out.println(lcm(25, 5));
	System.out.println(lcm(25, 75));
	System.out.println(lcm(23, 53)); 
	
	
	System.out.println();
	System.out.println("-----------add values-----------");

	r.add(s);
	System.out.println(r.toString());
	//s.add(r);
	//System.out.println(s.toString());

	System.out.println();
	System.out.println("-----------subtract values-----------");

	r.subtract(s);
	System.out.println(r.toString());
	//s.subtract(r);
	//System.out.println(s.toString());
	*/
	System.out.println();
	System.out.println("-----reduce-----"); 
	
	r.reduce();
	System.out.println(r.toString());
	
	System.out.println();
	System.out.println("-----compare to-----"); 
        
	System.out.println(s.compareTo(r));

    } 
} 
