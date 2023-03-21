package day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		
		/* 컬렉션 프레임 워크: 표준화된 방식의 자료구조
		 * List, Set, Map
		 * 데이터를 묶어서 관리할 때 사용
		 * 주로 배열대신 사용
		 * 
		 * List: 배열과 동일
		 * - 값을 하나씩 저장
		 * - 순서를 보장
		 * - 중복을 허용
		 * - 배열 대신 가장 많이 사용하는 구조 
		 * 
		 * Set
		 * - 값을 하나씩 저장
		 * - 순서를 보장X (index) 번지가 없음.
		 * - 중복을 허용하지 않음
		 * 
		 * Map
		 * - 값을 두개 저장, key/value 쌍으로 저장
		 * - key는 중복 불가, value는 중복 가능
		 * - key가 중복되면 덮어쓰기 됨
		 * - ID/Password 처럼 같이 묶어서 하나의 자료로 저장해야 될 때 사용
		 * 
		 * int arr[]; : 기본 자료형 사용가능.
		 * collection에서는 어떤 클래스로 데이터를 관리할지 지정해야 함.
		 * 
		 * int -> Integer, String, 나머지 자료형들은 첫글자만 대문자로 변환 Byte, Boolean..
		 * 클래스를 지정하지 않으면 Object가 자동 들어간다.
		 * */
		
		//List list1 = new List(); error
		List list1 = new ArrayList(); //object클래스가 자동지정된 케이스
		//전부 사용 가능 down below
		ArrayList list2 = new ArrayList(); //object 클래스가 자동 지정된 케이스
		//숫자만 가능한 ArrayList 생성
		ArrayList<Integer> list = new ArrayList<Integer>();
		//문자열만 가능한 ArrayList 생성
		ArrayList<String> list3 = new ArrayList<String>();
		
		//add(): 요소를 추가
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		//size(): list의 총 개수
		System.out.println(list.size());
		
		list3.add("To");
		list3.add("be");
		list3.add("Or");
		list3.add("Not");
		list3.add("To be");
		System.out.println(list3);
		System.out.println(list3.size());
		
		//리스트를 생성하고 1~10까지 저장한 후 출력
		//List<Integer> list4 = new ArrayList<>();//일반적인 구조
		ArrayList<Integer> list4 = new ArrayList<Integer>(); 
		for(int i = 1; i <= 10; i++) {
			list4.add(i);
		}
		for(int i = 1; i <= 10; i++) {
			list4.add(i);
		}
		System.out.println(list4);
		//get(index): index 번지의 값을 가져와라
		System.out.println(list4.get(0));
		System.out.println(list4.get(1));
		//set(index, 값)
		list4.set(1, 7); //1번지의 값을 7로 변경해라.
		System.out.println(list4.get(1));
		//remove(index): index 번지값 삭제
		//remove(Object): object 값으로 넣으면 값으로 삭제
		list4.remove(1);
		System.out.println(list4.get(1));
		System.out.println(list4);
		Integer a = 10;
		list4.remove(a);
		System.out.println(list4);
		//contains(object): list에 값이 있는지 검사 있으면 true, 없으면 false
		System.out.println(list4.contains(a));
		//clear(): list 삭제
		list4.clear();
		System.out.println(list4);
		//isEmpty(): list가 비었는지 체크
		System.out.println(list4.isEmpty());
		//list4에 for문으로 1~5까지만 입력
		for(int i = 1; i <= 5; i++) {
			list4.add(i);
		}
		//list4 요소 출력
		for(int i = 0; i < list4.size(); i++) {
			System.out.print(list4.get(i) + " ");
		}
		System.out.println();
		System.out.println("---------------------");
		//자주 사용: 향상된 for 문
		for(int tmp : list4) {
			System.out.print(tmp + " ");
		}
		
		//Iterator: 컬렉션을 출력하기 위해 사용.
		/* list는 순서를 보장하기 떄문에 get(i)를 이용하여 원하는 변수에 접근이 가능
		 * set은 순서를 보장하지 않기 떄문에 for문을 이용할수 없음.
		 * 향상된 for, Iterator 처럼 순서와 상관없이 값을 가져올수있는 구문에서 출력가능
		 * 
		 * */
		System.out.println();
		System.out.println("---------------------");
		Iterator<Integer> it = list4.iterator();
		while(it.hasNext()) { //다음 요소가 있는지 체크 값이 있다면 true/ 없다면 false
			Integer tmp = it.next(); //다음요소 가져오기
			System.out.print(tmp + " ");
		}
		System.out.println();
		System.out.println("---------------------");
		//indexOf(값): 해당 값의 list index 번지를 반환 / 없다면 -1 return
		Integer b = 5;
		System.out.println(list4.indexOf(b));
		
		//Collections.sort(list4); //오름차순 정렬만 가능
		System.out.println(list4);
		//sort(객체)
		// - 객체: Comparator 인터페이스를 구현한 객체를 넣어야 함. (익명클래스를 사용)
		// - 비교(compare) 메서드를 사용하여 객체를 정렬
		//내림차순 / 오름차순
		list4.sort(new Comparator<Integer>() {

	         @Override
	         public int compare(Integer o1, Integer o2) {
	            //o1-o2 : 오름차순, o2-o1 : 내림차순
	            return o1-o2;
	         }
	    });
		System.out.println(list4);
	}

}
