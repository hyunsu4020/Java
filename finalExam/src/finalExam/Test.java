package finalExam;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Coins> pList = new ArrayList<Coins>();
		boolean isStop = false;
		String menu, name;

		do
		{
			System.out.println(" *** Java 코인 거래소 *** ");
			System.out.println(" 메뉴번호 입력: ");
			System.out.println(" 1.코인 구입 ");
			System.out.println(" 2.거래 수정 ");
			System.out.println(" 3.코인 팔기 ");
			System.out.println(" 4.코인자산 검색 ");
			System.out.println(" 9.프로그램 종료 ");
			menu = sc.next();
			switch(menu)
			{
			case "1":
			{
				System.out.println(" *** Coin Buy *** ");
				System.out.println(" 1.비트코인 2.이더리움코인"); int type = sc.nextInt();
				System.out.print("구매한 코인: "); name = sc.next(); 
				
				switch(type) {
				case 1:
				{
					System.out.print("코인 주소(16진수): "); String address = sc.next();
					System.out.print("투자할 금액: "); long buy = sc.nextLong();
					System.out.print("현재 " + name + " 코인 가격: "); long price = sc.nextLong();
					System.out.print("자동매수 동의하시면 1번을 눌러주세요: "); long number = sc.nextLong();
					
					pList.add(new Bitcoin(name, address, buy, price, number));
				} break;
				case 2:
				{
					System.out.print("코인 주소(16진수): "); String address2 = sc.next();
					System.out.print("투자할 금액: "); long buy2 = sc.nextLong();
					System.out.print("현재 " + name + " 코인 가격: "); long price2 = sc.nextLong();	
					System.out.print("자동매수 동의하시면 1번을 눌러주세요: "); long number2 = sc.nextLong();
					
					pList.add(new Ethereum(name, address2, buy2, price2, number2));
				} break;
				}
				System.out.println("자동매수 되었습니다.");
			} break;
			case "2":
			{
				System.out.println(" *** 현재 거래 수정 *** ");
				System.out.print(" 수정할 코인이름: "); name = sc.next();
				System.out.print(" 1.비트코인 2.이더리움코인"); int type = sc.nextInt();
				
				switch(type) {
				case 1:
				{
					for(Coins p:pList) {
						if(!(p instanceof Bitcoin)) continue;
						Bitcoin m = (Bitcoin)p;
						if(name.equals(p.getName())) {
							System.out.print("주소 변경: " + m.getAddress() + "=> ");
							m.setAddress(sc.next());
							
							System.out.print("투자할 금액: " + m.getBuy() + "=> ");
							m.setBuy(sc.nextLong());
							
							System.out.print(p.getName() + "현재가격: " + m.getPrice() + "=> ");
							m.setPrice(sc.nextLong());
							
							System.out.print("자동매수 동의하시면 1번을 눌러주세요: ");
							m.setNumber(sc.nextLong());
							
						}
					}
				} break;
				case 2:
				{
					for(Coins p:pList) {
						if(!(p instanceof Ethereum)) continue;
						Ethereum m = (Ethereum)p;
						if(name.equals(p.getName())) {
							System.out.print("주소 변경: " + m.getAddress2() + "=> ");
							m.setAddress2(sc.next());
							
							System.out.print("투자할 금액: " + m.getBuy2() + "=> ");
							m.setBuy2(sc.nextLong());
							
							System.out.print(p.getName() + "현재가격: " + m.getPrice2() + "=> ");
							m.setPrice2(sc.nextLong());
							
							System.out.print("자동매수 동의하시면 1번을 눌러주세요: ");
							m.setNumber2(sc.nextLong());
						}
					}
					} break;
				}
			} break;
			case "3":
			{
				System.out.println(" *** Coin Sell ***");
				System.out.print("판매할 코인: "); name = sc.next();
				int result = 1;
				
				for(Coins p:pList) {
					if (name.equals(p.getName()))
					{
						pList.remove(p);
						System.out.println("코인이 모두 판매되었습니다.");
						result = 0;
						break;
					}
				}
			} break;
			case "4":
			{
				System.out.println(" *** 코인자산 검색 *** ");
				for (Coins p:pList) {
					System.out.println(p);
				}
				System.out.println("--------------------------");
 			} break;
			case "9":
			{
				System.out.println("종료합니다.");
				isStop=true;
			} break;
			}
		} while (!isStop);
	}
}
