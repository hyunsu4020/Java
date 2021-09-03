package exPerson_v1;

public class Customer extends Person {
	private String product;		//주문제출
	private int price;			//주문가격
	
	public Customer(String name, String tel, String address, String product, int price) {
		super(name, tel, address);
		this.product = product;
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return super.toString() + "Customer [product=" + product + ", price=" + price + "]";
	}
	
}
