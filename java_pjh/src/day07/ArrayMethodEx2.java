package day07;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayMethodEx2 {

	public static void main(String[] args) {
		// 1에서 45사이의 중복되지 않은 랜덤한 수 6개를 만드는 코드 작성(메서드 이용해서)	
		//1~45사이의 중복되지 않은 수 6개를 입력하는 코드 작성 scanner
		int arr[] = new int[6];
		Scanner scanner = new Scanner(System.in);
		int min=1,max=45;
		if(createRandomArray(min, max, arr)) {
			System.out.println("배열 생성 성공");
			Arrays.sort(arr);
			for(int i:arr) {
				System.out.print(i+" ");
			}
		}
		else {
			System.out.println("배열 생성 실패");
		}
		
		System.out.print("\n정수 6개 입력 : ");
		int userArr[] = new int[6];
		int count=0;
		while(count<userArr.length) {
			int num = scanner.nextInt();
			if(!contains(userArr, count, num) && (num >= min && num <= max)) {
				userArr[count] = num;
				System.out.println("입력 성공");
				count++;
			}
			else {
				System.out.println("중복된 수 입력");
			}
		}
		System.out.print("입력한 수 : ");
		for(int i:userArr) {
			System.out.print(i+" ");
		}
	}
	
	public static int random(int min, int max) {
		if(max < min) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		return (int)(Math.random()*(max-min+1)+min);
	}
	
	public static boolean contains(int []arr, int n, int num) {
		//배열 생성이 안됐거나 크기가 0이면
		if(arr == null || arr.length==0) {
			return false;
		}
		//배열의 크기보다 비교할 개수가 많으면
		if(arr.length < n) {
			n = arr.length; //비교할 개수를 배열의 크기로 수정
		}
		
		for(int i=0; i<n; i++) {
			//배열의 num과 같은 값이 있으면
			if(arr[i]==num) {
				return true;
			}
		}
		//반복문이 끝날때까지 같은게 없으면
		return false;
	}
	
	public static boolean createRandomArray(int min, int max, int arr[]) {
		if(arr==null||arr.length==0) {
			return false;
		}
		if(max<min) {
			int tmp=min;
			min=max;
			max=tmp;
		}
		if(arr.length > max-min+1) {
			return false;
		}
		int count=0;
		while(count<arr.length) {
			int r = random(min, max);
			if(!contains(arr, count, r)) {
				arr[count] = r;
				count++;
			}
		}
		return true;
	}
}
