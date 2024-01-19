package sec01.exam06;

public interface RemoteControl { // public 뒤에 static final 생략되어 있음 
	//상수 (필드)
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//public abstract 생략되어 있음
	//추상 메소드  
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
