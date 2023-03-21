package day08;

public class MethodOverloading {

	public static void main(String[] args) {
		
		/* 메서드 오버로딩(Method Overloading)
		 * 동일한 이름을 가지는 메서드를 여러개 만드는 경우
		 * 1. 매개변수의 개수가 다르면 가능
		 * 2. 메게변수의 종류(자료형)가 다르면 가능
		 * 리턴타입은 상관없음, 매개변수 이름도 상관없음
		 * 
		 * */
		System.out.println(sum(1,2));
		System.out.println(sum(1.2,2.5));
		System.out.println(sum(1,34,4,6,7,3,2,5,3,2,5));
		int[] arr = {345, 32, 42, 675, 22, 43};
		System.out.println(sum(arr));
		/* 가변길이 메서드
		 * 1+2, 1+2+3, 45+78+45+43
		 * 피연산자의 값이 일정하지 않을경우 매개변수의 개수와 상관없이 매개값을 줄 때 사용
		 * */
		
	}
	/* 더하기 하는 메서드 생성
	 * int num1, int num2를 매개변수로 받아 더한 연산 결과를 리턴
	 * 매서드명: sum
	 * */
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static int sum(int ...num) { //가변길이 num은 배열처럼 사용
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum+=num[i];
		}
		return sum;
	}
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}

}
