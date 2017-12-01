//Susan Lin
//apcs pd 02
//hw38---- Put It Together
//2017-11-22

/* This class has a randomized 2D array as an instance variable. It imports class Ketboard from 
package cs1, a subdirectory in the current working directory. It will first print the randomized 2D
array and then prompt the user for the rows and columns of two locations to switch the contents of. 
Using the swap function, it then take whatever at those two locations and swaps them. 
Finally, it prints the changed 2D array to compare the original and the changed copy. 
*/

import cs1.Keyboard;

public class Swapper{
    private static String[][] a = new String[7][7];
    private static String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=,.<>/?;:[]{}\""; 
    
    public static void print() {
	int x = 0;
	int y = 0;
	System.out.print("     "); 
	String[] column = new String[a.length];
	for (String b: column){ 
	    b = "column" + x;
	    x++;
	    System.out.print("    " + b + " "); 
	}
	System.out.println(); 
	for (String[] row: a) {
	    String ans = "row#" + y + ": ";
	    y++; 
	    for (String elem: row)
		{ans += elem + "            ";}
	    System.out.println(ans); 
	}
    }

    public static void populate() {
	for (int x = 0; x < a.length; x++ ) {
	    for (int y = 0; y < a[x].length; y++) {
		a[x][y] = "" + (int)(Math.random() * 10);
	    } 
	} 
    }

    public static void swap(String[][] a,int row1, int col1, int row2, int col2) {
	String holder = a[row1][col1];
	a[row1][col1] = a[row2][col2];
	a[row2][col2] = holder; 
    } 

    public static void main (String[] args) {
	
	populate(); 
	print();

	System.out.println();
	System.out.print("Rows start from top going down, starting at 0. Select the row of the first term you want to switch: ");
	int Row1 = Keyboard.readInt();
	System.out.print("Columns start from left going right, starting at 0. Select the column of the first term you want to switch: ");
	int Col1 = Keyboard.readInt();
	System.out.print("Rows start from top going down, starting at 0. Select the row of the second term you want to switch: ");
	int Row2 = Keyboard.readInt();
	System.out.print("Columns start from left going right, starting at 0. Select the column of the second term you want to switch: ");
	int Col2 = Keyboard.readInt();

	System.out.println(); 
	System.out.println("switching...");
	System.out.println(); 
	swap(a, Row1, Col1, Row2, Col2);

	print(); 
	System.out.println(chars); 
    } 
} 
