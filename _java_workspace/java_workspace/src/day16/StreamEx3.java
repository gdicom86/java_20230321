package day16;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamEx3 {
	public static void main(String[] args) {
		ArrayList<Student> stdList = new ArrayList<>();
		stdList.add(new Student("Kim", 12));
		stdList.add(new Student("Lee", 62));
		stdList.add(new Student("Park", 82));
		stdList.add(new Student("Song", 72));
		//class에 toString이있으면
//		Stream<Student> s = stdList.stream();
//		s.forEach(System.out::println);
		//{}: 처리구문이 많은경우
		stdList.stream().forEach(s->{ //s => new Student("홍길동",90)
			String name = s.getName(); //홍길동
			int score = s.getScore(); //90
			System.out.println(name+":"+score);	
		});
		//합계=> intStream
		//getScore() => Integer => int변환
		//추출 => map, 추출후int 변환 => mapToInt
		
		Stream<Student> s1 = stdList.stream();
		System.out.println("인원: " + s1.count());
		Stream<Student> s2 = stdList.stream();
		int a = s2.mapToInt(n->n.getScore()).sum();
		System.out.println("합계: " + a);
		
		//점수가 70점 이상인 친구들의 합계
		int b = stdList.stream().mapToInt(n->n.getScore()).filter(n->n>=70).sum();
		System.out.println(b);
	} 
	

}
