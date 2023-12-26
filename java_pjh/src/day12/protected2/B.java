package day12.protected2;

import day12.protected1.A;

public class B extends A {
	
	public void print() {
		//System.out.println(num1); private 자식 클래스에서도 접근 X
		//System.out.println(num2); default 다른 패키지에 있는 클래스에서는 접근 X
		System.out.println(num3); //protected 다른 패키지와 상관없이 자식 클래스에서 접근 O
		//만약 다른 패키지인데 자식클래스가 아니라면 접근 X
		System.out.println(num4); //public 접근 가능
	}
	
}
