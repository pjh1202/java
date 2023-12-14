package day05;

public class ArrayCopyEx1 {
	public static void main(String[] args) {
		int arr1 [] = new int[] {1,2,3,4,5};
		int arr2 [] = arr1; 
		//배열이 복사가 된게 아니고 같은 배열을 참조한 것 배열을 공유하게 됨. 복사가 아닌 공유
		int arr4 [] = new int[arr1.length];
		
		arr1[0] = 10; //arr1 배열의 값을 바꾸어도 arr2의 배열의 값 또한 바뀜
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr2[i]);
		}
		
		int arr3 [] = new int[arr1.length];
		//반복문을 이용하여 arr1에 있는 값들을 arr3에 복사
		
		//(복사할 배열, 복사할 번지, 복사될 배열, 복사될 배열에서 몇 번지부터 넣을지, 복사될 갯수)
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		System.out.println("arr4확인");
		for(int k=0; k<arr4.length; k++) {		
			System.out.print(arr4[k] + " ");
		}
		
		int arr5 [] = new int[arr1.length];
		System.arraycopy(arr1, 1, arr5, 0, 2);//arr1배열의 1번지부터 2개를 복사하여 arr5배열에 덮어씀
		System.out.println();
		System.out.println("arr5 확인");
		for(int k=0; k<arr5.length; k++) {		
			System.out.print(arr5[k] + " ");
		}
		
	}
}
