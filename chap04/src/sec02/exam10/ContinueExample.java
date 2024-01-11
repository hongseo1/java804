package sec02.exam10;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) { //i가 홀수면 
				continue; // continue 다시 조건문으로 
			}
			System.out.println(i);
		}

	}

}
