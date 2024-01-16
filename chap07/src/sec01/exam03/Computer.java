package sec01.exam03;

public class Computer extends Calculator{

	@Override //언어테이션 (표식)
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r; //Math.PI: 3.14... double형으로 더 정확하게 
	}

}
