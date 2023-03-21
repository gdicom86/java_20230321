package day05;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		/* 5개 값을 가지는 배열을 생성후
		 * 1~50사이의 랜덤값을 저장 후 풀력
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("사용자의 이름을 입력하세요.");
		String name = scan.next();
		System.out.println("생성할 숫자의 개수를 입력하세요.");
		int size = scan.nextInt();
		int[] arr1 = new int[size];
		int max = 0;
		int min = 999;
		for(int i = 0; i < arr1.length; i++) {
			int num = (int)(Math.random()*50)+1;
			arr1[i] = num;
			System.out.println("생성된 숫자는 " + arr1[i] + "입니다.");
			max = Math.max(max, arr1[i]);
			min = Math.min(min, arr1[i]);
		}
		System.out.println(name + "님 생성된 숫자중 가장 작은 숫자는 " + min);
		System.out.println(name + "님 생성된 숫자중 가장 큰 숫자는 " + max);
		
		
		
	}

}
