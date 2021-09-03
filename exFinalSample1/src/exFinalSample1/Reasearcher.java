package exFinalSample1;

public class Reasearcher extends Person {
	private String department;	//부서

	public Reasearcher(String name, String department) {
		super(name);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String work() {
		return super.getName() + "이 연구를 합니다.";
	}
	
	
}
