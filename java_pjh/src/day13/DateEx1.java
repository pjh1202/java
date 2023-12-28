package day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) throws ParseException {
		// 날씨 예제
		
		Date date = new Date();
		System.out.println(date);
		
		//Date => String
		/* 화면에 보여줄 시간 패턴을 문자열로 지정 
		 * yyyy : 년 
		 * MM : 월
		 * dd : 일
		 * hh : 12시로 나옴, HH : 24시로 나옴
		 * mm : 분
		 * ss : 초
		 * 기본적으로 소문자이지만 월만 분과 구분하기 위해 대문자
		 * */
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		String str = format.format(date);
		System.out.println(str);
		
		//String => Date
		Date date2 = format.parse(str); 
		System.out.println(date2);
		
	}
}
//ex) 게시글을 만들때와 같이 작성일을 사용하려 할 때 많이 사용
//그냥 날짜를 저장해서 관리할 땐 Date, 월이나 시,분,초등 다양한 값을 가져와야 할 땐 Calendar