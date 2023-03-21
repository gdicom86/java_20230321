package day03;

public class 이중For문 {

	public static void main(String[] args) {
		/* for(초기화; 조건식; 증감식) {
		 * 		실행문;
		 * 		for(초기화; 조건식; 증감식) {
		 * 			실행문;
		 * 		}
		 * }
		 * */
		for(int i = 1; i <= 5; i++) { // 행
			for(int j = 1; j <= 5; j++) { //열
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		for(int i = 1; i <=5; i++) {
			for(int j= 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		for(int i = 1; i <= 5; i++) {
			for(int k = 1; k <= 5-i; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		/* if 
		 * 
		 * */
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(j <= 5-i) { //j=1 i=123
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		

	}

}
