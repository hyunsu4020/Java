package finalExam;

public class Ethereum extends Coins {
	private String address2;
	private long buy2;
	private long price2;
	private long number2;
	
	public Ethereum(String name, String address2, long buy2, long price2, long number2) {
		super(name);
		this.address2 = address2;
		this.buy2 = buy2;
		this.price2 = price2;
		this.number2 = number2;	
	}
	
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public long getBuy2() {
		return buy2;
	}
	public void setBuy2(long buy2) {
		this.buy2 = buy2;
	}
	public long getPrice2() {
		return price2;
	}
	public void setPrice2(long price2) {
		this.price2 = price2;
	}
	public double getNumber2() {
		return number2;
	}
	public void setNumber2(long number2) {
		this.number2 = number2;
	}

	public long getCoin2() {
		return  (buy2/price2);
	}
	
	@Override
	public String toString() {
		return super.toString() + "º¸À¯·®: " + getCoin2();
	}
	
}
