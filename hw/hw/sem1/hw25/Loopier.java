//Susan Lin
//APCS pd 2
//hw25---All Hallow's Eve
//11-0
public class Loopier {
    public static void populate() {
	for (int x = 0; x < a.length; x++)
	    {ans +=  a[x] + ",";}
	return ans + "]"; 
    }
    //this method takes an array and if it has the target within, it returns the index.
    //else, it returns -1
    public static int linSearch (int[] a, int target) {
	int ans = -1; 
	for (int x = 0; x < a.length; x++)
	    {if (a[x] == target)
		    {ans = x; }
	    }
	return ans; 
    }
    //this method takes an array and if it has the target within, it returns the index.
    //else, it returns -1
    public static int linSearchR (int[] a, int target) {
	return freqHelper(0, int[] x, int target);
    }
    public static freqHelper (int index, int[] a, int target) {
	if (index >= a.length)
	    {ans = 0;}
	else if (a[index] == target) {
	    ans += 1 ;}
	else
	    {ans = freqHelper(index + 1, a target);}	
    } 
    //this method takes an array, and it counts the amount of times
    //the target appears in the array 
    public static int freq (int[] a, int target) {
	int ans = 0;
	for (int x = 0; x < a.length; x++)
	    {if (a[x] == target)
		    {ans += 1;}
	    }
	return ans; 
    }
    //this method takes an array, and it counts the amount of times
    //the target appears in the array 
    public static int freqRec (int[] a, int target) {
	int ans = 0;
	int place = 0;
	while (place < a.length) {
	    if (a[place] == target)
		{ans += 1;}
	    place += 1; 
	    `	    }
	return ans; 
    } 
    public static void main (String[] args) {
	int[] a = {1, 2, 3, 4, 5, 5};
	System.out.println(printArray(populate(a)));
	System.out.println(linSearchR(a, 2));
	System.out.println(freq(a, 2));
	System.out.println(freqRec(a, 2)); 
	}//end main()
    
}

