package day03;

import java.util.Scanner;

public class For문4Break {

	public static void main(String[] args) {
		
		//Break; 반복문을 빠져나오는 역할
		//반복문에서 조건(if)문을 동반하게 된다.
		int i = 1, sum = 0;
		for(; ;) {
			System.out.print(i + " ");
			sum = sum + i;
			if(i == 100) {
				break;
			}
			i++;
		}
		System.out.println();
		System.out.println("1부터 100까지의 합: " + sum);
		
		/*한 글자를 입력받아 그대로 출력
		 * y를 입력받으면 종료
		 * a -> a, b -> b, y -> 종료 
		 * charAt: 지정한 문자의 위치를 추출
		 * */
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter char, If you write y this program will be end");
		//char answer = scan.next().charAt(0);//숫자0은 몇번째 글자를 픽할지 정하는 숫자
		//System.out.println(answer);
		
		for(; ;) {
			System.out.println("Enter char, If you write 'Y or y' this program will be end");
			char answer = scan.next().charAt(0);//숫자0은 몇번째 글자를 픽할지 정하는 숫자
			System.out.println(answer);
			if(answer == 'y' || answer == 'Y') {
				System.out.println("The end");
				break;			
			}
		}
		
		
	}

}
