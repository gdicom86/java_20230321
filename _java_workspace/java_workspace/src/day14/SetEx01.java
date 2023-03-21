package day14;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		//로또번호 출력: Set
		//random으로 생성 1~45
		
		//Math 클래스에서 제공하는 random메서드 사용
		int a = (int)(Math.random()*45)+1;
		
		int b = new Random().nextInt(45)+1;
		
		TreeSet<Integer> set = new TreeSet<>();
		while(set.size() < 6) {
			int c = new Random().nextInt(45)+1;
			set.add(c);
		}
		for(int tmp : set) {
			System.out.print(tmp + " ");
		}
		System.out.println(set);
		System.out.println(set.pollFirst()); //첫번째꺼 꺼내고 값을 지움
		System.out.println(set);
		System.out.println(set.last());		
	}

}
