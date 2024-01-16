package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class D extends A{ //부모가 protected것은 패키지가 달라도 가능 C는 extends로 상속하지 않아서 불가능, 기본은 둘다 가능
	public D() {
		super();
		this.field = "value";
		this.method();
	}
	
}
