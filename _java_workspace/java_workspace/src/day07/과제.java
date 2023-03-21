package day07;
import java.util.Scanner;
public class 과제 {

	public static void main(String[] args) {
		int[] comArr = new int[3];
		int[] userArr = new int[3];
		System.out.println("야구 게임 시작!!");
		saved(comArr);
		userNum(userArr);
		System.out.println("유저의 3자리 번호");
		print(userArr);
		check(userArr, comArr);
		
		/* 야구 게임
		 * 컴퓨터가 3자리의 숫자를 배열로 생성 -> 중복 제거
		 * 유저가 3자리의 숫자를 맞추는 게임
		 * 3 5 7
		 * 3 4 6
		 * 1s
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball, 아무것도 안맞으면 out
		 * 
		 * 3 5 7
		 * 3 7 8
		 * 1s 1b
		 * 
		 * 3 5 7
		 * 6 8 1
		 * out
		 * 야구게임 시작
		 * 컴퓨터가 숫자를 정했습니다.
		 * 숫자를 입력하세요 1~9 3자리
		 * 3s 종료. 게임 횟수출력도 같이
		 * */
	}
	public static int random() {
		return (int)(Math.random()*9)+1;
	}
	public static void saved(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int r = random();
			if(!isContain(arr, r)) {
				arr[i] = r;
			} else {i--;}
		}
		//int i = 0;
		//while(i < arr.length) {
		//	int r = random();
		//	if(!isContain(arr,r)) {
		//	arr[i] = r;
		//	i++;
		//	}
		//}
	}
	
	public static void userNum(int[] arr) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 1~9 3자리");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
	}
	public static void print(int[] arr) {
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
	}
	
	public static boolean isContain(int[] arr, int num) {
		for(int tmp : arr) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
	}
	
	public static void check(int[] arr, int[] arr1) {
		int cnt = 0;
		while(true) {
			int s = 0, b = 0;
			cnt++;
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr1.length; j++) {
					if(arr[i] == arr1[j]) {
						if(i == j) s++;
						else b++;
					}
				}
			}
			
			if(s == 3) {
				System.out.println(cnt + "번 만에 맞추셨습니다.");
				break;
			}
			if(s == 0 && b == 0) {
				System.out.println("OUT!");
			} else {
				System.out.println(">" +s+"S " +b+"B");
			}
			System.out.println("스트라이크 개수" + s);
			System.out.println("볼 개수" + b);
			userNum(arr);
		}
	}
	
}
