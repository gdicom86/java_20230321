package day06;
import java.util.Scanner;
public class Method04 {

	public static void main(String[] args) {
		/* 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드 -> 배열 리턴
		 * 2. 정수 배열을 전달받아서 평균 연산하는 메서드 -> double평균을 리턴
		 * 3. 정수 5개와 평균을 출력하는 매서드
		 * 4. main에서 연산식이 있으면 안됨
		 * 5. 메서드간의 데이터 전달및 호출만 있어야 된다
		 * 리턴타입: 무엇으로 보낼것인가? , 매개변수: 항상 생각
		 * 랜덤(1~100) 정수 5개를 배열에 담는 메서드
		 * 리턴타입: 정수 배열 -> int[], double, void
		 * 매개변수: x, int[] arr, (int[] arr, double avg)
		 * 매서드명: ranNum, avg, print
		 * */
		int[] arr = ranNum();
		double avg = avg(arr);
		printer(arr, avg);
		
		//printer(arr, avg(arr));
		
		
	}
	public static int[] ranNum() {
		int[] nums = new int[5];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*100)+1;
		}
		return nums; //변수명만 리턴하면 된다.
	}
	public static double avg(int[] arr) {
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}
		return (double)total / arr.length;
	}
	public static void printer(int[] arr, double avg) {
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		System.out.println("평균: " + avg);
	}
}
