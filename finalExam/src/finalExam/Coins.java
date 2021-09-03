package finalExam;

public class Coins {
	private String name;

	public Coins(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[ÄÚÀÎ = " + name + "]";
	}
	
	
}	

