package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value); // %d(변수) = value, \n 줄바꿈
		System.out.printf("상품의 가격:%6d원\n", value); // %6d, %-6d 6자리수 맞춤 앞/뒤
		System.out.printf("상품의 가격:%-6d원\n", value); 
		System.out.printf("상품의 가격:%06d원\n", value); // %06d 6자리수 맟춤, 빈칸은 0으로
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area); //%10.2f 10자리 수 맞춤
		
		String name = "홍길동";
		String jod = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, jod);
	}
	
}
