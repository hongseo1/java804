package sec01.exam04;

public class Outter {
	//자바 7이전
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100; //(x)
		//localVariable = 100; //(x)
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바8 이후
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100; //(x) arg (final 생략)앞에 final을 붙이지 않아도 되지만 변수를 변경하려면 에러가 발생
		//localVariable = 100; //(x)
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
