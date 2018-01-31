/* Susan Lin 
   APCS1 pd2 
   HW04 -- A Classy Division of Labor 
   2017-09-18*/ 

public class Greet {
    public static void main (String [] args) {
	String greeting;

        BigSib richard = new BigSib("Word up");
	BigSib grizz = new BigSib("Hey ya");
	BigSib dotCom = new BigSib("Sup");
	BigSib tracy = new BigSib("Salutations");
	
        greeting = richard.greet("freshman");
	System.out.println(greeting);
		
	greeting = grizz.greet("Dr. Spaceman");
	System.out.println(greeting);
		
	greeting = dotCom.greet("King Fooey");
	System.out.println(greeting); 
	
	greeting = tracy.greet("mom");
	System.out.println(greeting);

	//System.out.println(richard.helloMsg); 
    }
}

