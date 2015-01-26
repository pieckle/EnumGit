import java.util.ArrayList;


public class Stove {
	
	public static void main(String[] bunsen){
		Stove stove = new Stove();
		stove.displayStove();
		stove.setBurners();
		stove.timePassing(8);
		stove.displayStove();
	}
	
	private final int NUMBER_OF_BURNERS = 4;
	
	private ArrayList<Burner> burners;
	
	public Stove(){
		burners = new ArrayList<Burner>();
		for (int x = 0; x < NUMBER_OF_BURNERS; x++){
			burners.add(new Burner());
		}
	}
	
	public void displayStove(){
		System.out.println("Stove-----------");
		boolean hot = false;
		for (Burner burn : burners){
			if (burn.getTemperature() == Burner.Temperature.HOT){
				hot = true;
			}
			burn.displayBurner();
		}
		if (hot){
			System.out.println("RED LIGHT - HOT BURNER");
		}
		System.out.println();
	}
	
	public void timePassing(int minutes){
		for (int x = 0; x < minutes; x++){
			for (Burner burn : burners){
				burn.updateTemperature();
			}
		}
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
