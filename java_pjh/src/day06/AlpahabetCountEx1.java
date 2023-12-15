package day06;

import java.util.Scanner;

public class AlpahabetCountEx1 {

	public static void main(String[] args) {
		/*
		 * 단어를 입력받아 단어의 각 알파벳이 몇번 나왔는지 출력하는 코드
		 * 입력 : apple
		 * a : 1
		 * e : 1
		 * l : 1
		 * p : 2
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("단어 입력 : ");
		String user = scanner.next();
		char arr[] = new char[26];
		int arr2[] = new int[26];
		char tmp = 'a';
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = tmp;
			tmp++;
		}
		
		for(int i=0; i<user.length(); i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[j] == user.charAt(i)) {
					arr2[j] += 1;
				}
			}
		}
		
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i] != 0) {
				System.out.println(arr[i] + " : " + arr2[i]);
			}
		}
		scanner.close();
	}
}
