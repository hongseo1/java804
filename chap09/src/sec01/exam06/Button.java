package sec01.exam06;

public class Button {
	//인터페이스 타입 필드 선언
	OnClickListener listener;
	
	//인터페이스는 객체를 생성을 못하니깐 외부에서 받을 수 있도로 setter 설정
	void setOnClickListener(OnClickListener listener) { // 매개 변수의 다향성
		this.listener = listener;
	}
	
	//실제 버튼을 클릭 했을 때 실행하는 내용을 작성하지 않음
	void touch() {
		listener.onClick(); //구현 객체의 onClick() 메소드 호출
	}
	
	//static이 선언된 interface는 객체 없이 사용 가능
	//중첩 interface: 버튼을 클릭했을 때 실제로 실행할 내용을 담고 있는 구현객체를 얻기 위해...
	static interface OnClickListener{ //interface타입의 클래스
		void onClick();
	}
}
