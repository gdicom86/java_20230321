package day01;

public class if문2 {

	public static void main(String[] args) {
		
		/*국어 영어 수학의 점수의 합계와 평균을 출력하려고 한다.
		 * 평균이 80이상이면 합격 아니면 불합격
		 * 출력:  합계 평균 평가
		 * */
		int kor = 97;
		int eng = 90;
		int math = 70;
		int total = kor + eng + math;
		double avg = total / 3.0;
		
		if(avg >= 80) {
			System.out.println("총점 " + total + "," + "평균 " + avg + "(으)로 합격입니다.");
		} else {
			System.out.println("총점 " + total + "," + "평균 " + avg + "(으)로 불합격입니다.");
		}
		
		// 평가를 A(평균90이상), B(평균80이상), C(70이상), D(60이상), F(나머지)
		
		if(avg >= 90) {
			System.out.println("총점 " + total + "," + "평균 " + avg + "(으)로 A학점입니다.");
		} else if (avg >= 80) {
			System.out.println("총점 " + total + "," + "평균 " + avg + "(으)로 B학점입니다.");
		} else if (avg >= 70) {
			System.out.println("총점 " + total + "," + "평균 " + avg + "(으)로 C학점입니다.");
		} else if (avg >= 60) {
			System.out.println("총점 " + total + "," + "평균 " + avg + "(으)로 D학점입니다.");
		} else {
			System.out.println("총점 " + total + "," + "평균 " + avg + "(으)로 F학점입니다.");
		}
		
	}
	
}
