package exCh5_11;
import java.util.Scanner;
public class CarTest {
	public static void main(String[] args) {
		int menu;
		Scanner sc = new Scanner(System.in);
		SuperCar s = new SuperCar();
		
		System.out.println(" *** 자동차 운행경기 *** ");
		do
		{
			System.out.println(" 1. 속도증가 ");
			System.out.println(" 2. 속도감소 ");
			System.out.println(" 3. 터보실행 ");
			System.out.println(" 4. 터보감소 ");
			System.out.println(" 9. 종   료 ");
			System.out.print(" 번호를 입력하세요 : ");
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
			case 9: System.out.println("프로그램을 종료합니다.");
			break;
			}
			System.out.println("-----------------------------");
			System.out.println("현재속도는 " + s.speed + "입니다.");
			System.out.println("-----------------------------");
		} while(menu!=9);
		
	}
		
}
