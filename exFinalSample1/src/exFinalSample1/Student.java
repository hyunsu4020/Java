package exFinalSample1;

public class Student extends Person {
	private String id;		//�й�
	private String major;	//����
	
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

	@Override		//�������̵�
	public String work() {
		return super.getName() + "�� ���θ� �մϴ�.";
	}	
	
}
