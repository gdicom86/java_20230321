package day16;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		/* 문자열(이름)을 담는 리스트 생성후, 스트링으로 생성
		 * 정렬하여 출력
		 * */
		ArrayList<String> names = new ArrayList<>();
		names.add("Song");
		names.add("Kim");
		names.add("Lee");
		names.add("Park");
		names.add("Parkssssss");
		names.add("Parkaaaaaa");
		names.add("Parkffff");
		
		Stream<String> s = names.stream();
		
		s.sorted().forEach(System.out::println);
		
		//글자수가 5글자 이상인 이름만 출력
		System.out.println("-------------");
		Stream<String> s1 = names.stream();
		s1.filter(n->n.length()>=5).sorted().forEach(System.out::println);
		System.out.println("-------------");
		names.stream().map(n->n.length()).forEach(System.out::println);
	}
}
