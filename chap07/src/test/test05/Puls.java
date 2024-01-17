package test.test05;

public class Puls {

	public static void main(String[] args) {
		int total = 0;
		for(int i=1; i<=10; i++) {
			total+=i;
			System.out.print(i);
			if(i!=10) {
				System.out.print("+");
			}
		}
		System.out.println("="+total);
	}

}
