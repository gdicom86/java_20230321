package day04;

import java.util.Scanner;

public class 배열1 {

	public static void main(String[] args) {
		
		/* 배열:  같은 타입, 같은 의미를 가지는 변수들의 집합 (참조 변수)
		 * 타입[] 배열이름; 선언
		 * 타입 배열이름[];
		 * 선언 & 초기화
		 * 타입[] 배열이름 = new 타입[길이]; //일반적인 방법
		 * 타입[] 배열이름 = new 타입[]{값, 값, 값, 값, 값}
		 * 타입[] 배열이른 = {값, 값, 값, 값, 값} //선언과 동시에 초기화 할때만 가능
		 * 배열의 길이는 0이상이여야한다.
		 * 배열의 시작번지는 0부터이다.
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		String name = scan.next();
		
		String[] str = new String[]{"안녕","하세요","저는",name,"입니다."};
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
		
		System.out.println("========================");
		
		
		int[] arr1 = new int[3];
		int[] arr2 = new int[5]; //초기값 0
		int[] arr3 = new int[] {1,2,3,4,5};
		int[] arr4 = {1,2,3,4,5};
		/* 배열을 사용하는 이유
		 * 반복문을 이용 할 수 있기 때문에 관리가 쉽고 편리함
		 * 배열의 마지막 번지는 총 길이 -1
		 * 배열의 총 길이를 구하는 매서드 .length
		 * */
		System.out.println(arr3);
		System.out.println(arr3[1]);
		
		for(int i  = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		
		System.out.println(arr2[0]);
		arr2[0] = 10;
		System.out.println(arr2[0]);
		arr2[1] = 20;
		System.out.println(arr2[1]);//배열안의 숫자는 반드시 입력하여야 한다.
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = (i*10) + 10;
			System.out.println(arr2[i]);
		}
		
		//arr1[]에 1,2,3을 저장하고 출력하세요.
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] =i + 1;
			System.out.print(arr1[i] + " ");
		}
		
		
	}

}
