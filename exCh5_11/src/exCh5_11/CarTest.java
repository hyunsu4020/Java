package exCh5_11;
import java.util.Scanner;
public class CarTest {
	public static void main(String[] args) {
		int menu;
		Scanner sc = new Scanner(System.in);
		SuperCar s = new SuperCar();
		
		System.out.println(" *** �ڵ��� ������ *** ");
		do
		{
			System.out.println(" 1. �ӵ����� ");
			System.out.println(" 2. �ӵ����� ");
			System.out.println(" 3. �ͺ����� ");
			System.out.println(" 4. �ͺ����� ");
			System.out.println(" 9. ��   �� ");
			System.out.print(" ��ȣ�� �Է��ϼ��� : ");
			menu = sc.nextInt();
			
			switch(menu)
			{
			case 1:
				s.speedUp();
				break;
			case 2:
				s.speedDown();
				break;
			case 3:
				s.startTurbo();
				break;
			case 4:
				s.stopTurbo();
				break;
			case 9: System.out.println("���α׷��� �����մϴ�.");
			break;
			}
			System.out.println("-----------------------------");
			System.out.println("����ӵ��� " + s.speed + "�Դϴ�.");
			System.out.println("-----------------------------");
		} while(menu!=9);
		
	}
		
}
