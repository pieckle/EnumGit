
public class Burner {
	
	final static int TIME_DURATION = 3;
	
	private enum Temperature { HOT, WARM, COLD };
	
	private Temperature temp;
	private Setting set;
	
	private int time_elapsed;
	
	public Burner(){
		temp = Temperature.COLD;
		set = Setting.OFF;
	}
	
	public void increaseSetting(){
		
	}
	
	public void decreaseSetting(){
		
	}
	
	public void updateTemperature(){
		
	}
	
	public Temperature getTemperature(){
		return temp;
	}
	
	public void displayBurner(){
		
	}

}
