package day02;

public class Switch문3 {

	public static void main(String[] args) {
		/*1~12월까지 random으로 생성
		 * */
		
		int month = (int)(Math.random()*12)+1;
		
		if(month >= 3 && month <= 5) {
			System.out.println(month + "월은 봄");
		} else if(month >= 6 && month <= 8) {
			System.out.println(month + "월은 여름");
		} else if(month >= 9 && month <= 11) {
			System.out.println(month + "월은 가을");
		} else if(month == 12 || month == 1 || month == 2){
			System.out.println(month + "월은 겨울");
		}
		
		//ex) case 사용 예제
		
		/*switch(month) {
		 * case 1: case 2: case 3:
		 * 실행문;
		 * break;
		 * case 4: case 5: case 6:
		 * 실행문;
		 * break;
		 * }
		 * */
		
	}

}
