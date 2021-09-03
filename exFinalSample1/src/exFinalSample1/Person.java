package exFinalSample1;
public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String work() {
		return this.getName() + "가(이) 일을 합니다.";
	}
}
