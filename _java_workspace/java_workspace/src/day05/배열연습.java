package day05;

import java.util.Scanner;

public class 배열연습 {

	public static void main(String[] args) {
		
		/* 5명의 점수를 입력받아 배열에 저장하고
		 * 점수의 합계 평균 최대 최소값을 출력
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("몇명의 값을 저장할까요? ");
		int people = scan.nextInt();
		String[] str = new String[people];
		int[] arr1 = new int[people];
		int total = 0;
		int max = 0;
		int min = 999;
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("이름을 입력해주세요: ");
			str[i] = scan.next();
			System.out.println(str[i] + "점수를 입력하세요: ");
			arr1[i] = scan.nextInt();
			total = total + arr1[i];
			max = Math.max(max, arr1[i]);
			min = Math.min(min, arr1[i]);
		}
		
		double avg = (double)total / arr1.length;
		System.out.println("합계는: " + total);
		System.out.println("평균은: " + avg);
		System.out.println("최대값은: " + max);
		System.out.println("최소값은: " + min);
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(str[i] + "의 점수는 " + arr1[i] + "입니다.");
		}
		
		scan.close();
	}

}
