package sec01.exam13;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7); // ssn의 0부터 7번째에 숫자 1으로 swhitch문
		switch (sex){
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
				
		}
	}

}
