package day01;

public class 연산자 {

	private static int avg;

	public static void main(String[] args) {
		
		/*대입 연산자: = 을 기준으로 오른쪽에 있는 값을 왼쪽에 저장한다.
		 * a = b 
		 * b의 값을 a에 저장(대입)하라. 
		 * a는 반드시 변수여야 한다.
		 * 
		 * */
		int a = 10;
		int b = 20;
		a = 30; //기존 a값은 사라짐
		b = b + 10;
		System.out.println("a: " + a + ", " + "b: " + b);
		//b + 30 = a; error occur
		
		//산술 연산자: + - * / %
		System.out.println(4+3);
		System.out.println(4-3);
		System.out.println(4*3);
		System.out.println(1.2 + 3.4);
		System.out.println(1.2 - 3.4);
		System.out.println(1.2 * 3.4);
		
		/* 나누기
		 * 정수 / 정수 = 정수 (소수점을 버린다.)
		 * 정수 / 실수 = 실수
		 * 실수 / 실수 = 실수
		 * */
		System.out.println((double)3 / 2);
		System.out.println(3 / 2.0);
		System.out.println(3.0 / 2);
		
		//자료형 정수  -> 실수로 변환하는것을 형변환이라고 한다.
		
		int num1 = 3;
		int num2 = 2;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / (double)num2);
		
		//나머지 연산자 %
		System.out.println(4 % 2);
		System.out.println(44 % 7);
		
		/* 문제 국어 70점, 영어 35점, 수학 97점일 때
		 * 국어 영어 수학 세과목의 합과 평균을 구하여 콘솔에 표시
		 * */
		int korean = 70;
		int english = 35;
		int math = 97;
		int total = korean + english + math;
		double avg = total / 3.0;
		System.out.println("Total is... " + total);
		System.out.println("Avg is...." + avg);
		
		// 나누는 값이 0 이면 예외 발생
		
		// 비교 연산자(true or false로 출력) / 논리 연산자 if문에서 체크
		
		//삼항 연산자 (조건식) ? A : B
		//평균이 80이상이면 합격, 아니면 탈락을 표시
		System.out.println((avg >= 80) ? "합격" : "탈락");
		System.out.println((avg >= 60) ? "합격" : "탈락");
		
		
		
		
	}

}
