package day05;

public class ArrayInitEx1 {

	public static void main(String[] args) {
		//배열 초기화 예제
		//arr1배열에는 0번지부터 4번지까지 모두 0으로 초기화가 됨
		//char \0, 정수는 0, 실수는 0.0, boolean은 false
		int arr1[] = new int[5];
		
		//arr2는 0번지에 1, 1번지에 2  ~~4번지에 5가 저장
		//총 5의 크기를 가진 배열이 됨
		int arr2[] = new int[] {1,2,3,4,5};
		
		//arr2와 같은 값으로 초기화 됨
		//arr3와 같이 초기화 하는 경우는 배열을 선언과 동시에 초기화 하는 경우에만 가능
		int arr3[] = {1,2,3,4,5};
		//arr[] = {1,2,3,4,5}  <-- 에러발생 동작 안함
		
		//1번째 방법을 가장 많이 사용
		//2 3번째 방법을 통해 초기값이 아닌 다른 값을 초기화하여 사용 가능
	}
}
