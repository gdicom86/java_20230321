package day03;

import java.util.Scanner;

public class For문3 {

	public static void main(String[] args) {
		
		//1부터 100까지의 합계
		int num = 0;
		for(int i = 1; i <=100; i++) {
			num += i; //누적 내 변수 = 자기자신의 내변수 + 더할 대상 
		}
		System.out.println(num);
		
		/* 약수구하기.
		 * 약수: 나누어서 떨어지는 수의 모임.
		 * 12의 약수: 1, 2, 3, 4, 6, 12
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1 = scan.nextInt();
		
		
		for(int  i = 1; i <=num1; i++) {
			if(num1 % i == 0) { 
				System.out.print(i + " ");
			}
		}

	}

}
