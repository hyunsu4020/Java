package exHealthCare1;
public class Person {
	private String name;	//이름
	//생성자
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//메소드 오버라이딩
	@Override
	public String toString() {
		return "[name=" + name +"]";
	}
}
