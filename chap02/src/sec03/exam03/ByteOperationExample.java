package sec03.exam03;

public class ByteOperationExample {
	// byte=1byte, int=4byte
	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println(result1); // 강제 형 변환 int 10 = int 20 을 더하고 byte로 변환
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2); // 자동 형 변환 byte 10, 20을 더해서 int로 변환
	}

}
