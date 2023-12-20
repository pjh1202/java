package day08;

import java.util.Scanner;

public class Student {
	int kor, eng, math, grade, classNum, num;
	String name;
	
	public void printInfo() {
		System.out.println("--------------");
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + classNum);
		System.out.println("번호 : " + num);
		System.out.println("이름 : " + name);	
	}
	public void setKor(int korScore) {
		kor = korScore;
	}
	public void seteng(int engScore) {
		eng = engScore;
	}
	public void setMath(int mathScore) {
		math = mathScore;
	}
	
	public void printScore() {
		printInfo();
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
	}

}
