package day04;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		
		/* ---------menu--------
		 * 1. 저장 2. 출력 3. 종료
		 * ---------------------
		 * 입력: 1 저장되었습니다.
		 * 출력: 2 출력되었습니다.
		 * 종료: 3 종료되었습니다.
		 * */
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 저장 2. 출력 3. 종료");
			num = scan.nextInt();
			switch(num) {
			case 1:
				System.out.println("저장되었습니다.");
				break;
			case 2:
				System.out.println("출력되었습니다.");
				break;
			case 3:
				System.out.println("종료되었습니다.");
				break;
			default:
				System.out.println("잘못된 값입니다.");
				break;
			}
		} while(num != 3);
		System.out.println("종료...");
		scan.close();
		
	}

}
