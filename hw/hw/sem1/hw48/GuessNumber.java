//Susan Lin
//apcs pd02
//hw48 --  Keep Guessing (...but hopefully, you won’t have to make too many guesses)
//R 2017-12-07

import cs1.Keyboard;

public class GuessNumber {
    //instance vars
    private int _lo, _hi, _guessCtr, _target;
    
    public GuessNumber( int a, int b ) {
	_lo = a;
	_hi = b; 
	_guessCtr = 0;
	_target = (int) (Math.random() * b + a); 
    }

    public void playRec() {
	System.out.print("pick a number from " + _lo + " to " + _hi + ": "); 
	int input = Keyboard.readInt();
	_guessCtr ++; 

	if (!(input == _target)) {  
	    if (input > _target) 
		_hi = input - 1;
	    else 
		_lo = input + 1;
	    playRec();
	}
	if (input == _target)
	    System.out.println("You're right. The answer was " + _target + " You guessed " + _guessCtr + " times."); 
    }

    public void playIter() {
        int input = Keyboard.readInt();
	while (!(input == _target)) {
	    if (input > _target) 
		_hi = input - 1;
	    else if (input < _target) 
		_lo = input + 1;
	    _guessCtr++; 
	    System.out.println("try a number from " + _lo + " to  " + _hi + ": ");
	    input = Keyboard.readInt();
	}
	if (input == _target)
	    System.out.println("You're right. The answer was " + _target + " You guessed " + _guessCtr + " times."); 
    }
    
    public void play() { 
	//use one or the other below:
	playRec();
	//playIter();
    }

    //main method to run it all
    public static void main( String[] args ) {

	//instantiate a new game
	GuessNumber g = new GuessNumber(1,100);

	//start the game
	g.play();

    }//end main
}//end class
