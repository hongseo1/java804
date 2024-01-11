package sec01.exam05;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1; 
		//random() 원래 소수점, int로 강제 형변환 주사위에는 0이 없으니깐 +1
		
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default:
				System.out.println("6번이 나왔습니다.");
				break;
		}

	}

}
