package sec01.exam06;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		//8<= ... < 12(8+4) 사이의 정수 얻기 // 경우의 수는 4가지, 최소 8(1) 최대11(6)
		int time = (int)(Math.random()*4) + 8; //(int)(Math.random()*4) = 3
		System.out.println("[현재시간: " + time + "시]");
		
		switch(time) {
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default:
				System.out.println("외근을 나갑니다.");
			
		}

	}

}
