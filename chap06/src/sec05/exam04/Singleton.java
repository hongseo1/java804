package sec05.exam04;

public class Singleton { // Singleton 객체를 한번만 생성
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
