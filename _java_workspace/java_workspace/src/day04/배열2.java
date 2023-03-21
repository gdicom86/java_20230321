package day04;

public class 배열2 {

	public static void main(String[] args) {
		
		/* 5개 값을 담는 배열을 생성하여 1~5까지의 값을 입력하고 출력
		 * 입출력은 for문으로
		 * 출력 모양 -> 배열이음[번지] = 값
		 * arr[0] = 1;
		 * */
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i ++) { //0~4까지 index 범위
			arr[i] = i + 1;
			System.out.printf("arr[%d]=%d ", i, arr[i]);
			System.out.println();
		}
		/*	10개 값을 갖는 배열을 생성하고 짝수만을 저장하고 출력
		 * */
		System.out.println();
		System.out.println("=============================");
		int[] arr2 = new int[10];
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = (i * 2) + 2;
			System.out.printf("arr[%d]=%d ", i, arr2[i]);
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
	}

}
