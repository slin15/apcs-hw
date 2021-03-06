public class Matrix {
    //constant for default matrix size
    private final static int DEFAULT_SIZE = 2;
    private Object[][] _matrix;

    //default constructor intializes a DEFAULT_SIZE*DEFAULT_SIZE matrix
    public Matrix() {
	_matrix = new Object[DEFAULT_SIZE][DEFAULT_SIZE];
    }

    //constructor intializes an a*a matrix
    public Matrix( int a ) {
	_matrix = new Object[a][a];
    }

    //return size of this matrix, where size is 1 dimension
    private int size() {
	return _matrix.length;
    }

    //return the item at the specified row & column   
    private Object get( int r, int c ) {
	return _matrix[r-1][c-1];
    }

    //return true if this matrix is empty, false otherwise
    private boolean isEmpty( int r, int c ) {
	return get(r,c) == null;

    }

    //overwrite item at specified row and column with newVal
    //return old value
    private Object set( int r, int c, Object newVal ) {
	Object retVal = _matrix[r-1][c-1];
	_matrix[r-1][c-1] = newVal;
	return retVal;
    }

    //return String representation of this matrix
    // (make it look like a matrix)
    public String toString() {
	String foo = "";
	for( int i =0; i < size(); i++ ) {
	    foo += "| ";
	    for( int j=0; j < size(); j++ )
		foo += _matrix[i][j] + " "; //get(i+1,j+1)
	    foo += "|\n";
	}	
	return foo;
    }

    //override inherited equals method
    //criteria for equality: matrices have identical dimensions,
    // and identical values in each slot
    public boolean equals( Object rightSide ) {
	boolean foo = false;

	if (this == rightSide) foo = true;  
	// checks for aliases  ex. m1.equals(m1) is true

	else if ( rightSide instanceof Matrix 
		  && size() == ( (Matrix)rightSide).size() ) {
	    Matrix r = (Matrix) rightSide; //for cleaner code later
	    foo = true;
	    outer:
	    for( int i = 0; i < size(); i++ ) {
		for( int j = 0; j < size(); j++ ) {
		    if ( !isEmpty(i,j) && ( !get(i,j).equals(r.get(i,j) ) ) ) {
			foo = false;
			break outer;
		    }
		    else if ( !( isEmpty(i,j) && r.isEmpty(i,j) ) ) {
			foo = false;
			break outer;
		    }
		}
	    }
	}
	return foo;
    }//end equals()

    //swap two columns of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapColumns( int c1, int c2  ) {
	c1 -= 1;
	c2 -= 1; 
	for( int i = 0; i < size(); i++ )
	    set( i, c1, set( i, c2, get(i,c1) ) );
    }//O(n) b/c must visit n rows

    //swap two rows of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapRows( int r1, int r2  ) {
	r1 -= 1;
	r2 -= 2;
	Object [] temp = _matrix[r1];
	_matrix[r1] = _matrix[r2];
	_matrix[r2] = temp; 
    }//O(1)

    //returns copy of row r
    public Object[] getRow( int r ) {
	Object[] copy = new Object[this.size()];
	for (int x = 0; x < this.size(); x++)
	    copy[x] = get(x, 0); 
	return copy; 
    }//O(1)
    
    //replaces row r with 1D array newRow
    //returns old row
    public Object[] setRow( int r, Object[] newRow ) {
	Object[] old = getRow(r);
	for (int x = 0; x < size(); x++) 
	    matrix[x][0] = newRow; 
	return old; 
    }//O(1)
    
    public Object [] setCol( int c, Object[] newCol ) {
	Object[] old = new Object[this.size()];
	for (int x = 0; x < this.size(); x++)
	    old[x] = get(0, x);
	for (int x = 0; x < size(); x++) 
	    matrix[0][x] = newCol; 
	return old; 
    }//O(?)
    
    public void transpose() {
	Object[] copy = new Object[this.size()];
	for (int x = 0; x < this.size(); x++)
	    copy[x] = get(0, x);
	for (int x = 0; x < size(); x++) 
	    matrix[0][x] = newCol; 
	
    }//O(?)
    
    //main method for testing
    public static void main( String[] args ) {
	Matrix m1 = new Matrix(); // 2 x 2
	Matrix m2 = new Matrix(10); // 10 x 10
	System.out.println("m1 size: " + m1.size());
	System.out.println("m2 size: " + m2.size());
	System.out.println("m1 get(1,1) : " + m1.get(1,1));
	System.out.println("m1 isEmpty(1,1) : " + m1.isEmpty(1,1));	

	Matrix x = new Matrix(2); // 2x2
	System.out.println(x);
	x.set(1,1,"how"); 
	x.set(1,2,"now"); 
	x.set(2,1,"bro"); 
	x.set(2,2,"cow"); 
	System.out.println(x);

	Matrix m3 = new Matrix(3); //3x3
	System.out.println(m1);
    }//end main()
}//end class Matrix
