package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class EnglishDictionary {
	public static void main(String[] args) {
		Word w = new Word();
		int num = 0;
		Scanner sc =  new Scanner(System.in);
		do {
			System.out.println(">menu");
			System.out.println(">1. 단어추가");
			System.out.println(">2. 단어장 프린트");
			System.out.println(">3. 종료");
			System.out.println("메뉴를 입렵하세요: ");
			num = sc.nextInt();
			switch(num) {
			case 1:
				w.add();
				break;
			case 2:
				w.print();
				break;
			case 3:
				break;
			default:
				System.out.println("잘못된 메뉴번호입니다.");
			}
		} while(num !=3);
	}
}

class Word {
	//멤버변수
	//hello: 안녕, 아침인사, 반가움, ....
	private Map<String, ArrayList<String>> words = new HashMap<>();
	
	//생성자
	public Word() {}
	public Word(Map<String, ArrayList<String>> words) {
		this.words = words;
	}

	//getter/setter
	
	public Map<String, ArrayList<String>> getWords() {
		return words;
	}
	public void setWords(Map<String, ArrayList<String>> words) {
		this.words = words;
	}
	//main 등록, 출력
		/* y를 입력하면 단어를 입력 n을 입력하면 종료
		 * 단어가 이미 있다면 에러 메세지 등록금지
		 * 메서드명: makeWord
		 * */
	Scanner sc =  new Scanner(System.in);
	
	public void add() {
		String ans = "";
		a: do {
			System.out.println("영단어를 입력하세요: ");
			String word = sc.next();
			for(String tmp : words.keySet()) {
				if(tmp.equals(word)) {
					System.out.println("이미있는 단어입니다.");	
					break a;
				}		
			}
			System.out.println(word + "의 뜻을 입력하세요: ");
			String mean = sc.next();
			ArrayList<String> al = new ArrayList<>();
			al.add(mean);
			words.put(word, al);
			do {	
				System.out.println(word + "의 뜻을 더 입력하시겠습니까? (y/n) ");
				ans = sc.next();
				if(ans.equals("y")) {
					System.out.println(word + "의 뜻을 입력하세요: ");
					al.add(sc.next());
				}
			} while(ans.equals("y"));	
		} while(ans.equals("y"));	
	}
	/* 단어 출력 메서드
	 * */
	public void print() {
		for(String tmp : words.keySet()) {
			System.out.print(tmp + words.get(tmp));
			System.out.println();
		}	
	}
}