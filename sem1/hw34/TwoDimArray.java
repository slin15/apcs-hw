l// Susan Lin
// APCS1 pd2
// HW34 -- 2D arrays
// 2017-11-17

public class TwoDimArray {
    
    public static void print1( int[][] a ){
	for (int x = 0; x < a.length; x ++) {
	    for (int y = 0; y < a[x].length; y ++)
		{System.out.println(a[x][y]);} 
	}
    }
    
    public static void print2( int[][] a ) {
	for (int[] row: a) {
	    for (int elem: row)
		{System.out.println(elem);} 
	}
    }
   
    public static int sum1( int[][] a ) {
	int sum = 0;
	for (int[] row: a) {
	    for (int x: row) {
		sum += x;
	    } 
	}
	return sum; 
    }

    public static int sum2( int [][] m ) {
	int sum = 0; 
	for (int x = 0; x < m.length; x++)
	    {sum += sumRow(x, m);}
	return sum; 
    }

    public static int sumRow( int r, int[][] a ) {
	int sum = 0; 
	for (int x = 0; x < a[r].length; x++)
	    {sum += a[r][x];}
	return sum; 
    }

    public static int sumRow2(int r, int[][] m){
	int sum = 0;
        for (int x: m[r]) {
	    {sum += m[r][x];} 
	}
	return sum; 
    }

    public static void main( String [] args ) {
	
	  int [][] m1 = new int[4][2];
	  int [][] m2 = { {2,4,6}, {3,5,7} };
	  int [][] m3 = { {2}, {4,6}, {1,3,5} };
	  print1(m1);
	  print1(m2);
	  print1(m3);
	  
	  System.out.println(); 
	  print2(m1);
	  print2(m2);
	  print2(m3);

	  /*
	  System.out.print("testing sum1...\n");
	  System.out.println("sum m1 : " + sum1(m1));
	  System.out.println("sum m2 : " + sum1(m2));
	  System.out.println("sum m3 : " + sum1(m3));
	  
	  System.out.print("testing sum2...\n");
	  System.out.println("sum m1 : " + sum2(m1));
	  System.out.println("sum m2 : " + sum2(m2));
	  System.out.println("sum m3 : " + sum2(m3));*/
    }
}//end class TwoDimArray
