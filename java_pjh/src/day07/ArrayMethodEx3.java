package day07;

public class ArrayMethodEx3 {

	public static void main(String[] args) {
		int arr1[] = new int[5];
		initArray1(arr1);
		printArray(arr1);
		
		int arr2[] = new int[5];
		initArray2(arr2);
		printArray(arr2);
		
		int arr3[] = initArray3(5);
		printArray(arr3);
	}
	
	public static void printArray(int arr[]) {
		for(int tmp:arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
	}

	/*
	 * 기능 : 배열에 1부터 순차적으로 저장하는 메서드(잘못된 메서드)
	 * 매개변수 : 정수배열 => int arr[]
	 * 리턴타입 :  void
	 * 메서드명 : initArray1
	 */
	
	public static void initArray1(int arr[]) { //참조변수라도 새로 초기화를 하면 원본 값은 바뀌지 않음
		arr = new int [10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
	}
	
	/*
	 * 기능 : 배열에 1부터 순차적으로 저장하는 메서드(올바른 메서드)
	 * 매개변수 : 정수배열 => int arr[]
	 * 리턴타입 :  void
	 * 메서드명 : initArray2
	 */
	
	public static void initArray2(int arr[]) { 
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
	}
	
	/*
	 * 기능 : 정수가 주어지면 정수 크기의 배열을 생성하고 배열에 1부터 순차적으로 저장하여 
	 *       만들어진 배열을 알려주는 메서드(다른 메서드)
	 * 매개변수 : 정수배열 => int length
	 * 리턴타입 :  생성된 배열 => int []
	 * 메서드명 : initArray3
	 */
	
	public static int[] initArray3(int length) {
		int arr[] = new int[length];
		for (int i=0; i<length; i++) {
			arr[i] = i+1;
		}
		return arr;
	}
}