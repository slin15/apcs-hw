//Susan Lin
//apcs pd02
//hw46-- Al<B> Sorted!.
//T 2017-12-05

import java.util.ArrayList;

public class ALTester <T> {
    
    public static void populate(ArrayList<Comparable> a) {
	for (int x = 0; x < 23; x++) { 
	    if (a.size() <= x)
		a.add(x, (Integer) ((int)(Math.random() * 10)));
	    else 
		a.add((Integer)((int)(Math.random() * 10)));
	}
    }
    
    public static void print(ArrayList<Comparable> a) {
	for (int x = 0; x < a.size(); x++)
	    System.out.println(a.get(x));
    }

    public static boolean sorted (ArrayList<Comparable> a) {
	for (int x = 0; x < a.size() - 1; x++) {
	    if (a.get(x).compareTo(a.get(x + 1)) > 0)
		return false;
	}
	return true; 
    } 
    
    public static void main (String[] args) {
	ArrayList<Comparable> foo = new ArrayList<Comparable>();
	populate(foo);
        print(foo);
	System.out.println(foo.size());
	System.out.println(sorted(foo)); 
    }
} 
