package day05;
import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {
		
		/* 5개의 파일명이 주어졌을 때, 원하는 단어를 입력하면 입력한 단어가 있는
		 * 파일들을 출력하도록 코드를 작성.
		 * 
		 * */
		String[] fileName = {"java의 정석.txt", "이것이 java다.jpg", "String 메서드.txt", "String 함수.jpg", "java의 정석 표시.jpg"};
		// ex) java => 검색 java의 정석.txt, 이것이 java다.jpg ... jpg
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 단어를 입력해주세요: ");
		String search = scan.next();
		int cnt = 0;
		for(int i = 0; i < fileName.length; i++) {
			if(fileName[i].contains(search)) {
				System.out.println(fileName[i]);
				cnt++;
			} 
		}
		if(cnt == 0) {
			System.out.println("검색값이 없습니다.");
		}
		//for(String tmp : fileName) {
		//	if(tmp.contains(search))....	
		//}
		
		
	}

}
