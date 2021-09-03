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
			System.out.println(" *** Java �ŷ��� *** ");
			System.out.println(" �޴���ȣ �Է�: ");
			System.out.println(" 1.�ŷ� ���� ");
			System.out.println(" 2.�ŷ� ���� ");
			System.out.println(" 3.�ڻ� �ȱ� ");
			System.out.println(" 4.�ڻ� �˻� ");
			System.out.println(" 9.���α׷� ���� ");
			menu = sc.next();
			switch(menu)
			{
			case "1":
			{
				System.out.println(" *** Buy *** ");
				System.out.println(" 1.���� 2.�ֽ�"); int type = sc.nextInt();
				System.out.print("������ �ż��Ͻǰǰ���? : "); name = sc.next(); 
				
				switch(type) {
				case 1:
				{
					System.out.print("���� �ּ�(16����): "); String address = sc.next();
					System.out.print("������ �ݾ�: "); long buy = sc.nextLong();
					System.out.print("���� " + name + " ���� ����: "); long price = sc.nextLong();
					System.out.print("�ڵ��ż� �����Ͻø� 1���� �����ּ���: "); int number = sc.nextInt();
					
					pList.add(new Coins(name, address, buy, price, number));
				} break;
				case 2:
				{
					System.out.print("����� ����: "); String owner = sc.next();
					System.out.print(name + "�� ������ �ݾ��� �Է����ּ���: "); long Amount = sc.nextLong();
					System.out.print("���� " + name + "����: "); long Stockprice = sc.nextLong();
					System.out.print("�ڵ��ż� �����Ͻø� 1���� �����ּ���: "); int num = sc.nextInt();
					
					pList.add(new stocks(name, owner, Amount, Stockprice, num));
				} break;
				}
				System.out.println("�ڵ��ż� �Ǿ����ϴ�.");
			} break;
			case "2":
			{
				System.out.println(" *** �ŷ� ���� *** ");
				System.out.print("1.���ΰŷ��ҷ� �̵� 2.�ֽİŷ��ҷ� �̵�: "); int type = sc.nextInt();
				
				switch(type) {
				case 1:
				{
					System.out.print("������ �����̸�: "); name = sc.next();
					for(Transation p:pList) {
						if(!(p instanceof Coins)) continue;
						Coins c = (Coins)p;
						if(name.equals(p.getName())) {
							System.out.print("�ּ� ����: " + c.getAddress() + "=> ");
							c.setAddress(sc.next());
							
							System.out.print("������ �ݾ�: " + c.getBuy() + "=> ");
							c.setBuy(sc.nextLong());
							
							System.out.print(p.getName() + " ���簡��: " + c.getPrice() + "=> ");
							c.setPrice(sc.nextLong());
					
							System.out.print("�ڵ��ż� �����Ͻø� 1���� �����ּ���: ");
							c.setNumber(sc.nextInt());
							System.out.println("�ڵ��ż� �Ǿ����ϴ�.");
						}
					}
				} break;
				case 2:
				{
					System.out.print("������ �ֽ��̸�: "); name = sc.next();
					for(Transation p:pList) {
						if(!(p instanceof stocks)) continue;
						stocks s = (stocks)p;
						if(name.equals(p.getName())) {
							System.out.print("���� ����: " + s.getOwner() + "=> ");
							s.setOwner(sc.next());
							
							System.out.print("������ ���� �ݾ�: " + s.getAmount() + "=> ");
							s.setAmount(sc.nextLong());
							
							System.out.print(p.getName() + " ���簡��: " + s.getStockPrice() + "=> ");
							s.setStockPrice(sc.nextLong());
							
							System.out.print("�ڵ��ż� �����Ͻø� 1���� �����ּ���: ");
							s.setNum(sc.nextInt());
							System.out.println("�ڵ��ż� �Ǿ����ϴ�.");
						}
					}
					} break;
				}
			} break;
			case "3":
			{
				System.out.println(" *** Sell ***");
				System.out.print("�Ǹ��� �ڻ�: "); name = sc.next();
				int result = 1;
				
				for(Transation p:pList) {
					if (name.equals(p.getName()))
					{
						pList.remove(p);
						System.out.println(name + "��(��) ��� �ǸŵǾ����ϴ�.");
						result = 0;
						break;
					}
				}
			} break;
			case "4":
			{
				System.out.println(" *** �ڻ� �˻� *** ");
				for (Transation p:pList) {
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
