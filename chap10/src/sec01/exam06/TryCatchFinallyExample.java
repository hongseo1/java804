package sec01.exam06;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("String2"); //문제가 있으면 실행하지 않고 바로 catch 부분 실행
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	/*Class clazz = Class.forName("String2");*/

}
