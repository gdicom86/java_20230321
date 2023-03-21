package day01;
import java.util.Scanner;


public class if문3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//class 변수명 = 객체 생성 (-> 뭘 생성하는지)클래스개체(입력을 받게끔 하는 명령어);
		System.out.println("점수를 입력해주세요(국어, 영어, 수학순으로 기재): ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		if(kor < 0 || kor > 100) {
			System.out.println("입력하신 국어점수 " + kor + "은(는) 값은 잘못된 점수입니다.");
		}
		if(eng < 0 || eng > 100) {
			System.out.println("입력하신 영어점수 " + eng + "은(는) 값은 잘못된 점수입니다.");
		} 
		if(math < 0  || math > 100) {
			System.out.println("입력하신 수학점수 " + math + "은(는) 값은 잘못된 점수입니다.");
		}	
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		
		System.out.println("합계: " + total);
		System.out.println("평균: %.2f\n" + avg);
		
		char ch = ' '; //지역 변수는 항상 초기화가 되어야한다.
		if(avg > 100 || avg < 0 ) {
			System.out.println("평균 계산 오류");
		} else if(avg >= 90) {
			ch = 'A';
		} else if(avg >= 80) {
			ch = 'B';
		} else if(avg >= 70) {
			ch = 'C';
		} else if(avg >= 60) {
			ch = 'D';
		} else {
			ch = 'F';
		}
		
		System.out.println("등급: " + ch);
		
		scan.close();
		
		//일회성, 구문이 끝날 때 닫아주면 된다.
	}

}
