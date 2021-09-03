package transation;

public class Coins extends Transation {
	private String address;		
	private long buy;
	private long price;	
	private int number;					
	
	public Coins(String name, String address, long buy, long price, int number) {
		super(name);
		this.address = address;
		this.buy = buy;
		this.price = price;
		this.number = number;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getBuy() {
		return buy;
	}
	public void setBuy(long buy) {
		this.buy = buy;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public long getCoin() {
		return buy / price;
	}	

	@Override
	public String toString() {
		return super.toString() + "주소: " + getAddress() + ", " + "보유량: " + getCoin() + "개" ;
	}
	
}