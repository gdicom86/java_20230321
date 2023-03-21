package day03;

public class Continue문 {

	public static void main(String[] args) {
		
		//continue: pass, 조건이 맞다면 pass
		//1~10까지 출력
		for(int i =1; i <= 10; i++) {
			if(i ==5) {
				continue;
			}
			System.out.print(i + " ");		
		}
		System.out.println();
		//홀수면 pass해라
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.print(i + " ");	
		}

	}

}
