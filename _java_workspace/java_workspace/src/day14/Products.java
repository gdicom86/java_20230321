package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
class Products {
	int sum = 0;
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	Scanner sc = new Scanner(System.in);
	public void save() {
		while(true) {
			System.out.println("저장하실 상품명을 입력하세요: ");
			String str = sc.next();
			System.out.println("상품명의 가격을 입력하세요: ");
			int num = sc.nextInt();
			map.put(str, num);
			System.out.println("계속 저장하시겠습니까?(y/n)");
			String answer = sc.next();
			if(answer.equals("n")) {
				break;
			}
		}
	}
	public void print() {
		for(String tmp : map.keySet()) {
			System.out.println(tmp + ": " + map.get(tmp));
		}
	}
	public void sum() {
		for(int tmp : map.values()) {
			sum += tmp;
		}
		System.out.println("합계는: " + sum);
	}
	
}