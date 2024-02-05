package sec02.exam01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 dd월 hh시 mm분 ss초"); // HH 대문자로 하면 24시 기준
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}

}
