package day07;
import java.util.Scanner;
public class Method08 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		/* 배열이 주어졌을 때, 배열을 출력하는 메서드 생성
		 * */
		int[] arr = new int[] {1,3,8,4,2,9,7,11,15,10,13,14,17,23,12};
		printArray(arr);
		sortArray(arr);
		System.out.println();
		System.out.println("===정렬 후===");
		printArray(arr);
		System.out.println();
		System.out.println("배열의 사이즈를 입력해주세요: ");
		int size = scan.nextInt();
		int newArr[] = randomArray(size); //배열을 리턴 (new);
		//System.out.println(newArr); 객체의 주소
		sortArray(newArr);
		printArray(newArr);
	}
	/* 기능: 주어진 정수 배열을 콘솔에 출력하는 매서드
	 * 매개변수: 정수배열 -> int arr[]
	 * 리턴타입: void
	 * 메서드명: printArray()
	 * 옆으로 출력 5개씩 한줄에 나열
	 * */
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i%5 == 0 && i != 0) {
				System.out.println();
			}
			System.out.printf("%3d",arr[i]);
		}
	}
	
	/* 기능: 주어진 정수 배열을 정렬하는 기능
	 * 매개변수: 정수배열 -> int[]
	 * 리턴타입: void (메서드내에서 값을 만들어 낼 때 return;)
	 * 매서드명: sortArray
	 * 
	 * */
	public static void sortArray(int[] arr) {
		int tmp = 0;
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) { //오름차순
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
//				tmp = Math.max(arr[i], arr[j]);
//				arr[i] = Math.min(arr[i], arr[j]);
//				arr[j] = tmp;
			}
		}
	}
	/* 새로운 배열을 만들어서 랜덤수를 채워 리턴하는 매서드
	 * 랜덤수 범위는 1~100
	 * 매개변수: 사이즈를 매개변수로 받음 -> int size
	 * 리턴타입: 배열 -> int[]
	 * 매서드명: randomArray
	 * */
	public static int[] randomArray(int size) {
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		return arr;
	}
	
}
