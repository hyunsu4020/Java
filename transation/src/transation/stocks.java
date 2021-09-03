package transation;

public class stocks extends Transation {
	private String owner;		
	private long Amount;
	private long StockPrice;
	private int num;				
	
	public stocks(String name, String owner, long Amount, long StockPrice, int num) {
		super(name);
		this.owner = owner;
		this.Amount = Amount;
		this.StockPrice = StockPrice; 
		this.num = num;
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getAmount() {
		return Amount;
	}
	public void setAmount(long Amount) {
		this.Amount = Amount;
	}
	public long getStockPrice() {
		return StockPrice;
	}
	public void setStockPrice(long stockPrice) {
		StockPrice = stockPrice;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	

	public long getStock() {
		return  (Amount / StockPrice);
	}
	
	public double getTax() {
		return (Amount * 0.3 / 100);
	}

	@Override
	public String toString() {
		return super.toString() + "자산가 성함: " + getOwner() + ", 보유량: " + getStock() + "개" + ", " + "수수료: " + getTax() + "원 (주식은 세금 0.3%를 지불합니다.)";
		
	}
			
}