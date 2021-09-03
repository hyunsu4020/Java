package exHealthCare1;
public class Customer extends Person {
	private long money;		//회비
	//생성자
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
		return "[일반]" + super.toString() + "회비: " + money + "]";
	}
	
}
