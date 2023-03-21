package day06;

public class Method02 {

	public static void main(String[] args) {
		
		/* Method: 매서드 -> 기능 함수
		 * - 접근 제한자: 접근 할 수 있는 주체의 제한범위
		 * - 리턴 타입: 매서드를 실행 후 결과로 얻을 수있는 있는 값(자료형으로 표현)
		 * - 메서드명: 매서드를 구분하는 명, 소문자로 시작, 카멜 표기법
		 * - 매개변수: 기능을 수행하귀 위해 필요로 하는 정보값
		 * - void: 반환할 값이 없을 경우
		 * 
		 * 접근제한자 리턴타입 매서드명(매개변수) {
		 * 기능 구현;
		 * 리턴 타입이 있을 경우: (void가 아닌경우) 반드시 return을 포함해야 됨.
		 * }
		 * 
		 * 메서드가 위치 클래스 안쪽, 다른 메서드 밖
		 * */
		int total = sum(100, 200);
		System.out.println(total);
		
		sumPrint(100, 300);
		sumPrint(total, 300);
		
		int powNum = pow(20, 13);
		System.out.println(powNum);
		
	}
	// 매서드 위치
	/* 기능: 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	 * 리턴타입: int
	 * 매개변수: 두정수 -> int num1, int num2
	 * 메서드명: sum
	 * */
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	/* 기능: 두 정수가 주어지면 두 정수의 합을 출력하는 메서드
	 * 리턴타입: void
	 * 매개변수: 두 정수 -> int num1, int num2
	 * 메서드명: sumPrint
	 * */
	public static void sumPrint(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	/* 기능: 두 정수가 주어지면 두 정수의 곱을 알려주는 매서드
	 * 리턴타입: 곱 -> int
	 * 매개변수: 두 정수 -> int num3, int num4
	 * 메서드명: pow
	 * */
	public static int pow(int num1, int num2) {
		int pow = num1 * num2;
		return pow;
	}
	
	
	
	
}
