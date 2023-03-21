package day04;

import java.util.Scanner;

public class 배열3 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받아서 배열에 저장하고
		 * 그 점수의 합계와 평균을 출력
		 * 합계:
		 * 평균:
		 * */
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int total = 0;
		int max = 0;
		int min = 999;
		for(int i = 0; i < num.length; i++) {
			System.out.println("점수를 입력하세요.");
			num[i] = scan.nextInt();
			total = total + num[i];
			max = Math.max(max, num[i]);
			min = Math.min(min, num[i]);
		}
//		for(int i = 0; i < num.length; i++) {
//			if(min > num[i]) {
//				min = num[i];
//			}
//		}
		
		System.out.println("입력하신 점수의 합계: " + total);
		double avg = (double)total / num.length;
		System.out.println("입력하신 점수의 평균: " + avg);
		scan.close();
		System.out.println("최고 점수는: " + max);
		System.out.println("최저 점수는: " + min);
		//System.out.printf("평균: %f\n", avg);
		//format연습해보기
	}

}
