package day08;

public class ArgsMethodEx1 {

	public static void main(String[] args) {
		System.out.println(sum(1,2,3));
	}
	
	public static int sum(int ... nums) {
		int sum = 0;
		if(nums.length == 0) {
			return 0;
		}
		for(int num : nums) {
			sum += num;
		}
		return sum;
	}
}
