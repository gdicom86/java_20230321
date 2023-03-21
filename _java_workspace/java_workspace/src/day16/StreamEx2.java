package day16;

import java.util.Arrays;

public class StreamEx2 {

	public static void main(String[] args) {
		/* 배열에서 짝수만 출력(정렬)
		 * 중복되는 값은 삭제
		 * */
		int[] arr = {4,6,3,7,4,5,7,1,5,2,6,3,7};
		Arrays.stream(arr).filter(n->n%2==0).sorted().distinct().forEach(System.out::println);
		
		int[] res = Arrays.stream(arr).filter(n->n%2==0).distinct().sorted().toArray();
		System.out.println("----");
		for(int tmp : res) {
			System.out.print(tmp + " ");
		}
		
	}

}
