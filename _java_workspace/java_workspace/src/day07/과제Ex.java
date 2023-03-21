package day07;
import java.util.Scanner;
public class 과제Ex {

	public static void main(String[] args) {
		
		// 1. Scanner 열기
		Scanner scan = new Scanner(System.in);
		// 2. 변수들을 선언
		int[] comNum = new int[3]; //컴퓨터배열
		int[] myNum = new int[3]; //내 배열
		int count = 0; // 게임횟수
		//3. 컴퓨터가 결정한 3가지 숫자를 중복되지 않게 추출
		// 0 0 0 -> 3 0 0
//		for(int i = 0; i < comNum.length; i++) {
//			comNum[i] = (int)(Math.random()*9)+1; // 1~9까지
//			for(int j = 0; j < i; j++) { //j는 비교하는 값
//				if(comNum[i] == comNum[j]) {
//					i--;
//					break; // j의 구문을 빠져나감
//				}
//			}
//		}
		//로또예제에서 만든 메서드 호출
		LottoEx l = new LottoEx(); // 클래스명 객체명 = new 클래스명();
		l.randomArray(comNum);		//객체명.(불러온 클래스의)메서드(args);
		//Point p = new Point(); //Point 클래스의 객체 생성
		//4. 사용자 숫자 입력받기
		while(true) {
			int s = 0, b = 0;
			count++;
			System.out.println("===야구게임 시작!!===");
			System.out.println("컴퓨터가 숫자를 결정했습니다.");
			System.out.println("> 숫자 입력(1~9, 숫자 3개): ");
			//숫자로 입력받는 경우
//			for(int i = 0; i < myNum.length; i++) {
//				myNum[i] = scan.nextInt();
//			}
			//값을 문자로 받는 경우
			String myStr = scan.next(); //789 한자리씩 잘라서 배열에 저장
			String [] myNumStrArr = myStr.split(""); //한 글자씩 잘라서 배열로 저장
			for(int i = 0; i < myNum.length; i++) {
				myNum[i] = Integer.parseInt(myNumStrArr[i]); //String -> int 
			}
			
			//숫자 비교
			for(int i = 0; i < comNum.length; i++) {	//컴퓨터 num 기준 탐색
				for(int j = 0; j < myNum.length; j++) {	//myNum 기준 탐색
					//Strike 기준 (값 & 자리수도 값은 경우)
					if(comNum[i] == myNum[j] && i == j) { 
						s++;
					//Ball 기준 (값은 같고 자리 수가 다를 경우)
					} else if(comNum[i] == myNum[j] && i != j) {
						b++;
					}
				}
			}
			
			//출력
			//아웃 조건 (아무것도 안맞음)
			if(s == 0 && b == 0) {
				System.out.println("OUT!");
			} else {
				System.out.println(">" +s+"S " +b+"B");
			}
			
			if(s == 3) {
				System.out.println("정답" + count + "번 만에 맞춤");
				break;
			}
		}
		
		scan.close();
	}

}
