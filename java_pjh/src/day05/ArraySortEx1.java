package day05;

import java.util.Arrays;

//두 변수의 값을 바꿀 때 a=b b=c c=a 식으로 바꾸기

public class ArraySortEx1 {

	public static void main(String[] args) {
		// 배열 정렬
		int arr[] = new int[] {1,3,5,7,2,4,6,8};
		
		/*버블정렬
		 옆의 인접한 값들을 비교하여 정렬
		 1 3 5 7 2 4 6 8  *오름차순 기준
		 1과3비교 1이 작으므로 1이 앞 3이 뒤
		 3과 5비교 3이 작으므로 3이 뒤 ~~
		 한번 정렬하면 오름차순 기준 가장 큰 수가 결정됨
		 정렬이 끝날 때까지 계속 반복
		*/
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) { //부등호 바꾸면 차순 바뀜
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int arr2[] = {1,3,5,7,9,2,4,6,8};
		Arrays.sort(arr2); //오름차순 정렬
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
