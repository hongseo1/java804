package sec01.exam03;

public class A {
	int field1;
	void method1() { }
	
	static int field2;
	static void method2() { }

	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C{
		void method() {
			//field1 = 10;
			//method1();
			
			field2 = 10;
			method2();
		}
	}
	
	//field1은 인스턴스 필드이므로 여러 객체 생성이 가능한데 static클래스 C안에 field1을 하나로 정할 수 없다.
}
