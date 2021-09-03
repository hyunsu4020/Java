package exHealthCare1;
public class Member extends Person {
	private String id;
	private double weight;
	private double height;
	
	public Member(String name, String id, double weight, double height) {
		super(name);
		this.id = id;
		this.weight = weight;
		this.height = height;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	//비만도 출력메소드
	public String getState() {
		double diff = this.weight - this.getStWeight();
		if (diff < -5)
			return "저체중입니다.";
		else if (diff > 5)
				return "과제중입니다.";
		else
			return "정상체중입니다.";	
	}
	private double getStWeight() {	//표준체중계산 
		return (height - 100) * 0.9;
	}

	@Override
	public String toString() { 	//[퀴즈] 이름을 출력하기 위해서 ( )에 추가해야할 코드는?
		return "[회원] 이름: " + super.toString() + "표준체중: "+ getState() +  "kg, 비만도=" + getStWeight();
	}
	
}
