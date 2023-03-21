package day04;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		/* for, while문은 조건식이 한번도 실행 안될 수 있다.
		 * do{
		 * 실행문;
		 * } while(조건문); //조건 필수
		 * 
		 * 값을 입력하면 그대로 출력하는 구문
		 * 단, y or Y가 입력되면 종료
		 * */
		
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while(i <= 10);
		
		Scanner scan = new Scanner(System.in);
		
		
		String str; 
		do {
			System.out.println("문자를 입력하세요 y를 입력하면 프로그램을 종료합니다.");
			str = scan.next();
			System.out.println("입력하신 문자는" + str + "입니다.");
			
		} while(!str.equals("y") && !str.equals("Y"));
		
		scan.close();
		
	}

}
