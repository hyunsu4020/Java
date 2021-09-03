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
	//�񸸵� ��¸޼ҵ�
	public String getState() {
		double diff = this.weight - this.getStWeight();
		if (diff < -5)
			return "��ü���Դϴ�.";
		else if (diff > 5)
				return "�������Դϴ�.";
		else
			return "����ü���Դϴ�.";	
	}
	private double getStWeight() {	//ǥ��ü�߰�� 
		return (height - 100) * 0.9;
	}

	@Override
	public String toString() { 	//[����] �̸��� ����ϱ� ���ؼ� ( )�� �߰��ؾ��� �ڵ��?
		return "[ȸ��] �̸�: " + super.toString() + "ǥ��ü��: "+ getState() +  "kg, �񸸵�=" + getStWeight();
	}
	
}
