public class Matrix {
    private final static int DEFAULT_SIZE = 2;
    private Object[][] matrix;

    public Matrix( ) {
	matrix = new Object[DEFAULT_SIZE][DEFAULT_SIZE]; 
    }

    public Matrix( int a ) {
	matrix = new Object[a][a]; 
    }

    private int size() {
	return matrix.length; 
    }
  
    private Object get( int r, int c ) {
	return matrix[r-1][c-1]; 
    }

    private boolean isEmpty() {
	boolean ans = true;
	for (int x = 0; x < matrix.length; x++) {
	    for (int y = 0; y <matrix.length; y++) {
		if (matrix[x][y] != null)
		    ans = false; 
	    } 
	}
	return ans; 
    }

    private Object set( int r, int c, Object newVal ) {
	Object old = matrix[r-1][c-1];
	matrix[r-1][c-1] = newVal;
	return old; 
    }

    public String toString() {
	String ans = "";
	for (int x = 0; x < matrix.length; x++) {
	    ans += " | "; 
	    for (int y = 0; y < matrix.length; y++) {
		ans += matrix[x][y] + " "; 
	    }
	    ans += " | \n";
	} 
	return ans; 
    }
    
    public boolean equals( Object rightSide ) {
	boolean ans = true;
	Matrix a = (Matrix) rightSide; 
	if (a.size() != this.size())
	    ans = false;
	else {
	    for (int x = 0; x < matrix.length; x++) {
		for (int y = 0; x <matrix.length; x++) {
		    if (a.get(x+1, y+1) != this.get(x+1,y+1))
			ans = false; 
		}
	    } 
	}
	return ans;
    }

    public void swapColumns( int c1, int c2  ) {
	c1 -= 1;
	c2 -= 1;

	for (int x = 0; x < size(); x++) {
	    Object temp = get(x, c1);
	    set(x, c1, (get(x, c2)));
	    set(x, c2, temp); 
	}
    }
    
    public void swapRows( int r1, int r2  ) {
	r1 -= 1;
	r2 -= 1;

	for (int x = 0; x < size(); x++) {
	    Object temp = get(r1, x);
	    set(r1, x, (get(r2, x)));
	    set(r2, x, temp); 
	} 
    }

    //main method for testing
    public static void main( String[] args ) {
	Matrix ann = new Matrix();
	System.out.println(ann.toString());
	System.out.println(ann.size());

	Matrix frank = new Matrix();
	System.out.println(frank.toString());
	System.out.println(frank.size());
	
	Matrix lonard = new Matrix (3);
	System.out.println(lonard.toString());
	System.out.println(lonard.size());

	System.out.println(ann.isEmpty());
	System.out.println(ann.get(1,1));
	System.out.println(ann.equals(frank));
	System.out.println(ann.equals(lonard));

	ann.set(1,1,3); 
	System.out.println(ann.toString());
	System.out.println(ann.equals(frank));

	ann.swapRows(1, 2);
	System.out.println(ann.toString());
	
	ann.swapColumns(1, 2);
	System.out.println(ann.toString());
    }

}//end class Matrix
