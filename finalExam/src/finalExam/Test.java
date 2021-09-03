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
			System.out.println(" *** Java ���� �ŷ��� *** ");
			System.out.println(" �޴���ȣ �Է�: ");
			System.out.println(" 1.���� ���� ");
			System.out.println(" 2.�ŷ� ���� ");
			System.out.println(" 3.���� �ȱ� ");
			System.out.println(" 4.�����ڻ� �˻� ");
			System.out.println(" 9.���α׷� ���� ");
			menu = sc.next();
			switch(menu)
			{
			case "1":
			{
				System.out.println(" *** Coin Buy *** ");
				System.out.println(" 1.��Ʈ���� 2.�̴���������"); int type = sc.nextInt();
				System.out.print("������ ����: "); name = sc.next(); 
				
				switch(type) {
				case 1:
				{
					System.out.print("���� �ּ�(16����): "); String address = sc.next();
					System.out.print("������ �ݾ�: "); long buy = sc.nextLong();
					System.out.print("���� " + name + " ���� ����: "); long price = sc.nextLong();
					System.out.print("�ڵ��ż� �����Ͻø� 1���� �����ּ���: "); long number = sc.nextLong();
					
					pList.add(new Bitcoin(name, address, buy, price, number));
				} break;
				case 2:
				{
					System.out.print("���� �ּ�(16����): "); String address2 = sc.next();
					System.out.print("������ �ݾ�: "); long buy2 = sc.nextLong();
					System.out.print("���� " + name + " ���� ����: "); long price2 = sc.nextLong();	
					System.out.print("�ڵ��ż� �����Ͻø� 1���� �����ּ���: "); long number2 = sc.nextLong();
					
					pList.add(new Ethereum(name, address2, buy2, price2, number2));
				} break;
				}
				System.out.println("�ڵ��ż� �Ǿ����ϴ�.");
			} break;
			case "2":
			{
				System.out.println(" *** ���� �ŷ� ���� *** ");
				System.out.print(" ������ �����̸�: "); name = sc.next();
				System.out.print(" 1.��Ʈ���� 2.�̴���������"); int type = sc.nextInt();
				
				switch(type) {
				case 1:
				{
					for(Coins p:pList) {
						if(!(p instanceof Bitcoin)) continue;
						Bitcoin m = (Bitcoin)p;
						if(name.equals(p.getName())) {
							System.out.print("�ּ� ����: " + m.getAddress() + "=> ");
							m.setAddress(sc.next());
							
							System.out.print("������ �ݾ�: " + m.getBuy() + "=> ");
							m.setBuy(sc.nextLong());
							
							System.out.print(p.getName() + "���簡��: " + m.getPrice() + "=> ");
							m.setPrice(sc.nextLong());
							
							System.out.print("�ڵ��ż� �����Ͻø� 1���� �����ּ���: ");
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
							System.out.print("�ּ� ����: " + m.getAddress2() + "=> ");
							m.setAddress2(sc.next());
							
							System.out.print("������ �ݾ�: " + m.getBuy2() + "=> ");
							m.setBuy2(sc.nextLong());
							
							System.out.print(p.getName() + "���簡��: " + m.getPrice2() + "=> ");
							m.setPrice2(sc.nextLong());
							
							System.out.print("�ڵ��ż� �����Ͻø� 1���� �����ּ���: ");
							m.setNumber2(sc.nextLong());
						}
					}
					} break;
				}
			} break;
			case "3":
			{
				System.out.println(" *** Coin Sell ***");
				System.out.print("�Ǹ��� ����: "); name = sc.next();
				int result = 1;
				
				for(Coins p:pList) {
					if (name.equals(p.getName()))
					{
						pList.remove(p);
						System.out.println("������ ��� �ǸŵǾ����ϴ�.");
						result = 0;
						break;
					}
				}
			} break;
			case "4":
			{
				System.out.println(" *** �����ڻ� �˻� *** ");
				for (Coins p:pList) {
					System.out.println(p);
				}
				System.out.println("--------------------------");
 			} break;
			case "9":
			{
				System.out.println("�����մϴ�.");
				isStop=true;
			} break;
			}
		} while (!isStop);
	}
}
