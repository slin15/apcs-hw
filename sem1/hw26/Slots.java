/*****************************************************
 * Susan Lin 
 * APCS1 pd02
 * HW26 -- Shmoney
 * 2017-11-07
 *****************************************************/

public class Slots {
    private static final String[] FRUITS = {
	"lime", "lime", "lime", 
	"lemon", "lemon", "lemon", 
	"cherry", "cherry", "cherry", 
	"orange", "orange", "orange", 
	"grapefruit", "grapefruit", "grapefruit", 
	"tangerine", "tangerine", "tangerine", 
	"ugli", "ugli", "ugli",
	"peach", "peach", "peach"
    };
  
    private String[] _fruits;

    public Slots() {
	//allocate memory for _fruits based on size of FRUITS:
	_fruits = new String[FRUITS.length];
	//copy elements of FRUITS into _fruits:
	for (int x = 0; x < _fruits.length; x++)
	    {_fruits[x] = FRUITS[x]; } 
    }

    public String toString() {
	String ans = ""; 
	for (int x = 0; x < 3; x++)
	    {ans += _fruits[x] + "\t"; }
	return ans; 
    }

    // elements at indices i, j are swapped
    private void swap( int i, int j ) {
	String holder = _fruits[i];
	_fruits[i] = _fruits[j];
	_fruits[j] = holder; 
    }

    public void spinOnce() {
	for (int x = 0; x < _fruits.length; x++)
	    {swap(c, (int)(Math.random() * 24)); } 
    } 

    /*=====================================
      boolean jackpot() -- checks for a winning combo
      pre:  _fruits is existing array
      post: returns true if first 3 slots represent winning combo,
      false otherwise
      =====================================*/
    public boolean jackpot() {
	return (_fruits[0].equals( _fruits[1])) && (_fruits[1].equals(_fruits[2])); 
    }

    /*=====================================
      boolean miniWin() -- checks for a winning combo
      pre:  _fruits is existing array
      post: returns true if first 3 slots represent winning combo,
      or if first 3 slots mutually distinct, 
      false otherwise
      =====================================*/
    public boolean miniWin() {
	if (jackpot() || (!(_fruits[0].equals(_fruits[1])) &&
			  _fruits[1] != _fruits[2] &&
			  _fruits[0] != _fruits[2]))
	    {return true;}
	else
	    {return false;} 
    }

    //main() method for testing
    public static void main( String[] args ) {
	Slots machine01 = new Slots();
	Slots machine02 = new Slots();
	//test to verify slot machines function independently
	System.out.println();
	System.out.println( "Machine01 initial state:\t" + machine01 );
	System.out.println( "Machine02 initial state:\t" + machine02 );
	System.out.println( "\nSpinning machine01...\n" );

	machine01.spinOnce();

	System.out.println();
	System.out.println( "Machine01 state:\t" + machine01 );

	/* 
	machine01.spinOnce();
	machine01.spinOnce();
	machine01.spinOnce();
	machine01.spinOnce();
	machine01.spinOnce();

	System.out.println();
	System.out.println( "Machine01 state:\t" + machine01 );
	//System.out.println( "Machine02 state:\t" + machine02 );
	System.out.println();
	
	//test gamble-until-you-win mechanism

	System.out.println( "Preparing to spin until a mini win! . . ." );
	System.out.println( "------------------------------------" );
	
	//if you haven't won, spin again until you win!
	while( machine01.miniWin() == false ) {
	    System.out.println( "Your spin..." + "\t" + machine01 );
	    System.out.println( "LOSE\n" );
	    machine01.spinOnce();
	}

	System.out.println( "====================================" );
	System.out.println( "Your spin..." + "\t" + machine01 );
	System.out.println( "WIN\n" );

	

	System.out.println( "Preparing to spin until...jackpot! . . ." );
	System.out.println( "------------------------------------" );

	//if you haven't won, spin again until you win!
	while( machine01.jackpot() == false ) {
	    System.out.println( "Your spin..." + "\t" + machine01 );
	    System.out.println( "LOSE\n" );
	    machine01.spinOnce();
	}

	System.out.println( "====================================" );
	System.out.println( "Your spin..." + "\t" + machine01 );
	System.out.println( "JACKPOT!\n" );*/ 
    }//end main

}//end class Slots
