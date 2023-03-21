package day14;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SetEx02 {

	public static void main(String[] args) {
		//점수를 줌.
		int[] score = {80,89,67,57,59,56,100,22};
		TreeSet<Integer> set = new TreeSet<>();
		for(int i = 0; i < score.length; i++) {
			set.add(score[i]);
		}
		System.out.println(set);
		System.out.println("꼴찌" + set.first()); //가장 앞에 있는 값 
		System.out.println("일등" + set.last()); // 가장 뒤에 있는 값
		System.out.println("--------------------");
		//headSet: 지정 값보다 작은 값 출력, tailSet: 지정된 객체보다 큰 값 출력
		System.out.println(set.tailSet(80));
		System.out.println(set.headSet(80));
		
		//범위검색(70포함, 뒤쪽 값은 미포함)
		System.out.println(set.subSet(70, 90));
		
		NavigableSet<Integer> desSet = set.descendingSet();
		
		System.out.println(desSet);
		
	}

}
