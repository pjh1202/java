package day14;


public class GenericEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array1<Integer> array1 = new Array1<Integer>(5);
		
		for(int i=0; i<5; i++) {
			array1.add(i, i+1);
		}
		for(int i=0; i<5; i++) {
			System.out.print(array1.get(i)+" ");
		}
		System.out.println();
		//Array1에 T extends Number 를 적용하면 Character 클래스는 Number 클래스의 자식 클래스가
		//아니기 때문에 에러 발생 (이런게 있다 정도만 알아두기)
		Array1<Character> array2 = new Array1<Character>(10);
		for(int i=0; i<10; i++) {
			array2.add(i, (char)('a'+i));
		}
		for(int i=0; i<10; i++) {
			System.out.print(array2.get(i)+" ");
		}
	}

}

//배열클래스
class Array1<T>{
	private T [] array;
	public Array1() {
		this(10);
	}
	public Array1(int size) {
		array = (T[])new Object[size];
	}
	//index 번지에 요소를 추가하는 메서드 생성
	public boolean add(int index, T t) {
		if(array.length<=index) {
			return false;
		}
		array[index] = t;
		return true;
	}
	public T get(int index) {
		if(array.length<=index) {
			return null;
		}
		return array[index];
	}
}