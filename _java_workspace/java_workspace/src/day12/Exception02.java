package day12;

public class Exception02 {

	public static void main(String[] args) {
		// num1, num2, 연산자 입력하여 메서드 입력
		//예외처리
//		Calc cplus = new Calc(3, 0, '+');
//		Calc cminus = new Calc(1, 1, '-');
//		Calc cmul = new Calc(10, 1, '*');
//		Calc cdiv = new Calc(1, 0, '/');
		try {
			//예외발생 가능성이 있는 구문
			System.out.println(calc(4, 0, '+'));
			System.out.println(calc(4, 0, '&'));
			System.out.println(calc(4, 0, '-'));
			System.out.println(calc(4, 0, '*'));
			System.out.println(calc(4, 0, '/'));
			System.out.println(calc(4, 0, '%'));
		} catch(Exception e) {
			//예외처리에 필요한 문구
			System.out.println(e.getMessage());
			//e.printStackTrace();
			
		}
		System.out.println("계산기 종료");
	}
	//기능: 두 수를 입력받고, 연산자를 입력받아 4칙연산의 결과를 리턴하는 메서드 생성
	//throw를 발생시키게 되면 예외를 메서드를 호출하는 객체에게 넘기는 현상이 발생됨.
	//throw를 발생시키면 메서드 선언부 끝에 throw 발생할 수 있는 예외를 반드시 적어야 함.
	//throw RumtimeException의 경우 생략가능
	public static double calc(int num1, int num2, char op) throws RuntimeException{
		double res = 0;
		//예외처리는 앞에서 미리 해주는게 좋음
		if((op == '/' || op == '%') && num2 == 0) {
			throw new RuntimeException("num2는 0이 될 수 없습니다.");
		}
		switch(op) {
		case '+': res = num1 + num2; break;
		case '-': res = num1 - num2; break;
		case '*': res = num1 * num2; break;
		case '/': res = num1 / num2; break;
		case '%': res = num1 % num2; break;
		default: 
			throw new RuntimeException(op + "는 산술연산자가 될 수 없습니다.");
		}
		return res;
	}
}
//class Calc {
//	public Calc(int num1, int num2, char ch) {
//		try{
//			switch(ch) {
//			case '+':
//				System.out.println("결과값은: " + (num1 + num2));
//				break;
//			case '-':
//				System.out.println("결과값은: " + (num1 - num2));
//				break;
//			case '*':
//				System.out.println("결과값은: " + (num1 * num2));
//				break;
//			case '/':
//				System.out.println("결과값은: " + (num1 / num2));
//				break;
//			}
//		}catch(Exception e) {
//			System.out.println("0으로 나누었습니다.");
//		}
//		System.out.println("종료!");
//	}
//}