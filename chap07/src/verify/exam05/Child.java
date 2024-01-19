package verify.exam05;

public class Child extends Parent {
	private String name;
	
	public Child() {// 생성자 파라멘트가 없으니깐
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		 // super(); > 부모 클래스로
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
