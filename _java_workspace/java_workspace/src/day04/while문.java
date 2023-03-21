package day04;

public class while문 {

	public static void main(String[] args) {
		
		/* while(조건식) {
		 * 실행문; //조건식이 false가 될 수 있는 구문을 포함해야 됨.
		 * 증감식;
		 * }
		 * 
		 * 초기화
		 * while(조건식) {
		 * 실행문;
		 * 증감식;
		 * }
		 * */
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}

		System.out.println("While문 활용");
		int i = 1;
		while(i <= 10) {
			//실행문
			System.out.print(i + " ");
			//증감식
			i++;
		} 
		
		System.out.println("while문을 이용해서 짝수 출력");
		
		//while문을 이용해서 짝수 출력
		
		int j = 1;
		while(j <= 10) {
			if(j % 2 == 0) {
				System.out.print(j + " ");
			}
			j++;
		}
		
		System.out.println("while문을 이용해서 짝수 출력");
		
		int k = 0;
		while(k <= 10) {
			k++;
			if(k % 2 == 1) {
				continue; // continue를 쓰면 하단부는 실행되지 않는다.
			} else {
				System.out.print(k + " ");
			}
			
		}
		
	}

}
