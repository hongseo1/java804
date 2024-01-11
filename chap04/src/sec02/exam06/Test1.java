package sec02.exam06;

public class Test1 {

	public static void main(String[] args) {
		int total = 0;
		int i = 0;
		while (i<10) { // t=0, i=0    1씩 증가... 10전까지
			i++; // i = 0(1) 1씩 증가
			total+=i; // total(1) = total(0) + i(1)  1씩 증가
			System.out.print(i); //1+2+3...+9+10 = 55
			if(i!=10) { // i가 10이 아니면 +를 출력
				System.out.print("+");
			} // +찍고 나와서 반복
		}// 10보다 작지 않을떄 나옴
		System.out.println("=" + total);
	}

}
