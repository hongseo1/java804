package sec04.exam05;
import java.util.Scanner; //Scanner 통문자열을 읽을 수 있음

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine(); // scanner.nextLine() = 변수.메서드()
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.equals("q")) { //equals: 문자열 비교하는 메서드 / inputData.equals("q") inputData 값과 ("")을 비교
				break; //inputData와 q가 같으면 종료
			}
		}
		System.out.println("종료");
	}

}
