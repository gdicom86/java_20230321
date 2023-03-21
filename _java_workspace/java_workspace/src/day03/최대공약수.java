package day03;

public class 최대공약수 {

	public static void main(String[] args) {
		/*최대 공약수 구하기
		 * 공약수: 두수의 공통된 약수
		 * 최대 공약수: 두 수의 공통된 약수중 가장 큰 값
		 * 
		 * 8: 1 2 4 8
		 * 12: 1 2 4 6 12
		 * 공약수: 1 2 4
		 * 최대 공약수: 4
		 * */
		int num1 = 8, num2 = 12;
		int gcd = 0;
		for(int i = num1; i >= 0; i--) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i; //이렇게 하면 지역 변수로 마지막에 담기는 수만 나타낼수있다.
				break;
			}
		}
		System.out.print("최대 공약수: " + gcd);
		
		/* 반복 회수: num1부터 1씩 감소
		 * 조건이 맞다면 break;
		 * */
		
	}

}
