package day06;

public class ArrayExpand1 {

	public static void main(String[] args) {
		// 배열이 꽉 찼을 때 배열을 확장하는 예제
		int arr[] = new int[5];
		int count = 10;
		
		for(int i=0; i<count; i++) {
			if((i+1) > arr.length) {
				int tmp[] = new int[arr.length + 5];
				System.arraycopy(arr, 0, tmp, 0, arr.length);
				arr = tmp;
				/*for(int j:tmp) {
					System.out.print(j+" ");
				}
				*/
			}
			arr[i] = i+1;
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
