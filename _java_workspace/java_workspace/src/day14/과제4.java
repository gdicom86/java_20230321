package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class 과제4 {

	public static void main(String[] args) {
		
//		두 배열을 하나로 합치는 ArrayList를 구성
//		arr1 = a,e,f;
//		arr2 = d,b,c;
//
//		list = a,e,f,d,b,c; =>출력
//
//		list를 정렬
//		list = a,b,c,d,e,f; => 출력
//
//		Iterator 사용
//		ex)
		String arr1[] = new String[] {"a","e","f"};
		String arr2[] = new String[] {"d","b","c"};
		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 0; i < arr1.length; i++) {
			list.add(arr1[i]);
		}
		for(int i = 0; i < arr2.length; i++) {
			list.add(arr2[i]);
		}
		System.out.println(list);
		Collections.sort(list);
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp + " ");
		}
		
	}

}
