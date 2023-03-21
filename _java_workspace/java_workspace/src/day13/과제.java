package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class 과제 {

	public static void main(String[] args) {
		
		/* 단어장 단어와 의미를 저장 Hello => 안녕
		 * 
		 * 5개의 단어를 입력하고 단어장을 출력하세요.
		 * */
		//size로 변수 선언
		HashMap<String, String> map = new HashMap<String, String>();
		int size = 5;
		Scanner sc = new Scanner(System.in);
		while(map.size() < size) {
			System.out.println("단어: ");
			String word  = sc.next();
			String mean = sc.next();
			map.put(word, mean);
		}

		//출력
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = (String)it.next(); //key값 반환
			String mean = map.get(word); //value값 반환
			System.out.println("단어: " + word + "뜻: " + mean);
		}
		
	}

}
