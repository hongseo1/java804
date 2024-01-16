package sec01.exam06;

public class SportstCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	/*
	@Override
	public void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	} // 부모 클래스에서 이미 final 메소드로 설정했기 때문에 X
	*/

}
