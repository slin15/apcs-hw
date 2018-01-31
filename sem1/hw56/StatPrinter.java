import java.util.ArrayList;
public class StatPrinter {
    private ArrayList <Integer> _frequency;

    public StatPrinter( ArrayList <Integer> data ) { 
	_frequency = new ArrayList<>();
	int num; 
	for (int x = 0; x < max(data) + 1; x++) {
	    num = 0;
	    for (int y = 0; y < data.size(); y++) { 
		if (x == data.get(x))
		    num++; 
	    }
	    _frequency.add(num); 
	} 
    }
    
    public Integer max( ArrayList <Integer> data ){ 
        Integer num = data.get(0);
	for (int x = 0; x < data.size(); x++){
	    if (data.get(x).compareTo(num) > 0)
		num = data.get(x); 
	}
	return num; 
    }
    
    public boolean isLocalMode( int i ){ 
	return (_frequency.get(i--) < _frequency.get(i) &&
		_frequency.get(i++) < _frequency.get(i)); 
    }

    public ArrayList<Integer> getLocalModes(){
	ArrayList<Integer> modes = new ArrayList<>();
	for (int x = 0; x < _frequency.size(); x++) {
	    if (isLocalMode(x))
		modes.add(_frequency.get(x)); 
	}
	return modes; 
    }

    //precond:  longestBar > 0
    public void printHistogram( int longestBar ){
	for (int x = 0; x < _frequency.size(); x++) {
	    System.out.print(x + " : ");
	    for (int a = 0; a <= (longestBar / max(_frequency)) * _frequency.get(x); a++)
		System.out.print("*");
	    System.out.println();
	} 
    }
}
