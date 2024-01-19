package sec01.exam05;

public class SmartTelevisionExample {

	public static void main(String[] args) {// 상속은 하나 밖에 안 되지만, 객체는 다수의 인터페이스로 사용 가능
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv; //자동 형변환
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		Searchable searchable = tv; //자동 형변환 
		searchable.search("naver.com");
	}


}
