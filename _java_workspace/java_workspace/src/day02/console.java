package day02;

public class console {

	public static void main(String[] args) {
		/* System.out.print(); 줄바꿈 x
		 * System.out.println(); 줄바꿈 o
		 * System.out.printf();  
		 * 
		 * 서식지정자를 통해 출력 할 데이터의 서식을 저장 할 수 있음.
		 * %c: 1글자, %s: 문자열, %d: 10진정수 %f: 실수
		 * 
		 * escape sequence
		 * ex) \' \" \n(줄바꿈) \r(캐리지리턴) \t(탭)
		 * */
		
		int num1 = 3;
		int num2 = 5;
		// 3 + 5 = 8
		System.out.println(num1 + num2);
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.printf("%d + %d = %d\n", num1,num2,(num1 + num2));
		
		double num3 = 31;
		double num4 = 4;
		System.out.printf("%.0f / %.0f = %.2f\n", num3,num4,(num3 / num4));
		
	}

}
