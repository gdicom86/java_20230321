package day17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import word.Word;

public class WordManager {
	/*package word에서 생성한 Word클래스 객체화해서 사용
	 * */
	private ArrayList<Word> list = new ArrayList<>();
	//메뉴출력
	public void printMenu() {
		System.out.println("---단어장 프로그램---");
		System.out.println("1.단어등록|2.단어검색|3.단어수정");
		System.out.println("4.단어출력|5.파일로출력|6.단어삭제|7.종료");
		System.out.println("----------------");
	}
	
	//기본단어등록
	public void addWord() {
		list.add(new Word("Hello", "안녕"));
		list.add(new Word("Hi", "안녕"));
		list.add(new Word("Apple", "사과"));
		list.add(new Word("Banana", "바나나"));
		list.add(new Word("King", "왕"));
	}
	
	//단어등록
	public void insertWord(Scanner scan) {
		System.out.println("단어 입력: ");
		String word = scan.next();
		System.out.println("의미 입력: ");
		String mean = scan.next();
		list.add(new Word(word, mean));
	}
	//단어검색
	public void searchWord(Scanner scan) {
		System.out.println("검색할 단어 입력: ");
		String word = scan.next();
		for(Word w : list) {
			if(w.getWord().equals(word)) {
				System.out.println("검색결과");
				System.out.println(w);
				return;
			}
		}
		System.out.println("검색단어가 없습니다.");
	}
	//단어수정
	public void modifyWord(Scanner scan) {
		System.out.println("검색단어 입력: ");
		String word = scan.next();
		System.out.println("수정단어 입력: ");
		String newWord = scan.next();
		System.out.println("수정의미 입력: ");
		String mean = scan.next();
		Word w = new Word(newWord, mean);
		//int index = -1;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getWord().equals(word)) {
				//index = i;
				list.set(i, w);
				return;
			}
		}
		System.out.println("검색단어가 없습니다");
	}
	//단어출력
	public void printWord() {
		System.out.println("--단어장--");
		//Collections.sort(list);;
		for(Word w : list) {
			System.out.println(w);
		}
		System.out.println("----------------");
	}
	//단어 파일로 출력
	public void fileWord() throws IOException {
		FileWriter fs = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fs);
		//BufferedWriter 성능향상
		//단어장 list의 값을 String화 하기위해 StringBuffer
		//객체 생성
		StringBuffer sb = new StringBuffer();
		String data = null;
		sb.append("단어장");
		sb.append("\r\n"); //줄바꿈
		int cnt = 0;
		while(cnt < list.size()) {
			sb.append(list.get(cnt));
			sb.append("\r\n"); //줄바꿈
			cnt++;
		}
		data = sb.toString();
		bw.write(data);
		bw.close();
		fs.close();	
	}
	//단어삭제
	public void delWord(Scanner scan) {
		System.out.println("삭제단어 입력: ");
		String word = scan.next();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getWord().equals(word)) {
				list.remove(i);
				return;
			}
		}
		System.out.println("검색단어가 없습니다");
	}
}
