//Team  help me Peter Cwalina, Susan Lin, Oliver Frank
//APCS1 pd2
//Hw11 Breaking the Bank
//2017-10-4

public class BankAccount
{
    //instance variables
    private String name;
    private String passwd;
    private int pin;
    private int acctNum;
    private double balance;

    
    /* default constructor: initializes instance vars to default vals
       precondition:  none
       postcondition: instance vars have appropriate default vals
       ````````````````````````````````````````````````````*/
    public BankAccount() {
	name = "steve";
	passwd = "voodoo";
	pin = 1234;
	acctNum = 123456789;
	balance = 1.00; 
    } 


    /* overloaded constructor: allows caller to specify account 
       number and passwd. Assigns defaults
       to other instance vars.
       precondition:  params are passed in specified order
       postcondition: instance vars have values specified by params
       ````````````````````````````````````````````````````*/
    public BankAccount( int newAcctNum, String newPass ) {
	acctNum = newAcctNum;
	passwd = newPass; 
    } 

    /* overloaded constructor: allows caller to specify instance vars
       precondition:  params are passed in specified order
       postcondition: instance vars have values specified by params
       ````````````````````````````````````````````````````*/
    public BankAccount( int newAcctNum, String newPass, 
			double newBal, String newName, int newPin ) {
	acctNum = newAcctNum;
	passwd = newPass;
	newBal = balance;
	name = newName;
	pin = newPin; 
    } 

    //mutators
    public String setName( String newName )
    {
	String oldName = name;
	name = newName;
	return oldName;
    }

    public String setPasswd( String newPasswd )
    {
	String oldPasswd = passwd;
	passwd = newPasswd;
	return oldPasswd;
    }

    public int setPin( int newPin )
    {
	int oldPin;
	if (newPin >= 1000 && newPin <= 9998)
	    {
		oldPin = pin;
		pin = newPin;
	    }
	else
	    {
		oldPin = pin;	
		pin = 9999;
		System.out.println("SORRY, YOUR PIN NUMBER IS NOT 4 DIGITS OR CANNOT BE 9999");
	    }
	return oldPin;
    }
    public int setAcctNum( int newAcctNum )
    {
	int oldAcctNum;
	if (newAcctNum >= 100000000 && newAcctNum <= 999999998)
	    {
		oldAcctNum = acctNum;
		acctNum = newAcctNum;
	    }
	else
	    {
		oldAcctNum = acctNum;	
		acctNum = 999999999;
		System.out.println("SORRY, YOUR ACCOUNT NUMBER IS NOT 9 DIGITS OR CANNOT BE 999999999");
	    }
	return oldAcctNum;
    }

    public double setBalance( double newBalance )
    {
	double oldBalance = balance;
	balance = newBalance;
	return oldBalance;
    }

    public double withdraw( double withdrawAmount ) {
	double newBalance = balance;
	if(newBalance >= withdrawAmount) {
	    return balance -= withdrawAmount;
	}
	else {
	    System.out.println("SORRY, YOUR BALANCE IS TOO LOW FOR THIS TRANSACTION");
	    return newBalance;
	}
    }
    
    public void deposit( double depositAmount ) {
	balance = balance + depositAmount;
    }
    
    public Boolean authenticate(int myAcctNum, String myPasswd){
	Boolean boo;
	if ((myAcctNum == acctNum) && (myPasswd == passwd)){
	    boo = true;
	}else {
	    boo =  false;
	}
	return boo;
    }
    //overwritten toString()
    public String toString() {
	String retStr = "\nAccount info:\n=======================";
	retStr = retStr + "\nName: " + name;
	retStr = retStr + "\nPassword: " + passwd;
	retStr = retStr + "\nPIN: " + pin;
	retStr = retStr + "\nAccount Number: " + acctNum;
	retStr = retStr + "\nBalance: " + balance;
	retStr = retStr + "\n=======================";
	return retStr;
    }


    //main method for testing
    public static void main( String[] args ){
	BankAccount Kevin = new BankAccount();
	Kevin.setName("Kevin");
	Kevin.setPasswd("asdasd");
	Kevin.setPin(21342);
	Kevin.setAcctNum(1231231232);
	Kevin.setAcctNum(123123123);
	Kevin.setBalance(600);
	Kevin.withdraw(500);
	System.out.println(Kevin.authenticate(123123123,"asdasd"));
	System.out.println(Kevin.authenticate(121023123,"asdasd"));
	System.out.println(Kevin.authenticate(123123123,"asasd"));
    }//end main()
}//end class BankAccount
/*
  0. Procure Thluffy's BankAccount from QAF, and make it your own.
  1. Modify your team’s BankAccount class with these new rules:
  The account number should only be set to a 9 digit number ( interval [100000000,999999998] ), if the parameter is invalid, set the account number to 999999999 and print a message to the screen about the problem.
  The PIN should only be set to a 4 digit number (some value between 1000 and 9998). If the argument is invalid, set the PIN to 9999 and print a message to the screen about the problem.
  Change withdraw so that if the account does not have enough money, nothing is changed, an error message is printed and false is returned. If the account does have enough money, then the amount is deducted and true is returned
  Write an authenticate method that takes as parameters an account number and a password, and returns true if the credentials are valid for this BankAccount object and false otherwise.
  2. Write a main() method as the last method in your class. Use it to test all of your methods via terminal output.
  Note: Avoid typecasting for now. If you are generating errors related to this, revert to using int, float...
  Tips/Guidelines:
  Test, test, TEST! Develop one bit of functionality at a time. Test it, then move on.
  Include heading (with team name and roster) and descriptive comments.
  Upload BankAccount.java to the homework server. (Each teammate should upload identical copy.)d
  Bring UML diagram representing final version to class.
*/



