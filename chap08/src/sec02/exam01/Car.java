package sec02.exam01;

public class Car {
	//필드
	Tire frontLeftTire = new HanKookTire();
	Tire frontRightTire = new HanKookTire();
	Tire backLeftTire = new HanKookTire();
	Tire backrightTire = new HanKookTire();
	
	//생성자
	
	//메소드
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backrightTire.roll();
	}
}
