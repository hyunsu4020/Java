
class Shape {
	public void draw() {
		System.out.println("������ �׸���.");
	}
}

class Circle extends Shape // draw()�� �������̵� ��Ŵ.
{
	public void draw() {System.out.println("���� �׸���.");}
}
class Rect extends Shape { //draw()�� �������̵� ��Ŵ.
	public void draw() { System.out.println("�簢���� �׸���.");
}
class Line extends Shape { //draw()�� �������̵� ��Ŵ.
	public void draw() { System.out.println("���� �׸���.");
}
	
public class ShapeTest {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.draw();
		
		Circle c = new Circle();
		c.draw();
		Rect r = new Rect();
		r.draw();
		
		System.out.println("<< ��ĳ���õ� draw ��� >>");
		s=c;	//��ĳ����
		s.draw();
	}

}
