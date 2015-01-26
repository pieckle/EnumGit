
public enum Setting {

	OFF("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");
	
	private String value;
	
	Setting(String set){
		value = set;
	}
	
	public String toString(){
		return value;
	}
	
}
