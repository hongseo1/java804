package sec03.exam05;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2; //컴파일 에러
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charVlaue3 = charValue1 + charValue2; //컴파일 에러 (+하면 4byte가 넘어가기 때문에 오류, int로 변환하여 계산)
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char) intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4); //int는 정수형으로 소수점이 잘림

		int intValue5 = 10;
		//int intValue6 = 10 / 4.0; //컴파일 에러
		double doubleValue = intValue5 / 4.0; //float(intValue5 / 4.0)(기본값이 float)의 결과를 double로  자동 형 변환
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y; //(x / y 계산한 기본값이 float이지만 double로 강제 형 변환)
		System.out.println(result);

	}

}
