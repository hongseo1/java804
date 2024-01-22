package sec02.exam05;

class Number{
	static int num=0; //스택틱 필드
	int num2=0; //인스턴스 필드
}

public class StaticExample {

	public static void main(String[] args) {
		Number number1 = new Number(); //첫번째 number
		Number number2 = new Number(); //두번째 number
		
		number1.num++; //클래스 필드 num을 1증가시킴
		number1.num2++; //인스턴스 필드 num을 1증가시킴
		System.out.println(number2.num); //두번째 number의 클래스 필드 출력 
		//(static은 공유, 서로 다른 객체여도 공유됨 / number1에서 num을 증가시켰지만 number2에서도 num이 증가 되어있음)
		System.out.println(number2.num2); //두번째 number의 인스턴스 필드 출력
	}

}
