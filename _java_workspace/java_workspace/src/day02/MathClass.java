package day02;

public class MathClass {

	public static void main(String[] args) {
		/* Math.method
		 * 수학적 기능을 하기위한 클래스
		 * 반올림, 올림, 버림, max, min, random
		 * 
		 * */
		
		double num1 = 5.123456;
		//반올림 Math.round
		System.out.println(Math.round(num1)); 
		//올림 Math.ceil, 버림 Math.floor
		System.out.println(Math.ceil(num1));
		System.out.println(Math.floor(num1));
		
		//Math.max Math.min
		System.out.println(Math.max(5, num1));
		System.out.println(Math.min(5, num1));
		
		//절대값 Math.abs
		System.out.println(Math.abs(-5));
		
		//Math.pow 제곱, Math.sqrt 제곱근, Math.random 랜덤
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.random());
		
		//1~10까지의 랜덤 값
		int random = (int)(Math.random()*10);// 0~9
		int random1 = (int)(Math.random()*10)+1;// 1~10
		//(int)(Math.random()*개수)+start num
		System.out.println(random);
		System.out.println(random1);
		
	}

}
