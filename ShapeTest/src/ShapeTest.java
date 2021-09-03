
class Shape {
	public void draw() {
		System.out.println("도형을 그린다.");
	}
}

class Circle extends Shape // draw()를 오버라이딩 시킴.
{
	public void draw() {System.out.println("원을 그린다.");}
}
class Rect extends Shape { //draw()를 오버라이딩 시킴.
	public void draw() { System.out.println("사각형을 그린다.");
}
class Line extends Shape { //draw()를 오버라이딩 시킴.
	public void draw() { System.out.println("선을 그린다.");
}
	
public class ShapeTest {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.draw();
		
		Circle c = new Circle();
		c.draw();
		Rect r = new Rect();
		r.draw();
		
		System.out.println("<< 업캐스팅된 draw 출력 >>");
		s=c;	//업캐스팅
		s.draw();
	}

}
