package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {//필드 형식으로
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run(); //KumhoTire로 교체 후 실행

	}

}
