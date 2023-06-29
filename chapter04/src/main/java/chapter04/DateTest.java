package chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		
		PrintDate01(now);
		PrintDate02(now);
	}

	
	public static void PrintDate01(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sdf.format(d);
		
		System.out.println(date);
	}
	
	public static void PrintDate02(Date d) {
		// 년도(+1900)
		int year = d.getYear();
		
		// 월(0~11)
		int month = d.getMonth();
		
		// 일
		int date = d.getDate();
		
		// 시간
		int hours = d.getHours();
		
		// 분
		int minutes = d.getMinutes();
		
		// 초
		int seconds = d.getSeconds();
		
		
//		System.out.println(
//				(year+1900) + "-" +
//				(month+1) + "-" +
//				date + " " +
//				hours + ":" +
//				minutes + ":" +
//				seconds);
//	}
		System.out.println(
				(year+1900) + "-" +
				(month > 9 ? "" : "0") + (month+1) + "-" +
				date + " " +
				hours + ":" +
				minutes + ":" +
				seconds);
		}
	
	
	
}
