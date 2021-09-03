package exHealthCare1;
import java.util.*;
public class HealthTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//��ü�߰�, �����Ҷ� ()������ �����Ѵ�.
		ArrayList<Person> pList = new ArrayList<Person>();
		boolean isStop = false;
		String menu, name;
		do 
		{
			System.out.println(" *** HealthCare ȸ������ ���α׷� *** ");
			System.out.println(" �޴���ȣ �Է�: ");
			System.out.println(" 1.ȸ������");
			System.out.println(" 2.ȸ������ ����");
			System.out.println(" 3.ȸ������ ����");
			System.out.println(" 4.ȸ�����(����)");
			System.out.println(" 9.���α׷� ����");
			menu = sc.next();
			switch(menu)
			{
			case "1": 	//ȸ������
			{
				System.out.println(" *** ȸ������ ��� ***");
				System.out.println(" 1.ȸ����� 2.��ȸ����� ");
				int type = sc.nextInt();
				System.out.print("�̸� : "); name = sc.next();
	
				switch(type) {
				case 1:		//ȸ�� ���
				{
					System.out.print("ȸ����ȣ: "); String id = sc.next();
					System.out.print("������(kg): "); double w = sc.nextDouble();
					System.out.print("Ű(cm): "); double h = sc.nextDouble();
					
					pList.add(new Member(name, id, w, h));		//��ĳ����
				} break;
				case 2:		//��ȸ�����
				{
					System.out.print("ȸ�� : "); long money = sc.nextLong();
					pList.add(new Customer(name, money));
				} break;
				}
				System.out.println("��ϵǾ����ϴ�.");	
			} break;
			case "2":	//ȸ������
			{
				System.out.println(" *** ȸ������ ���� ***");
				System.out.print("������ ȸ���̸� : "); name = sc.next();
				
				for(Person p:pList) {
					if (!(p instanceof Member)) continue;
					Member m = (Member)p;
					if(name.equals(p.getName())) {
						System.out.print("ID      : " + m.getId() + "=> "); 
						m.setId(sc.next());
						
						System.out.print("Ű(cm) : " + m.getHeight() + "=> ");
						m.setHeight(sc.nextDouble());
						
						System.out.print("������(kg) : " + m.getWeight() + "=> ");
						m.setWeight(sc.nextDouble());
						break;
					}
				}
				
			} break;
			case "3":	//ȸ������
			{
				System.out.println(" *** ȸ������ ���� ***");
				System.out.print("������ ȸ���̸� : "); name = sc.next();
				int result = 1;
				
				for(Person p:pList) {
					if (name.equals(p.getName()))
					{
						pList.remove(p);
						System.out.println("�����Ǿ����ϴ�.");
						result = 0;
						break;
					}
				}
				if (result==1) System.out.println("ã�� ȸ���� �����ϴ�.");
				
			} break;
			case "4":	//ȸ����ü�˻�
			{
				System.out.println(" *** ���� ȸ����� ��ȸ ***");
				for (Person p :pList) {
					System.out.println(p);
				}
				System.out.println("-----------------------");
			} break;
			case "99":
			{
				System.out.println("�����մϴ�...");
				isStop=true;
			} break;
			}
		} while (!isStop);
	}
}
