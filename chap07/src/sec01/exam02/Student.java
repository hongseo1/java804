package sec01.exam02;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //무조건 첫번째 줄 / 부모 클래스에 파라멘트 두개가 생성자로 있기 때문에 ()안에 꼭 파라멘트 적어줘야 함.
		// super 생략 시 부모 클래스 필드를 작성해줘야 함. (예시: sec01.exam01; DmbcellPhone)
		this.studentNo = studentNo;
	}
}
