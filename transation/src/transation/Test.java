package transation;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		ArrayList<Transation> pList = new ArrayList<Transation>();
		Scanner sc = new Scanner(System.in);
		boolean isStop = false;
		String menu, name;
		
		do
		{
			System.out.println(" *** Java 거래소 *** ");
			System.out.println(" 메뉴번호 입력: ");
			System.out.println(" 1.거래 시작 ");
			System.out.println(" 2.거래 수정 ");
			System.out.println(" 3.자산 팔기 ");
			System.out.println(" 4.자산 검색 ");
			System.out.println(" 9.프로그램 종료 ");
			menu = sc.next();
			switch(menu)
			{
			case "1":
			{
				System.out.println(" *** Buy *** ");
				System.out.println(" 1.코인 2.주식"); int type = sc.nextInt();
				System.out.print("무엇을 매수하실건가요? : "); name = sc.next(); 
				
				switch(type) {
				case 1:
				{
					System.out.print("코인 주소(16진수): "); String address = sc.next();
					System.out.print("투자할 금액: "); long buy = sc.nextLong();
					System.out.print("현재 " + name + " 코인 가격: "); long price = sc.nextLong();
					System.out.print("자동매수 동의하시면 1번을 눌러주세요: "); int number = sc.nextInt();
					
					pList.add(new Coins(name, address, buy, price, number));
				} break;
				case 2:
				{
					System.out.print("당신의 성함: "); String owner = sc.next();
					System.out.print(name + "에 투자할 금액을 입력해주세요: "); long Amount = sc.nextLong();
					System.out.print("현재 " + name + "가격: "); long Stockprice = sc.nextLong();
					System.out.print("자동매수 동의하시면 1번을 눌러주세요: "); int num = sc.nextInt();
					
					pList.add(new stocks(name, owner, Amount, Stockprice, num));
				} break;
				}
				System.out.println("자동매수 되었습니다.");
			} break;
			case "2":
			{
				System.out.println(" *** 거래 수정 *** ");
				System.out.print("1.코인거래소로 이동 2.주식거래소로 이동: "); int type = sc.nextInt();
				
				switch(type) {
				case 1:
				{
					System.out.print("수정할 코인이름: "); name = sc.next();
					for(Transation p:pList) {
						if(!(p instanceof Coins)) continue;
						Coins c = (Coins)p;
						if(name.equals(p.getName())) {
							System.out.print("주소 변경: " + c.getAddress() + "=> ");
							c.setAddress(sc.next());
							
							System.out.print("투자할 금액: " + c.getBuy() + "=> ");
							c.setBuy(sc.nextLong());
							
							System.out.print(p.getName() + " 현재가격: " + c.getPrice() + "=> ");
							c.setPrice(sc.nextLong());
					
							System.out.print("자동매수 동의하시면 1번을 눌러주세요: ");
							c.setNumber(sc.nextInt());
							System.out.println("자동매수 되었습니다.");
						}
					}
				} break;
				case 2:
				{
					System.out.print("수정할 주식이름: "); name = sc.next();
					for(Transation p:pList) {
						if(!(p instanceof stocks)) continue;
						stocks s = (stocks)p;
						if(name.equals(p.getName())) {
							System.out.print("성함 변경: " + s.getOwner() + "=> ");
							s.setOwner(sc.next());
							
							System.out.print("수정할 투자 금액: " + s.getAmount() + "=> ");
							s.setAmount(sc.nextLong());
							
							System.out.print(p.getName() + " 현재가격: " + s.getStockPrice() + "=> ");
							s.setStockPrice(sc.nextLong());
							
							System.out.print("자동매수 동의하시면 1번을 눌러주세요: ");
							s.setNum(sc.nextInt());
							System.out.println("자동매수 되었습니다.");
						}
					}
					} break;
				}
			} break;
			case "3":
			{
				System.out.println(" *** Sell ***");
				System.out.print("판매할 자산: "); name = sc.next();
				int result = 1;
				
				for(Transation p:pList) {
					if (name.equals(p.getName()))
					{
						pList.remove(p);
						System.out.println(name + "이(가) 모두 판매되었습니다.");
						result = 0;
						break;
					}
				}
			} break;
			case "4":
			{
				System.out.println(" *** 자산 검색 *** ");
				for (Transation p:pList) {
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
