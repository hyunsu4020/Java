package ch6_51;
class Person {
	String id;	//학번
	String name;	//이름
	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}
}
class Student extends Person {
	String grade;	//학점
	String department;	//학과
	public Student(String id, String name) {
		super(id, name);
	}
}
public class PersonEx {
	public static void main(String[] args) {
		Student s = new Student("2018974031", "이현수");
		s.grade = "A";
		s.department="컴퓨터공학";
	/*	System.out.println("학번: " + s.id);
		System.out.println("이름: " + s.name);
		System.out.println("학점: " + s.grade);
		System.out.println("학과: " + s.department);
	*/
		//업캐스팅예제
		Person p=s;		//업캐스팅
		System.out.println(p.name);
	//	p.grade="A";	//오류발생: p객체로 grade 멤버에 접근이 안됨.
	//	p.department="컴퓨터공학";	//오류발생: p객체로 department 멤버에 접근 안됨.
		
		s=(Student)p;	//다운캐스팅
		s.grade="A";
		s.department="컴퓨터공학";
		System.out.println("학번: " + s.id);
		System.out.println("이름: " + s.name);
		System.out.println("학점: " + s.grade);
		System.out.println("학과: " + s.department);
	}

}
