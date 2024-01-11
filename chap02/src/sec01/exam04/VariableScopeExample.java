package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
		}
		//int v3 = v1 + v2 +5;
		// v2의 Scope(범위)는 {}에서(v2가 선언된 {} 안 까지) 끝난다.  
	}

}
