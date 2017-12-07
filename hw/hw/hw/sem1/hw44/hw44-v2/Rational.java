// Susan Lin 
// APCS1 p02
// HW44 -- implementing an interface, boolean short-circuiting
// 2017-12-01f
public class Rational implements Comparable {
    private int _numerator;
    private int _denominator;

    public Rational() {
	_numerator = 0;
	_denominator = 1;
    }
    public Rational( int n, int d ) {
	this();
	if ( d != 0 ) {
	    _numerator = n;
	    _denominator = d;
	}
	else 
	    System.out.println( "Invalid number. " + "Denominator set to 1." );
    }

    public String toString() {
	return _numerator + " / " + _denominator;
    }
    public double floatValue() {
	return (double)_numerator / _denominator;
    }
    public void multiply( Rational r ) {
	_numerator   = this._numerator   * r._numerator;
	_denominator = this._denominator * r._denominator;
    }
    public void divide( Rational r ) {
	if ( r._numerator != 0 ) {
	    _numerator   = _numerator   * r._denominator;
	    _denominator = _denominator * r._numerator;
	}
	else 
	    System.out.println( "Div by 0 error. Values unchanged." );
    }

    public void add( Rational r ) {
	_numerator = _numerator * r._denominator + r._numerator * _denominator;
	_denominator = _denominator * r._denominator;
    }

    public void subtract( Rational r ) {
	_numerator = _numerator * r._denominator - r._numerator * _denominator;
	_denominator = _denominator * r._denominator;
    }

    public void reduce() {
	int g = gcd();
	_numerator = _numerator / g;
	_denominator = _denominator / g;
    }

    public int gcd() {
	return gcd( _numerator, _denominator );
    }

    public static int gcd( int n, int d ) {
	int a, b, x;
	a = n;
	b = d;

	while( a % b != 0 ) {
	    x = a;
	    a = b;
	    b = x % b;
	}
	return b;
    }

    public boolean equals( Object other ) {
	reduce();
	if ( other instanceof Rational )
	    ((Rational)other).reduce();
	return this == other
	    ||
	    ( other instanceof Rational
	      && this._numerator == ((Rational)other)._numerator
	      && this._denominator == ((Rational)other)._denominator );
    }

    public int compareTo( Object other ) {
	if ( ! (other instanceof Rational) )
	    throw new ClassCastException("\nMy first error message! "
					 + " compareTo() input not a Rational");
	int thisNumerator, otherNumerator;
    
	thisNumerator = _numerator * ((Rational)other)._denominator;
	otherNumerator = _denominator * ((Rational)other)._numerator;

	return thisNumerator - otherNumerator;
    }

    public static void main( String[] args ) {
	Rational r = new Rational( 3, 7 );
	Rational s = new Rational();
	Rational t = new Rational( 8, 5 );
	Rational u = new Rational( 1, 2 );
	Rational v = new Rational( 2, 3 );
	Rational w = new Rational( 8, 12 );
	Rational x = new Rational( 8, 12 );
	String y = "yoo";

	System.out.println("r: " + r );
	System.out.println("s: " +  s );
	System.out.println("t: " +  t );

	System.out.println( r + " as a floating pt approximation: "
			    + r.floatValue() );
	System.out.println( s + " as a floating pt approximation: "
			    + s.floatValue() );
	System.out.println( t + " as a floating pt approximation: "
			    + t.floatValue() );

	System.out.print( r + " * " + t + " = ");
	r.multiply(t);
	System.out.println(r);

	System.out.print( r + " / " + t + " = ");
	r.divide(t);
	System.out.println(r);

	System.out.print( u + " + " + v + " = ");
	u.add(v);
	System.out.println(u);

	System.out.print( u + " - " + v + " = ");
	u.subtract(v);
	System.out.println(u);

	System.out.println( "\nNow testing static gcd...");

	System.out.println("expect 1");
	System.out.print("actual:\t");
	System.out.println( Rational.gcd(100,9) );

	System.out.println("expect 5");
	System.out.print("actual:\t");
	System.out.println( Rational.gcd(245,25) );

	System.out.println( "\nNow testing non-static gcd...");

	System.out.println("Rational r...");
	System.out.println( r );
	System.out.println("expect 40");
	System.out.print("actual:\t");
	System.out.println( r.gcd() );

	System.out.println("Rational t...");
	System.out.println( t );
	System.out.println("expect 1");
	System.out.print("actual:\t");
	System.out.println( t.gcd() );

	System.out.println("Rational w...");
	System.out.println( w );
	System.out.println("expect 4");
	System.out.print("actual:\t");
	System.out.println( w.gcd() );

	System.out.println( "\nNow testing reduce...");
	System.out.println("Rational r...");
	System.out.println( r );
	System.out.print( r + " in reduced form = ");
	r.reduce();
	System.out.println(r);

	System.out.println( "r > t: " +  r.compareTo(t) );
	System.out.println( "r > s: " +  r.compareTo(s) );
	System.out.println( "s > t: " +  s.compareTo(t) );
	//uncommenting the line below should trigger a runtime error
	//  System.out.println( "s > y: " +  s.compareTo(y) );

	System.out.println( "v.equals(v): " + v.equals(v) );
	System.out.println( "v.equals(w): " + v.equals(w) );
	System.out.println( "w.equals(x): " + w.equals(x) );
    }
}
