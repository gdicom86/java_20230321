package day02;

public class for문2 {

	public static void main(String[] args) {
		//2단 출력
		int num = 2;
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
		
		/*1~10까지의 짝수의 합과 홀수의 합을 출력 
		 * */
		int num1 = 0, num2 = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				num2 += i;
			} else {
				num1 += i;
			}
		}
		System.out.println("짝수의 합: " + num2);
		System.out.println("홀수의 합: " + num1);
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + " X " + i + " = " + (j * i) + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
