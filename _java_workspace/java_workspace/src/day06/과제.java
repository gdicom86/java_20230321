package day06;
import java.util.Scanner;
public class 과제 {
	//멤버변수
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
//		계산기 (+ - */ %) 각각 매서드 만들기
//		매서드에서 바로 출력
//		1.숫자를 입력받는 매서드
//		숫자는 배열로 입력받기
//		2.메뉴 
//		원하는 계산을 선택해주세요
//		1. 덧셈 2. 뺄셈 3. 곱셈 4. 나눗셈 5. 나머지
//		3. main에서 처리되어야 되는 부분
//			1번 메서드 호출 -> 숫자를 배열로 저장
//			2번 메서드 호출 -> 내가 선택한 번호 가져오기
//			switch(2번 return)
//			case에 따라 계산기 호출
		int[] arr = enterNum();
		int menuNum = menu();
		calc(menuNum, arr);
	}
	/* 숫자를 배열로 입력받는 메서드
	 * 매개변수: X
	 * 리턴타입: 배열 -> int[]
	 * 메서드명: enterNum()
	 * */
	public static int[] enterNum() {
		int[] arr = new int[2];
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+1 + "번째 숫자 입력해주세요: ");
			arr[i] = scan.nextInt();
		}
		return arr;
	}
	/* 메뉴를 나타내는 메서드
	 * 매개변수: X
	 * 리턴타입: 메뉴에서 선택한 값 -> int
	 * 메서드명: menu()
	 * */
	public static int menu() {
		System.out.println("메뉴를 선택해 주세요: ");
		System.out.println("1. 덧셈 2. 뺄셈 3. 곱셈 4. 나눗셈 5. 나머지");
		int num = scan.nextInt();
		return num;
	}
	/* 각 기능(+ - *...)에 대한 출력 메서드
	 * 리턴: void
	 * 매개변수: 배열
	 * */
	public static void calc(int menuNum, int[] arr) {
		switch(menuNum) {
		case 1:
			System.out.println(arr[0] + " + " + arr[1] + " = " + (arr[0]+arr[1]));
			break;
		case 2:
			System.out.println(arr[0] + " - " + arr[1] + " = " + (arr[0]-arr[1]));
			break;
		case 3:
			System.out.println(arr[0] + " x " + arr[1] + " = " + (arr[0]*arr[1]));
			break;
		case 4:
			System.out.println(arr[0] + " / " + arr[1] + " = " + ((double)arr[0]/arr[1]));
			break;
		case 5:
			System.out.println(arr[0] + " % " + arr[1] + " = " + (arr[0]%arr[1]));
			break;
		default:
			System.out.println("연산을 잘못 선택");
		}
	}
}
