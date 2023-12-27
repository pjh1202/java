package day13;

import java.util.Calendar;

public class CalendarEx1 {
	public static void main(String[] args) {
		//캘린터 예제
		//년 월 일을 하나씩 추출해서 사용해야 할 때 사용
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		System.out.println(year+"년");
		int month = cal.get(cal.MONTH)+1; //월만 +1 해줘야 함
		System.out.println(month);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
	}
}
