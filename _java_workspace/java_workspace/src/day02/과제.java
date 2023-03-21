package day02;

public class 과제 {

	public static void main(String[] args) {
		/*1~100까지 2의배수를 출력
		 * */
		for(int  i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
				if(i % 10 ==0) {
					System.out.println();
				}
			}
			
		}
			
	}

}
