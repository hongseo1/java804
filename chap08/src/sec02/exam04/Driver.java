package sec02.exam04;

public class Driver {
	public void driver(Vehicle vehicle) { //부모로 자동형변환, 메소드 파라멘트로(매게변수) 전달 받음
		if(vehicle instanceof Bus) { //instanceof 객체 비교 (bus이면)
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
