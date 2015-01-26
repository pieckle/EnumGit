import java.util.ArrayList;


public class Stove {
	
	private final int NUMBER_OF_BURNERS = 4;
	
	private ArrayList<Burner> burners;
	
	public Stove(){
		burners = new ArrayList<Burner>();
		for (int x = 0; x < NUMBER_OF_BURNERS; x++){
			burners.add(new Burner());
		}
	}
	
	public void displayStove(){
		
	}
	
	public void timePassing(int minutes){
		
	}
	
	public void setBurners() {
		// Simulate pressing increase setting button 3 times
		burners.get(0).increaseSetting();
		burners.get(0).increaseSetting();
		burners.get(0).increaseSetting();
		// Simulate pressing increase setting button 3 times, then
		// decrease button 1 time
		burners.get(1).increaseSetting();
		burners.get(1).increaseSetting();
		burners.get(1).increaseSetting();
		burners.get(1).decreaseSetting();
		// Simulate pressing increase setting button 1 time
		burners.get(2).increaseSetting();
	}

}
