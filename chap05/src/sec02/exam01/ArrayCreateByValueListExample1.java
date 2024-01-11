package sec02.exam01;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int [] scores = { 83, 90, 87 };
		
		//int[] scores2; // 메모리 생성 후 값을 안 넣었기 때문에 틀림.
		//scores2 = { 83, 90, 87 }
		//참조(동적, 힙) : 배열(참조)
		
		//나중에 값을 넣을 때
		//int[] scores2;
		//scores2 = new int[] { 83, 90, 87 } //new (동적)
		
		
		System.out.println("scores[0] :" + scores[0]);
		System.out.println("scores[1] :" + scores[1]);
		System.out.println("scores[2] :" + scores[2]);
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균:" + avg);

	}

}
