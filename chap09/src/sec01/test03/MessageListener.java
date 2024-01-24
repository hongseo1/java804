package sec01.test03;

public class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("문자를 보냅니다.");
	}

}
