package exHealthCare1;
import java.util.*;
public class HealthTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//객체추가, 삭제할때 ()변수로 접근한다.
		ArrayList<Person> pList = new ArrayList<Person>();
		boolean isStop = false;
		String menu, name;
		do 
		{
			System.out.println(" *** HealthCare 회원관리 프로그램 *** ");
			System.out.println(" 메뉴번호 입력: ");
			System.out.println(" 1.회원가입");
			System.out.println(" 2.회원정보 수정");
			System.out.println(" 3.회원정보 삭제");
			System.out.println(" 4.회원목록(전쳬)");
			System.out.println(" 9.프로그램 종료");
			menu = sc.next();
			switch(menu)
			{
			case "1": 	//회원가입
			{
				System.out.println(" *** 회원정보 등록 ***");
				System.out.println(" 1.회원등록 2.비회원등록 ");
				int type = sc.nextInt();
				System.out.print("이름 : "); name = sc.next();
	
				switch(type) {
				case 1:		//회원 등록
				{
					System.out.print("회원번호: "); String id = sc.next();
					System.out.print("몸무게(kg): "); double w = sc.nextDouble();
					System.out.print("키(cm): "); double h = sc.nextDouble();
					
					pList.add(new Member(name, id, w, h));		//업캐스팅
				} break;
				case 2:		//비회원등록
				{
					System.out.print("회비 : "); long money = sc.nextLong();
					pList.add(new Customer(name, money));
				} break;
				}
				System.out.println("등록되었습니다.");	
			} break;
			case "2":	//회원수정
			{
				System.out.println(" *** 회원정보 수정 ***");
				System.out.print("수정할 회원이름 : "); name = sc.next();
				
				for(Person p:pList) {
					if (!(p instanceof Member)) continue;
					Member m = (Member)p;
					if(name.equals(p.getName())) {
						System.out.print("ID      : " + m.getId() + "=> "); 
						m.setId(sc.next());
						
						System.out.print("키(cm) : " + m.getHeight() + "=> ");
						m.setHeight(sc.nextDouble());
						
						System.out.print("몸무게(kg) : " + m.getWeight() + "=> ");
						m.setWeight(sc.nextDouble());
						break;
					}
				}
				
			} break;
			case "3":	//회원삭제
			{
				System.out.println(" *** 회원정보 삭제 ***");
				System.out.print("삭제할 회원이름 : "); name = sc.next();
				int result = 1;
				
				for(Person p:pList) {
					if (name.equals(p.getName()))
					{
						pList.remove(p);
						System.out.println("삭제되었습니다.");
						result = 0;
						break;
					}
				}
				if (result==1) System.out.println("찾는 회원이 없습니다.");
				
			} break;
			case "4":	//회원전체검색
			{
				System.out.println(" *** 전쳬 회원목록 조회 ***");
				for (Person p :pList) {
					System.out.println(p);
				}
				System.out.println("-----------------------");
			} break;
			case "99":
			{
				System.out.println("종료합니다...");
				isStop=true;
			} break;
			}
		} while (!isStop);
	}
}
