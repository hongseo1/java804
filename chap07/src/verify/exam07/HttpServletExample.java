package verify.exam07;

public class HttpServletExample {//공부 다음 테스트 문제

	public static void main(String[] args) {
		// 생성자 객체를 만들어서 method에 담음.
		method(new LonginServlet());
		method(new FileDownloadServlet());

	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
