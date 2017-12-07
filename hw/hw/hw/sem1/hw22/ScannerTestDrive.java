import java.util.Scanner; 

public class ScannerTestDrive { 
    public static void main (String [] args) {
	String a = ""; 
	Scanner sc = new Scanner(System.in);
	int counter = 0; 
	while(sc.hasNext() && counter < 3) { 
	   a += sc.next()+ " ";
	   counter++;
	}
	int number = Integer.parseInt( a ); 
	System.out.println(a); 
    } 
} 
//sc takes objects 
