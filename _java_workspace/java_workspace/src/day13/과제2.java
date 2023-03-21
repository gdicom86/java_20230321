package day13;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class 과제2 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아 출력, 합계, 평균 출력
		 * 종료키워드가 나올때까지 반복(0)
		 * 과목과 점수를 입력해주세요.
		 * 국어: 90
		 * 수학: 80
		 * 영어: 99
		 * 입력받은 map출력 후
		 * 합계 평균
		 * */
		int num = 1;
		int total = 0;
		int avg = 0;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			if(num == 0) {
				break;
			}
			System.out.println("과목을 입력하세요: ");
			String str = sc.next();
			System.out.println(str + "의 점수를 입력하세요: ");
			int score = sc.nextInt();
			total = score + total;
			map.put(str, score);
			System.out.println("종료하시려면 0을 계속하시려면 1");
			num = sc.nextInt();
		}
		//Iterator 사용하는 경우
//		Iterator<String> it = map.keySet().iterator();
//		while(it.hasNext()) {
//			String sub = it.next();
//			int score = map.get(sub);
//			total+= score;
//			System.out.println(sub + ":" + score);
//		}
		avg = total / (map.size());
		System.out.println(map.entrySet());
		System.out.println("합계" + total + "평균" + avg);
	}

}
