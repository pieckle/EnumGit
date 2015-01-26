
public class Burner {
	
	final static int TIME_DURATION = 3;
	
	enum Temperature { HOT, WARM, COLD };
	
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
		System.out.print(set + ".....");
		switch (temp){
		case HOT:
			System.out.println("HOT");
			break;
		case WARM:
			System.out.println("Warm");
			break;
		case COLD:
			System.out.println("cool");
			break;
		}
	}

}
