package sec02.exam05;

public class ImplementationC implements InterfaceC { 
//InterfaceC에 InterfaceA, InterfaceB를 상속했고 그 InterfaceC를 다시 implements 하기 때문에 override가 세개

	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
		
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
		
	}

}
