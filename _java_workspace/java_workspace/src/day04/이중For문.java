package day04;

public class 이중For문 {

	public static void main(String[] args) {
		
		/* 이중for을 이용하여 다음을 출력
		 * 123
		 * 456
		 * 789
		 * num++(표현->증가), ++num(증가->표현)의 차이 
		 * */
		
		int num = 0;
		for(int i = 1; i <= 3; i++) { //행
			for(int j = 1; j <= 3; j++) { //열
				System.out.print((++num) + " ");
				
			}
			System.out.println();
		}
		//for문을 어떻게 쓸 지 항상 생각하라.
		for(int i = 1; i <= 9; i++) {
			System.out.print(i + " "); //순서를 생각하라.
			if(i % 3 == 0) {
				System.out.println();
			}
		}
		
	}

}
