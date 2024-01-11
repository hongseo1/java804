package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10; // long으로 선언했기 때문에 L을 붙어야 하지만 작은 수라 생략가능 자동으로 강제 타입 변환(int)
		long var2= 20L;
		long var5 = 2147483647; //최대 범위
		//long var6 = 2147483678; 범위 오버
		long var7 = -2147483648; // 256*4(4byte)의 반 음수  
		//long var3 = 100000000000; 범위가 넘었기 때문에 L을 붙이지 않으면 오류
		long var4 = 100000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
