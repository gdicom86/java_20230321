package day16;

import java.util.ArrayList;

public class LambdaEx {

	public static void main(String[] args) {
		/* Lambda expression: 람다식
		함수형 프로그램(Function Programming: FP)
		순수한 함수를 구현하고 호출함으로써 외부 자료에 부수적인 영향(side effect)
		를 주지 않도록 구현하는 방식
		순수함수(pure function): 매개변수만을 사용하여 만드는 함수
		즉, 함수 내부에서 함수 외부에 있는 병수를 사용하지 않아 함수가 실행되더라도
		외부에 영향을 주지 않는 형태
		 * */
		int res = add(3, 5);
		System.out.println(res);
		/* (int x, int y) -> {return x+y}
		 * int x -> {return x+y}
		 * 
		 * return 있으면 중괄호 생략 불가능
		 * str -> System.out.println()str;
		 * */
		
		ArrayList<Integer> number = new ArrayList<>();
		number.add(10);
		number.add(20);
		number.add(5);
		number.add(3);
		number.add(32);
		
		for(Integer i : number) {
			System.out.println(i + " ");
		}
		System.out.println();
		System.out.println("---람다식---");
		number.forEach((n)-> {
			System.out.print(n + " ");
		});
		System.out.println();
		
		//메서드에 직접 참조
		number.forEach(System.out::println);
		//number list의 총 개수
		System.out.println(number.stream().count());
	}
	public static int add(int x, int y) {
		return x+y;
	}
}