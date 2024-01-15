package sec01.exam01;

public class DmbcellPhone extends CellPhone { //CellPhone을 상속받음  (자식클래스 extends 부모클래스)
	//필드
	int channel;
	
	//생성자
	//DmbcellPhone(){super();} 생략 //super() 부모
	DmbcellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
