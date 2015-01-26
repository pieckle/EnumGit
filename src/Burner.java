
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
		switch (set){
		case OFF:
			set = Setting.LOW;
			break;
		case LOW:
			set = Setting.MEDIUM;
			break;
		case MEDIUM:
			set = Setting.HIGH;
			break;
		}
		time_elapsed = 0;
	}
	
	public void decreaseSetting(){
		switch (set){
		case LOW:
			set = Setting.OFF;
			break;
		case MEDIUM:
			set = Setting.LOW;
			break;
		case HIGH:
			set = Setting.MEDIUM;
			break;
		}
		time_elapsed = 0;
	}
	
	public void updateTemperature(){
		time_elapsed++;
		if (time_elapsed >= TIME_DURATION){
			time_elapsed = 0;
			switch (set){
			case OFF:
				temp = Temperature.COLD;
				break;
			case LOW:
			case MEDIUM:
				temp = Temperature.WARM;
				break;
			case HIGH:
				temp = Temperature.HOT;
				break;
			}
		}
	}
	
	public Temperature getTemperature(){
		return temp;
	}
	
	public void displayBurner(){
		System.out.print("[" + set.toString() + "].....");
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
