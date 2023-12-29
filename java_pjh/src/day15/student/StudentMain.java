package day15.student;

public class StudentMain {
	/* -> 예외처리도 하면 좋음
	 * 학생 국어, 영어, 수학 성적 관리 프로그램 작성
	 *  - Program 인터페이스를 생성하여 활용
	 *     - void run()
	 *     - void printMenu()
	 *     - void runMenu(int menu)
	 *  - Program 인터페이스를 구현한 구현 클래스 StudentProgram 을 생성하여 활용
	 *  - 학생 정보를 Student 클래스를 생성해서 활용
	 *    - 학년, 반, 번호, 이름, 국어, 영어, 수학 <-관리하는 클래스
	 *  - 리스트 활용
	 *  
	 *  - 기능
	 *    - 학생 관리
	 *       - 학생 추가, 수정, 삭제
	 *     - 성적 관리
	 *       - 성적 추가, 수정, 삭제
	 *     - 조회
	 *       -학생조회, 성적조회
	 *          - 학생조회 : 전체, 학년, 반, 학생
	 *          - 성적조회 : 국어, 영어, 수학
	 *             - 학생 : 학년, 반, 번호
	 */
	public static void main(String[] args) {
		StudentProgram stdProgram = new StudentProgram();
		stdProgram.run();
	}
}
