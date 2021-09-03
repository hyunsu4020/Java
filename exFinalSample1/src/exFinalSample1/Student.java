package exFinalSample1;

public class Student extends Person {
	private String id;		//학번
	private String major;	//전공
	
	public Student(String name, String id, String major) {
		super(name);
		this.id = id;
		this.major = major;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	@Override		//오버라이딩
	public String work() {
		return super.getName() + "이 공부를 합니다.";
	}	
	
}
