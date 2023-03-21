package day06;
import java.util.Scanner;
public class Method06 {

	public static void main(String[] args) {
		
		/* 구구단 출력
		 * 구구단 x단을 출력하는 메서드
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단할 숫자를 입력하세요: ");
		int num = sc.nextInt();
		power(num);
		sc.close();
	}
	/* 구구단 출력
	 * 매개변수: 단 => int num
	 * 리턴: void
	 * 메서드명: power
	 * */
	public static void power(int num) {
		for(int i = 1; i <= 9; i++) {
			int power = num * i; 
			System.out.println(num + " x " + i + " = " + power);
		}
	}
}
