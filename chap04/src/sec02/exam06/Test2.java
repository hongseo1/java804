package sec02.exam06;

public class Test2 {

	public static void main(String[] args) {
		int total = 0;
		int i = 0; // int i 동일
		
		for(i=1; i<=10; i++) { // 위에서  int로 선언을 안 했을 경우 i=1; > int i = 1;
			total+=i; // total = total + i  (+1)
			System.out.print(i); 
			if(i!=10) {
				System.out.print("+");
			}
		}
		System.out.println("=" + total);
	}

}
