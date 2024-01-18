package sec03.exam01;

public class SmartPhone extends Phone {
	
	public SmartPhone(String owner) { // 반듯이 생성자 만들어햐 함
		super(owner);
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
