package exHealthCare1;
public class Customer extends Person {
	private long money;		//ȸ��
	//������
	public Customer(String name, long money) {
		super(name);
		this.setMoney(money);
	}
	public long getMoney() {
		return money;
	}
	public void setMoney(long money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "[�Ϲ�]" + super.toString() + "ȸ��: " + money + "]";
	}
	
}
