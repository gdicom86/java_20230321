package day01;

public class 변수 {

	public static void main(String[] args) { //메인 메서드는 class안에서 동작을 하게 해 준다. 
											 // class > method 상하 관계
		System.out.println("method 내부");
		System.out.println(123);

		//변수 : 리터럴 값을 담는 메모리 공간
		//주석 : 한 줄 주석:코드에 영향을 미치지 않음
		/* 주석입니다
		 * 이렇게
		 * 하면
		 * 여러 줄 가능*/
		//변수 선언 방법
		//변수타입 변수명;
		int num, num2, num3, num4;	//선언 (같은 type일 경우 여러 변수를 동시에 선언)
		num = 123;	//값 지정
		int num1 = 1235; // 선언 후 값 지정
		byte num5;
		char ch1;
		float fl1;
		double dou1;
		boolean bool1;
		// 노란 밑줄 : 경고;
		// 빨간 밑줄 : Error
		
		int appleCount; //변수명은 의미있게 지정
		int applecount; //대소문자 구분 함, 다른 변수
		//int num; //중복 선언 불가능
		System.out.println("Value of num1: " + num1);
		
		//a라는 int 변수를 선언 후 값을 지정하고, a 변수의 값을 출력
		int a;
		a = 7000;
		System.out.println("Value of a: " + a);
		
		//num1 and a변수의 값을 하나의 구문으로 출력
		System.out.println("Value of num1: " + num1 + ", " + "Value of a: " + a);
		
		//문자 
		char ch = '\''; //""문자열 1글자의 문자는 ''
		//역슬래시 \'를 쓰면 '를 표기 할 수 있다.
		//char ch2 = "abc"; // Error occur
		System.out.println("ch: " + ch);
		// general class is 객체를 만들어서 객체로 사용하지만 String은 워낙 자주 사용되니, 
		//자료형처럼 사용한다.
		String str = "abc"; 
		System.out.println("str: " + str);
		
		int b = 10; //10진수의 수 10을 저장
		int c = 010; //8진수의 수 10을 저장 //0~7까지만 사용 8 = 10
		int d = 0x10; //16진수의 수 10을 저장 // 0~ABCDEF 16 = 10
		
		//int e = 2093832198520935823095823908209; //int 영역의 범위를 넘어 감.
		long e = 33098320984209333L; // L은 대소문자 상관 없음(구분을 위해 대문자 L)
		
		//기본 실수형은 double로 인식
		//float형의 실수 값은 접미사 f F를 입력 해야 됨
		float f = 292.2444f;
		
		bool1 = true;
		boolean bool2 = false;
		
		int kor = 100;
		int kor1 = kor;
		// =의 의미는 오른쪽의 값(값을 가지고 있는 값, 상수)을 왼쪽(반드시 변수)에 담아라(대입)
		
		int g = 10, h = 20, y = 50;
		//int k, z = 10 //k는 값이 없고, z는 10이 된다.
		
		
		
		
		
		
		
		
	}
	
}
