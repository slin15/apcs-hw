//Team Cheryl -- Bing Li, Cheryl Qian, Susan Lin
//APCS1 pd2
//HW23 -- Imetay Otay Ineshay
//2017-10-30 

/*
  1.  Resolve capitalization problem, make sure all words are in proper cases
  - Create a private instance variable called allCaps with all the capitalized letters in the alphabet (see ex. from VOWELS)
  - Create a hasCap method (return type boolean) to check if the input has a capitalized letter
  - Apply hasCap to the engToPig method
  -if hasCap is true, capitalize the first letter of store (String variable that contains engToPig translation) and lowercased the rest

  2. Resolve cases with Y
  -If "Y" is not before or after a vowel, treat y as a vowel in engToPig
  -If "Y" is before or after a vowel, treat y as a consant in engToPig
     
  3. Resolve Cases with contraction (ex.can't, shouldn't, wouldn't)
  -Please add comments
     
  4. Allow user to type in the input using Scanner class
*/

public class Pig { 
    private static final String VOWELS = "aeiouAEIOU";
    private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String PUNCT = ".,?!:;\"(){}[]<>";

    //this method returns true if a string has a certain letter and false otherwise. 
    public static boolean hasA( String w, String letter ) {
	return w.indexOf(letter) != -1; 
    }//end hasA()

    //this method returns true if a certain letter is a vowel and false otherwise. 
    public static boolean isAVowel( String letter ) {
	return hasA(VOWELS,letter);
    }//end isAVowel(letter) 

    //this method returns the number of vowels within a string by applying isAVowel to every character of the
    //string. 
    public static int countVowels( String w ) {
	int ans = 0; 
	for (int x = 0; x < w.length(); x ++) {
	    if (isAVowel(w.substring(x, x + 1)))
		{ans += 1;} 
	} 
	return ans; 
    }//end countVowels(w)

    public static int countCaps (String w) {
	int ans = 0;
	for (int x = 0; x < w.length(); x ++)
	    {if (isAVowel(w.substring(x, x + 1)))
		    {ans += 1; }
	    }
	return ans;
	
    } 
  
    //this method returns true if a string contains any vowel and false otherwise. 
    public static boolean hasAVowel( String w ) {
	return countVowels(w) > 0; 
    }//end hasAVowel(w) 

    //this method returns a string of all the vowels of the input string. 
    public static String allVowels( String w ) {
	String ans = ""; 
	for (int x = 0; x < w.length(); x ++) {
	    if (isAVowel(w.substring(x, x + 1)))
		{ans += w.substring(x, x + 1); } 
	} 
	return ans; 
    }//end allVowels(w) 

    //this method returns true if a string's first character is a vowel and false otherwise.
    public static boolean beginsWithVowel(String w) { 
	boolean ans = false; 
	if (isAVowel(w.substring(0,1))) 
	    {ans = true; } 
	return ans; 
    }//end beginsWtihVowel(w) 

    //this method takes a string and outputs the first vowel by taking the first of all vowels. 
    public static String firstVowel(String w) {
	String ans = "" ;
	if (allVowels(w).length() > 0) 
	    { ans = allVowels(w).substring(0,1); } 
	return ans; 
    }//end firstVowel(w)

    //returns true if string contains any capital letter
    public static boolean hasCap( String w ) {
	boolean ans = false; 
	if(countCaps(w) > 0)
	    {ans = true;} 
	return ans; 
    }//end hasCaps(w)

    //this methos returns a string of the first letter capitalized and the rest lowercaser 
    public static String upFirst(String w) {
	if (hasCap(w)) {
	    return w.substring(0,1).toUpperCase() + w.substring(1).toLowerCase();
	}
	return w;
    }

    //this method returns the number of punctuation marks in a string 
     public static int countPunct( String w ) {
	int ans = 0; 
	for (int x = 0; x < w.length(); x ++) {
	    if (PUNCT.indexOf(w.substring(x, x + 1)) > -1)
		{ans += 1;} 
	} 
	return ans; 
    }//end countPUNCT(w)

    //this method returns true if the string has punctuation and false otherwise 
     public static boolean hasPunct( String w ) {
	boolean ans = false; 
	if(countPunct(w) > 0)
	    {ans = true;} 
	return ans; 
    }//end hasPunct(w)

    //this method will return true if y is a vowel of the word and false otherwise
    public static boolean yVowel (String w) {
	boolean ans = false;
	int place = w.indexOf("y");
	if (allVowels(w) == "")
	    {ans = true; } 
	else if (place != 0 && (!(isAVowel(w.substring(place - 2, place - 1)))
			   && ! (isAVowel(w.substring(place + 1, place + 2))))) {
	    ans = true; 
	}
	return ans; 
    } 

