package sec01.exam02;

public class A {
	//인스턴스 필드
	B field1 = new B();
	C field2 = new C();
	
	//인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//static B field3 = new B(); // 인스턴스 클래스에 static을 붙이면 객체 생성 불가능 (B클래스는 인스턴스 클래스로 객체 생성이 필요하기 때문)
	static C field4 = new C(); // C클래스는 정적 클래스이기 때문에 생성자 없이 사용 가능 
	//B클래스는 인스턴스 클래스로  B안에 new B()생성자는 static이  안됨, static은 여러 변수를 사용해도 객체가 하나니깐 가능
	
	//정적 메소드
	static void method2() {
		//B var1 = new B();
		C var2 = new C();
	}
	
	//인스턴스 멤버 클래스
	class B {}
	//정적 멤버 클래스
	static class C {}
	
	
	/*
	static B field3 = new B();이 안되는 이유
	바깥쪽 정적 필드나 메소드에서는 객체 생성 없이 접근이 가능하지만, > A 클래스 안에 정적필드와 메소드는 객체 생성 없이 접근이 가능,
	안쪽 인스턴스 객체(실제 내용물)는 그렇지 않기 때문 > 안쪽 인스턴스 클래스(B클래스)는 객체 생성이 있어야 접근이 가능하기 때문에
	
	또는, 멤버 클래스가 인스턴스면 객체 생성이 전제 조건인데, > B클래스는 객체 생성이 전제 조건인데
	바깥 필드나 메소드가 정적이라면 객체 생성이 안되어 있을 수 있기 때문 > static void method2() {//B var1 = new B();}
	
	인스턴스는 일대 다 / 정적(static)은 일대 일
	*/
}
