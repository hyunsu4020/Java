package ch6_51;
class Person {
	String id;	//�й�
	String name;	//�̸�
	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}
}
class Student extends Person {
	String grade;	//����
	String department;	//�а�
	public Student(String id, String name) {
		super(id, name);
	}
}
public class PersonEx {
	public static void main(String[] args) {
		Student s = new Student("2018974031", "������");
		s.grade = "A";
		s.department="��ǻ�Ͱ���";
	/*	System.out.println("�й�: " + s.id);
		System.out.println("�̸�: " + s.name);
		System.out.println("����: " + s.grade);
		System.out.println("�а�: " + s.department);
	*/
		//��ĳ���ÿ���
		Person p=s;		//��ĳ����
		System.out.println(p.name);
	//	p.grade="A";	//�����߻�: p��ü�� grade ����� ������ �ȵ�.
	//	p.department="��ǻ�Ͱ���";	//�����߻�: p��ü�� department ����� ���� �ȵ�.
		
		s=(Student)p;	//�ٿ�ĳ����
		s.grade="A";
		s.department="��ǻ�Ͱ���";
		System.out.println("�й�: " + s.id);
		System.out.println("�̸�: " + s.name);
		System.out.println("����: " + s.grade);
		System.out.println("�а�: " + s.department);
	}

}
