package day04;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		
		/* 1~50사이의 랜덤수 하나를 생성하세요.
		 * 맞추는 게임 컴퓨터가 랜덤수를 생성했습니다.
		 * */
		int answer = 0, count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("컴퓨터가 1~50사이의 수를 생성했습니다.");
		int realAnswer = (int)(Math.random()*50)+1;
		while(answer != realAnswer) {
			System.out.println("1~50사이의 수를 입력하세요.");
			answer = scan.nextInt();
			count++;
			if(answer < realAnswer) {
				System.out.println("Need to Up!");
			} else if(answer > realAnswer){
				System.out.println("Need to Down!");
			} else {
				System.out.println("맞추셨습니다.");
			}
			if(count > 4) {
				System.out.println("기회를 모두 소진하셨습니다. 정답은" + realAnswer + "이였습니다.");
				break;
			}
		}
		System.out.println("게임 횟수: " + count);
		scan.close();
	}

}
