package day05;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[] arr = new int[10];
//		char answer = 'n';
//		
//		while(answer == 'n') {
//			System.out.println("");
//			answer
//		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//배열을 섞는 코드 random을 활용하여
//		int a = 10;
//		int b = 20;
//		int c = a;
//		a = b;
//		b = c;
//		System.out.println("a: " + a + ", " + "b: " + b);
		
		//방법: 랜덤한 번지(0~arr.length)를 선택해서 다른 번지와 교환
		int min = 0;
		int max = arr.length; //개수
		
		
		//배열섞기
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random()*max)+min;
			int tmp = arr[i]; //0번지의 값이 tmp로 이동
			arr[i] = arr[random];
			arr[random] = tmp;
		}
		System.out.println("=======섞은 후========");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("=======오름차순 정렬========");
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("=======랜덤숫자 정렬========");
		
		int[] arr3 = new int[5];
		for(int i  = 0; i < arr3.length; i++) {
			arr3[i] = (int)(Math.random()*50)+1;
		}
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		for(int i = 0; i < arr3.length; i++) { // 0 1
			for(int j = i+1; j < arr3.length; j++) { // 1~ 2~
				if(arr3[i] > arr3[j]) {
					int tmp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = tmp;
				}
			}
		}
		System.out.println();
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		//향상된 for문
		for(int tmp : arr3) {
			System.out.print(tmp + " ");
		}
		
	}

}
