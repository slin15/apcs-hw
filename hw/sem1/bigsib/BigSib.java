/* Susan Lin 
   APCS1 pd2 
   HW07 -- On the Origins of a BigSib
   2017-09-27*/

public class BigSib {

    //instance var
    private String helloMsg;

    //default constructor
    public BigSib(){
	helloMsg = "word up"; 
    }
    
    //overloaded constructor
    public BigSib(String str){
	helloMsg = str;
    }
    
    //setHelloMsg method
    public void setHelloMsg (String newMsg) {
	helloMsg = newMsg; 
    }

    //greet method 
    public String greet(String name) {
	helloMsg += " " + name;
	return helloMsg; 
    }

}
