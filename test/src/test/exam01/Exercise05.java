package test.exam01;

public class Exercise05 {//4x + 5y = 60 일때 x와 y값 구하기 (단, x와 y는 10이하 자연수)

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		
		for(x=1; x<=10; x++) {
			for(y=1; y<=10; y++) {
				if(4*x+5*y==60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}

	}

}
