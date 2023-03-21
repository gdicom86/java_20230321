package day02;

public class Switch문2 {

	public static void main(String[] args) {
		/* 주사위의 값을 출력하는 예제
		 * 1~6까지 랜덤으로 결정
		 * */
		int num = (int)(Math.random()*13)-6;
		if(num < 0) {
			System.out.println(Math.abs(num) + "만큼 후진합니다.");
		} else if(num == 0) {
			System.out.println("제자리");
		} else {
			System.out.println(num + "만큼 전진합니다.");
		}
		

	}

}
