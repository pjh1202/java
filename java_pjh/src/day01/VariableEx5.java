package day01;

import java.util.Scanner;

public class VariableEx5 {

	public static void main(String[] args) {
		String str1 = null;
		str1 = "가나다";
		System.out.println(str1);
		//기본형 변수에는 null 저장 불가능
		//참조형 변수 str은 가능
		
		String str2 = "hello";
		System.out.println(str2);
		
		
		String str3 = " "; // 빈 문자열 저장 가능
		System.out.println(str3);
		
		String str4 = " " + "A";
		System.out.println(str4);
		
	}
}
