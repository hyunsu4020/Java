package exPerson_v1;
import java.util.*;
public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Person> pList = new ArrayList<Person>(); 	//업캐스팅 시키기 위해 Person
		Scanner sc = new Scanner(System.in);
		boolean isStop = false;
		
		do
		{
			System.out.println("메뉴선택 : "); 
			System.out.println("1.회원등록");
			System.out.println("2.회원조회");
			System.out.println("3.회원샂게");
			System.out.println("4.프로그램 종료");
			String menu = sc.next();
			
			switch (menu)
			{
			case "1":	//회원정보 등록
			{
				System.out.println(" <회원 등록> ");
				System.out.print("이름 : "); String name = sc.next();
				System.out.print("연락처 : "); String tel = sc.next();
				System.out.print("주소 : "); String addr = sc.next();
				System.out.print("주문제품 : "); String item = sc.next();
				System.out.print("가격 : "); int price = sc.nextInt();
				pList.add(new Customer(name, tel, addr, item, price));
				
			} break;
			case "2":	//회원검색
			{
				System.out.println(" <회원 검색> ");
				for (Person p:pList) 
					System.out.println(p);
				System.out.println("------------------------");
			} break;
			case "3":	//회원삭제
			{
				System.out.println(" <회원 삭제> ");
				System.out.println("삭제할 회원 : "); String name = sc.next();
				
				for (Person p:pList) {
					if (name.equals(p.getName())) {
						pList.remove(p);
						System.out.println("삭제되었습니다.");
						break;
					}
				}
				
			} break;
			case "4":
			{
				System.out.println("프로그램 종료");
				isStop = true;
			} break;
			
			}
			
		} while (!isStop);
		
	}
}
