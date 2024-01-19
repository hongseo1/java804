package verify.exam06;

public class ServiceExample {

	public static void main(String[] args) {
		Controller controller = new Controller();
		//controller.setService(new Service()); 강제 형변환이라 X
		//controller.service.login();
		
		controller.setService(new MemberService()); // 자기 객체에 자기를 넣음
		controller.service.login();
		
		controller.setService(new AService()); // 자동 형변환
		controller.service.login();
	}

}
