package day08;
import java.util.Scanner;
public class 과제 {

	public static void main(String[] args) {
		int[] comNum = new int[3];
		save(comNum);
		int[] myNum = userNum();
		System.out.println();
		print(comNum);
		System.out.println();
		print(myNum);
		check(comNum, myNum);
		

	}
	public static void print(int[] arr) {
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
	}
	public static int random() {
		return (int)(Math.random()*9)+1;
	}
	public static void save(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int r = random();
			if(!isContain(arr, r)) {
				arr[i] = r;
			} else {
				i--;
			}
		}
	}
	public static boolean isContain(int[] arr, int random) {
		for(int tmp : arr) {
			if(tmp == random) {
				return true;
			}
		}
		return false;
	}
	public static int[] userNum() {
		int[] myNum = new int[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("> 숫자 입력(1~9, 숫자 3개): ");
		String myStr = scan.next();
		String[] myNums = myStr.split("");
		for(int i = 0; i < myNum.length; i++) {
			myNum[i] = Integer.parseInt(myNums[i]);
		}
		return myNum;
	}
	public static void check(int[] comNum, int[] myNum) {
		int count = 0;
		while(true) {
			int s = 0, b = 0;
			count++;
			for(int i = 0; i < comNum.length; i++) {	
				for(int j = 0; j < myNum.length; j++) {	
					if(comNum[i] == myNum[j]) { 
						if(i == j) {
							s++;
						}
					} else {
						b++;
					}
				}
			}		
			if(s == 3) {
				System.out.println("정답" + count + "번 만에 맞춤");
				break;
			}
			System.out.println(">" +s+"S " +b+"B");
			userNum();
		}
	}
}
