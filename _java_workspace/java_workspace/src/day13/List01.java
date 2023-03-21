package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		
		/* 하루 일과를 저장하는 list 생성
		 * */
		String a = "가나다";
		String b = "가나다";
		System.out.println(a == "가나다");
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("잠");
		list.add("기상");
		list.add("공부");
		list.add("운동");
		list.add("샤워");
		list.add("공부");
		//length를 size로 이용하여 출력가능 list.size
		//향상된 for문으로도 출력가능
		Iterator<String> it = list.iterator();
		while(it.hasNext()) { //다음 값을 가지고 있으면 while
			String tmp = it.next(); //다음으로 올 것을 임시 저장
			System.out.print(tmp + " ");
		}
		System.out.println();
		Collections.sort(list);
		System.out.println(list);
		
		
		list.sort(new Test());
		System.out.println(list);
	}

}

class Test implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		//compareTo 메서드 활용
		return o2.compareTo(o1);
	}
	
}




