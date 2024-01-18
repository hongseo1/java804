package sec02.exam04;

public class Driver {
	public void drive(Vehicle vehicle) {// Vehicle vehicle  Bus bus Taxi taxi Bus와 Taxi가 Vehicle(부모) 상속 받았기 때문
	// drive(Vehicle vehicle) 메소드(클래스 타입 클래스명)  클래스명으로 매게변수를 넣고 호출 가능 (자동형 변환) Bus bus로하면 bus실행
		vehicle.run();
	}
}
