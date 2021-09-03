package transation;

public class Transation {
	private String name;

	public Transation(String name) {
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
		return "[°Å·¡ = "+ name + "]";
	}
	
}
