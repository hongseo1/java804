package sec02.exam09;

public class BreakOutterExample {

	public static void main(String[] args) {
		Outter: //Outter가 없으면 대문자 z까지 출력
		for(char upper='A'; upper<='Z'; upper++) { // upper=A
			for(char lower='a'; lower<='z'; lower++) { //lower=a~g
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter; //Outter가 없으면 대문자 z까지 출력
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	
	}

}