    //this method is the official translator, taking a string and moving/adding characters to adhere to 
    //pig latin rules. 
    public static String engToPig(String w) {
	String store = "";
	int pos = w.indexOf(firstVowel(w));
	int last = w.length() - 1;
	if (hasPunct(w) && beginsWithVowel(w))
	    { store += w.substring(0,last) + "way" + w.substring(last);}
	else if (yVowel(w))
	    {store += w.substring(w.indexOf("y")) + w.substring(0, w.indexOf("y")) + "ay"; }
	else if (!beginsWithVowel(w) && hasPunct(w))
	    {store += w.substring(pos,last) + w.substring(0,pos) + "ay" + w.substring(last);}
	else if (beginsWithVowel(w))
	    {store += w + "way";}
	else
	    {store += w.substring(pos) + w.substring(0,pos) + "ay";}
	return upFirst(store);		
    }

    public static void main (String[] args) {  
	System.out.println("---------tests for hasA----------");
	System.out.println("supposed to be true: " + hasA("word", "w"));
	System.out.println("supposed to be false: " + hasA("word", "pp"));

	System.out.println("---------tests for isAVowel----------");
	System.out.println("supposed to be true: " + isAVowel("a"));
	System.out.println("supposed to be false: " +isAVowel("l"));
	System.out.println("supposed to be true: " +isAVowel("U"));

	System.out.println("---------tests for countVowels----------");
	System.out.println("supposed to be 1: " + countVowels("word"));
	System.out.println("supposed to be 0: " + countVowels("pp"));
	System.out.println("supposed to be 3: " + countVowels("aloe"));
	System.out.println("supposed to be 3: " + countVowels("aloE"));

	System.out.println("---------tests for hasAVowel----------");
	System.out.println("supposed to be true: " + hasAVowel("word"));
	System.out.println("supposed to be false: " + hasAVowel("pp"));
	System.out.println("supposed to be true: " + hasAVowel("pEp"));

	System.out.println("---------tests for allVowels----------");
	System.out.println("supposed to be o: " + allVowels("word"));
	System.out.println("supposed to be empty: " + allVowels("pp"));
	System.out.println("supposed to be oOooEia: " + allVowels("onOmoNopEia"));

	System.out.println("---------tests for firstVowel----------");
	System.out.println("supposed to be o: " + firstVowel("word"));
	System.out.println("supposed to be empty: " + firstVowel("pp"));
    
	System.out.println("---------tests for beginsWithVowel----------");
	System.out.println("supposed to be false: " + beginsWithVowel("word"));
	System.out.println("supposed to be true: " + beginsWithVowel("and"));

	System.out.println("---------tests for countCaps----------");
	System.out.println("supposed to be 1: " + countCaps("Word"));
	System.out.println("supposed to be 2: " + countCaps("PP"));
	System.out.println("supposed to be 0: " + countCaps("aloe"));
	System.out.println("supposed to be 1: " + countCaps("aloE"));

	System.out.println("---------tests for hasCap----------");
	System.out.println("supposed to be true: " + hasCap("Word"));
	System.out.println("supposed to be true: " + hasCap("PP"));
	System.out.println("supposed to be false: " + hasCap("aloe"));
	System.out.println("supposed to be true: " + hasCap("aloE")); 

	System.out.println("---------tests for upFirst----------");
	System.out.println("supposed to be Word: " + upFirst("Word"));
	System.out.println("supposed to be Pp: " + upFirst("PP"));
	System.out.println("supposed to be aloe: " + upFirst("aloe"));
	System.out.println("supposed to be Aloe: " + upFirst("aloE"));

	System.out.println("---------tests for hasPunct----------");
	System.out.println("supposed to be true: " + hasPunct("word!"));
	System.out.println("supposed to be true: " + hasPunct("hello!kay"));
	System.out.println("supposed to be false: " + hasPunct("aloe"));

	System.out.println("---------tests for yVowel----------");
	System.out.println("supposed to be false: " +  yVowel("yord"));
	System.out.println("supposed to be true: " +  yVowel("why")); 

	System.out.println("---------Test for engToPig-------");
	System.out.println("supposed to be Itway.: " + engToPig("It.")); 
	System.out.println("supposed to be ovelay!: " + engToPig("love!"));
	System.out.println("supposed to be Itchtway: " + engToPig("Twitch"));
	System.out.println("supposed to be ysttray: " + engToPig("tryst")); 
	
    } //end main() 
} //end class Pig 













