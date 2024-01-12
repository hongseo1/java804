package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

		//p1.nation = "usa"; //final 필드에 값이 처음부터 있기 때문에 컴파일 에러
		//p1.ssn = "654321-7654321"; // final 필드에 값이 없을 경우 생성자에서만 초기화 가능하기 때문에 컴파일 에러
		p1.name = "홍삼원";
		
	}

}
