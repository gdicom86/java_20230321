package day05;

public class Method01 {

	public static void main(String[] args) { //main은 출력을 위한 클래스
		/* 메서드: 기능 / 함수
		 * 접근제한자: 접근 할 수 있는 주체의 범위 public
		 * 리턴 타입: 메서드의 실행결과로 받을 수 있는 정보의 값(자료형) void
		 * 메서드 명: 메서드 이름(소문자로 시작) main
		 * 매개변수: 메서드를 실행하기 위해서 필요로 하는 값
		 * 메서드 선언 및 구현
		 * 접급 제한자 리턴타입 매서드명(매개변수) {
		 * 기능구현;
		 * }
		 * 메서드를 선언하는 위치
		 * 클래스 안, 메서드 밖
		 * */
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 + num2);
		int total = sum(100, 200);
		System.out.println(total);
	}
	
	//메서드 위치
	/* 기능: 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	 * 리턴 타입: 합을 리턴 => int
	 * 메서드명: sum
	 * 매개변수: 두 정수가 필요 (int num1, int num2)
	 * */
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
}
