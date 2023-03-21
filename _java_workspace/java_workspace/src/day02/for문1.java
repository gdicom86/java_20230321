package day02;

public class for문1 {

	public static void main(String[] args) {
		/*반복문: 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 *종류: for, while, do~while
		 *for(초기화; 조건식; 증감연산식) {
		 *실행문;
		 *}
		 *1. 초기화: 조건식이나, 실행문에서 사용하는 변수를 초기화
		 *처음 한번만 실행(행략 가능
		 *2. 조건식: 반복을 결정하는 식. 참이면 반복 거짓이면 스톱)
		 *(생략가능 -> 생략하면 무조건 true)
		 *3. 증감연산식: 조건식에서 사용되는 변수를 증가/감소 시켜서 반복횟수를 결정
		 * */
		/*1~10까지 출력하는 예제
		 * 초기화: 1부터 시작 (i=1)
		 * 조건식: 10까지 (i<=10)
		 * 증감연산식: 1씩증가 i += 1, i++
		 * 실행문: i를 출력
		 * 반복 종료후 실행문: 없음
		 * */
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		/*지역변수의 사용 범위{선언   소멸}
		 * */
		for(int i = 1; i <= 10; i+=2) { //i = i + a, i += a
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 2; i <= 10; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		/*1~10까지 출력
		 *if문을 사용하라.
		 * */
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			} 
		}
		System.out.println();
		/*1~10까지의 합계
		 * */
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;  
		} 
		
		System.out.println(sum);
		
		
		
	}

}
