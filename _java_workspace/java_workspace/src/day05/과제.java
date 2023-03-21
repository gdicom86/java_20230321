package day05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		
		/* 가위 바위 보 게임 만들기
		 * 컴퓨터가 가위, 바위, 보 중 랜덤으로 선택(0=가위, 1=바위, 2=보)
		 * 내가 가위, 바위, 보 중 선택해서 입력
		 * 승패무의 결과를 출력
		 * 삼항연산자(조건식)? true : false;
		 * */
//		int num = 3;
//		System.out.println((num % 2 == 0)? "짝수" : "홀수");
		
		int comNum = (int)((Math.random()*3));
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(0),  바위(1), 보(2)중 하나의 숫자를 입력해주세요: ");
		int userNum = scan.nextInt();
		System.out.println(comNum + "," + userNum);
		if(comNum == userNum) {
			System.out.println("비겼습니다.");
		} else if(userNum == 0 && comNum == 2) {
			System.out.println("이겼습니다.");
		} else {
			System.out.println((comNum + 1 == userNum)? "이겼습니다." : "졌습니다.");
		}
		//String comStr = (comNum == 0)? "가위" : (comNum == 1)? "바위" : "보";
		//삼항 연산자 이용 방법
//		if(userStr.equals(comStr)) {
//			무승부
//		} else {
//			if(comStr.equals("가위")) {
//				System.out.println(userStr.equals("바위")? "승" : "패");
//			} else if(comStr.equals("바위")) {
//				System.out.println(userStr.equals("보")? "승" : "패");
//			} else {
//				System.out.println(userSre.equals("가위")? "승" : "패");
//			}
//		}
		
		
	}

}
