package sec03.exam04;

public class LongOperationExample {
	// byte=1byte, int=4byte, long=8byte
	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3; // byte, int, long을 더한걸 long으로 자동 형 변환
		System.out.println(result);
	}

}
