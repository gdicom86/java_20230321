package day05;

public class ArrayCopy {

	public static void main(String[] args) {
		
		/* String 배열 생성후 3개의 값을 생성후
		 * 국어, 영어, 수학이라는 글자를 담은 후 출력 
		 * 배열은 길이를 가지고 있다.
		 * 한번 정해진 길이는 이후 추가/삭제 불가
		 * 배열의 길이를 늘리거나, 줄이고 싶을때 배열복사 ArrayCopy를 이용한다.
		 * 
		 * */
		String[] arr = new String[] {"국어", "영어", "수학"};
		for(String tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		//사회, 과학 추가
		String[] arr2 = new String[6];
		System.out.println(arr);
		System.out.println(arr2);
		
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
			
		}
		for(String tmp : arr2) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		//arryCopy를 이용한 방법
		String[] arr3 = new String[arr.length*2]; //기존 배열보다 2배 큰 크기를 가짐
		//System.arraycopy(복사할 배열, 시작번지, 새배열, 시작번지, 개수)
		System.arraycopy(arr, 0, arr3, 1, arr.length);
		for(String tmp : arr3) {
			System.out.print(tmp + " ");
		}
	}

}
