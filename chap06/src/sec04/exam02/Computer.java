package sec04.exam02;

public class Computer {
	int sum1(int[] values) { //(javascript에서) var values = {1,2,3} / {1,2,3}=실행클래스에서
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
