package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone(); (X)
		//객체 생성은 자식 클래스를 통해서만 가능
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.trunOn();
		smartPhone.internetSearch();
		smartPhone.trunOff();
	}

}
