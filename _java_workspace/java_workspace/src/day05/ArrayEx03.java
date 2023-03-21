package day05;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		/* 5자리 숫자를 입력받아서 입력받은 숫자를 거꾸로 출력
		 * ex) 11456 => 65411 => 6+5+4+1+1
		 * ex) 19874 => 47891 => 4+7+8+9+1
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("5자리 숫자를 입력하세요.");
		int num = scan.nextInt();
		int arr[] = new int[5];
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = num % 10; //**마지막 자리수 저장
			total = arr[i] + total;
			num = num / 10; //**몫 저장 소수점은 버려짐.
		}
		System.out.println("합계: " + total);
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		scan.close();
		
		//while을 이용
		//스케너 열기 -> 입력받기 -> 배열 선언, total변수 선언
//		while(num > 0) {
//			int b = num % 10; // 마지막 자리
//			arr[i] = b;
//			sum = sum + b;
//			i++;
//			num = num / 10;
//		}
		
	}

}
