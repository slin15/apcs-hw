//Team  help me Peter Cwalina, Susan Lin, Oliver Frank
//APCS1 pd2
//Hw11 Breaking the Bank
//2017-10-4
public class Teller {
    public static void main(String [] args){
	BankAccount olivier = new BankAccount();
	
	olivier.setName("olivier");
	olivier.setPasswd("password");
	olivier.setPin(1234);
	olivier.setAcctNum(100000000);
	olivier.setBalance(999999.00);
	if (olivier.authenticate(100000080, "drowssap")){
	    System.out.println("Successful authentication");
		}
	else {
	    System.out.println("Error invalid login");
		}
	if (olivier.authenticate(100000000, "password")){
	    System.out.println("Successful authentication");
		}
	else {
	    System.out.println("Error invalid login");
		}
	System.out.println(olivier.toString());
	olivier.setPin(123);//expectation error
	olivier.setPin(456347); //more error
	System.out.println(olivier.toString());//shoud have a pin of 9999
	olivier.setPin(1234);//back to default we go
	olivier.setAcctNum(999999999);//should error
	olivier.setAcctNum(4545);//should error
	System.out.println(olivier.toString());//shoud have an act num 999999999
	olivier.setAcctNum(100000000);
	olivier.withdraw(999998.00);//should leave one cent
	System.out.println(olivier.toString());
	olivier.withdraw(100);//should error and leave the balance as is
	System.out.println(olivier.toString());
	olivier.deposit(9999);//should make the new balance 10000
	System.out.println(olivier.toString());
    }

    
}
