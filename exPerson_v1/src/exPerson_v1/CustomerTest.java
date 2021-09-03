package exPerson_v1;
import java.util.*;
public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Person> pList = new ArrayList<Person>(); 	//��ĳ���� ��Ű�� ���� Person
		Scanner sc = new Scanner(System.in);
		boolean isStop = false;
		
		do
		{
			System.out.println("�޴����� : "); 
			System.out.println("1.ȸ�����");
			System.out.println("2.ȸ����ȸ");
			System.out.println("3.ȸ������");
			System.out.println("4.���α׷� ����");
			String menu = sc.next();
			
			switch (menu)
			{
			case "1":	//ȸ������ ���
			{
				System.out.println(" <ȸ�� ���> ");
				System.out.print("�̸� : "); String name = sc.next();
				System.out.print("����ó : "); String tel = sc.next();
				System.out.print("�ּ� : "); String addr = sc.next();
				System.out.print("�ֹ���ǰ : "); String item = sc.next();
				System.out.print("���� : "); int price = sc.nextInt();
				pList.add(new Customer(name, tel, addr, item, price));
				
			} break;
			case "2":	//ȸ���˻�
			{
				System.out.println(" <ȸ�� �˻�> ");
				for (Person p:pList) 
					System.out.println(p);
				System.out.println("------------------------");
			} break;
			case "3":	//ȸ������
			{
				System.out.println(" <ȸ�� ����> ");
				System.out.println("������ ȸ�� : "); String name = sc.next();
				
				for (Person p:pList) {
					if (name.equals(p.getName())) {
						pList.remove(p);
						System.out.println("�����Ǿ����ϴ�.");
						break;
					}
				}
				
			} break;
			case "4":
			{
				System.out.println("���α׷� ����");
				isStop = true;
			} break;
			
			}
			
		} while (!isStop);
		
	}
}
