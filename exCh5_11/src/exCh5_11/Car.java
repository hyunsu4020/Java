package exCh5_11;
public class Car {
	protected int speed;	//�ӵ�
	public int speedUp() {
		speed+=1;
		return speed;
	}
	public int speedDown() {
		speed-=1;
		return speed;
	}
}