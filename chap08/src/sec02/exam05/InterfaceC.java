package sec02.exam05;

public interface InterfaceC extends InterfaceA, InterfaceB  {//interface에 interface를 상속할 때는 extends
	//interface는 다중 상속이 가능
	public void methodC();
}
