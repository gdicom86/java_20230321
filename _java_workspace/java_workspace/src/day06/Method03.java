package day06;
import java.util.Scanner;
public class Method03 {

	public static void main(String[] args) {
		
		/* 메서드를 활용하여 계산기를 작성
		 * + - * / %를 작성하여 출력
		 * 두수를 입력받아서 연산. 연산자를 입력 받아 매서드를 활용하여 연산
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기 5. 나머지 숫자를 선택하세요.");
		int menuNum = scan.nextInt();
		System.out.println("첫번째 정수를 입력해주세요: ");
		int num1 = scan.nextInt();
		System.out.println("두번째 정수를 입력해주세요: ");
		int num2 = scan.nextInt();
		switch(menuNum) {
		case 1:
			System.out.println(num1 + "과" + num2 + "의 합은 : " + sum(num1, num2));
			break;
		case 2:
			System.out.println(num1 + "과" + num2 + "의 뺀 값은 : " + minus(num1, num2));
			break;
		case 3:
			System.out.println(num1 + "과" + num2 + "의 곱한 값은 : " + mul(num1, num2));
			break;
		case 4:
			System.out.println(num1 + "과" + num2 + "의 나눈 값은 : " + div(num1, num2));
			break;
		case 5:
			//%리턴을 배열로 리턴: 몫, 나머지 double로 리턴
			//해당 배열의 0번지 /의 값 1번지 나머지 리턴
			double arr[] = remind(num1, num2);
			System.out.println("몫은" + arr[0] + "나머지는" + arr[1]);
			break;
		default:
			System.out.println("잘못 입력하였습니다.");
		//다른 클래스에서 만든 메서드 사용법
			
		Method02 m2 =new Method02();
		m2.sumPrint(num1, num2);
		}

	}
	public static int sum(int num1, int num2) { //매개변수로 연산자를 받을 수도 있다.
		return num1 + num2;
	}
	public static int minus(int num1, int num2) { //매개변수의 순서는 지켜야 된다.
		return num1 - num2;
	}
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	public static double div(int num1, int num2) {
		return (double)num1 / num2;
	}
	public static double[] remind(int num1, int num2) {
		double[] arr = new double[2];
		arr[0] = (double)num1 / num2;
		arr[1] = num1 % num2;
		return arr; //변수명를 리턴(더블배열)
	/* 두 정수를 입력받아 두 정수를 나눈 몫과 나머지를 double[] 배열로 리턴
	 * 리턴타입: int num1, num2
	 * 매개변수:
	 * 변수명: remind
	 * */
	}
}
