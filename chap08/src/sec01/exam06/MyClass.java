package sec01.exam06;

public class MyClass {
	//필드
	RemoteControl rc = new Television(); //자동 형변환
	
	//생성자
	MyClass(){}
	
	MyClass(RemoteControl rc){ //실행 클래스에서 생성자의 매개변수를 받아서 실행
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메소드
	void methodA() {//지역변수로 Audio();
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메소드의 매개변수 형식
	void methodB(RemoteControl rc) { //실행 클래스에서 메소드의 매개변수를 받아서 실행
		rc.turnOn();
		rc.setVolume(5);
	}
}
