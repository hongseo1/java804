package sec01.exam07.pack1;

public class B { //protected는 같은 패키지에서 가능
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}