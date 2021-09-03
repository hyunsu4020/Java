package exCh5_11;
public class SuperCar extends Car {
	public int startTurbo() {
		speed+=10;
		return speed;
	}
	public int stopTurbo() {
		speed-=10;
		return speed;
	}
}
