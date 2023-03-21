package day06;
import java.util.Scanner;
public class Method07 {

	public static void main(String[] args) {
		
		/* 숫자와 기호를 주고 시호를 숫자만큼 출력하는 메서드
		 * ex) 3, * -> ***
		 * ex) 5, 0 -> 00000
		 * ex) 7, ☆ -> ☆☆☆☆☆☆☆
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("기호를 입력하세요: ");
		char ch = scan.next().charAt(0);
		System.out.println("기호를 반복할 숫자를 적어주세요: ");
		int num = scan.nextInt();
		copy(num, ch);
		scan.close();
	}
	public static void copy(int num, char ch) {
		for(int i = 1; i <= num; i++) {
			System.out.print(ch + " ");
		}
	}
}
