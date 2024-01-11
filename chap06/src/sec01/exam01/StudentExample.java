package sec01.exam01;

public class StudentExample {

	public static void main(String[] args) { // s1, s2는 스택영역 / s1,s2의 new객체는 힙영역
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");

	}

}
