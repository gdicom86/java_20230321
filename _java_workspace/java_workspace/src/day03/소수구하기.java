package day03;
import java.util.Scanner;

public class 소수구하기 {

	public static void main(String[] args) {
		
		/* 소수: 약수가 1과 자기자신의 수만 가지는 수를 소수
		 * 소수: 3, 5, 7, 11, 13
		 * 소수는 약수가 2개인 수(1과 나 자신)
		 * num 입력받아서 입력받은 넘버가 소수인지 아닌지 판별
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		int count = 0; 
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) { //약수를 찾아주는 로직
				count = count + 1;
		    }
		}	
		if(count == 2) {
			System.out.println("소수다.");		
		} else {
			System.out.println("소수가 아니다.");					
		}
		scan.close();
		//모든 소수를 출력하라.2~100
		int count1 = 0;
		for(int i = 2; i <= 100; i++) {
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count1++;
				}			
			}
			if(count1 == 2) {
				System.out.print(i + " ");
			}
			count1 = 0; 
		}
		
		
			
	}

}
