package day01;

public class if문1 {

	public static void main(String[] args) {
		/* 조건문: 주어진 조건에 맞을 경우 실행문을 처리하는 구문
		 * if/switch문
		 * if문: if, if~else, if~else if
		 * 
		 * if(조건식){
		 * 실행문;
		 * } 실행문이 하나일 경우 {}생략 가능. 
		 * */
		
		int num1 = 1;
		if(num1 == 0) {
			System.out.println("num1의 값은 " + num1 + "입니다.");
		} else {
			System.out.println("num1의 값은 0이 아닙니다." );
		}
		
		/* num1이 양수이면 양수라고 출력 (0을 포함하지 않는 경우)
		 * num1이 0이면 0이라고 출력 아니면 음수라고 출력
		 * */
		num1 = -1;
		if(num1 > 0) {
			System.out.println("num1의 값은 양수입니다.");
		} else if(num1 == 0) {
			System.out.println("num1의 값은 0입니다.");
		} else {
			System.out.println("num1의 값은 음수입니다.");
		}
		
		/* num2가 짝수인지 홀수인지 판별
		 * */
		int num2 = 9;
		if(num2 % 2 == 0) { //(조건식)은 반드시 true or false로 표현되야한다.
			System.out.println(num2 + "는 짝수 입니다.");
		} else {
			System.out.println(num2 + "는 홀수 입니다.");
		}
		
		
		
		
		
	}

}
