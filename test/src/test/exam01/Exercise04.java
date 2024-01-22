package test.exam01;

public class Exercise04 {//주사위 2개 합이 5일때 멈추기

	public static void main(String[] args) {
		int result = 0; //while문 밖에 선언
		while(result!=5) { //result값이 5가 아니면 계속 반복
			int x = (int)(Math.random()*6)+1;
			int y = (int)(Math.random()*6)+1;
			result = x+y;
			System.out.println("("+x+","+y+")");
		}
	}

}
