package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Subject {
	
	public static void main(String[] args) {
		/* map을 이용 성적관리 프로그램 생성
		 * >>menu
		 * 1. 성적추가 (국어 97)
		 * 2. 성적조회 (전체출력):  합계 평균
		 * 3. 성적조회(과목): 서치후 일치하는 과목 출력
		 * 4. 성적수정: 서치 후 수정
		 * 5. 성적삭제
		 * 6. 종료
		 * 
		 * C(create)생성 R(read)읽기 U(update)수정 D(delete)삭제
		 * ArrayList
		 * */
		ClassList cl = new ClassList();
		cl.add();
		cl.print();
		cl.del();
		cl.print();
		cl.add();
		cl.print();
		cl.update(cl.map);
		cl.print();
		cl.update(cl.map);
		cl.print();
		cl.search(cl.map);
	}

}
class ClassList {
	Scanner sc = new Scanner(System.in); 
	HashMap<String, Integer> map = new HashMap<>();
	public void add() {
		while(true) {
			System.out.println("과목을 입력하세요: ");
			String name = sc.next();
			System.out.println("점수를 입력하세요: ");
			int score = sc.nextInt();
			if(score < 0 || score > 100) {
				System.out.println("잘못된 점수입니다.");
				return;
			}
			map.put(name, score);
			System.out.println("과목과 점수를 더 등록하시겠습니까?(y/n)");
			String answer = sc.next();
			if(answer.equals("n")) {
				break;
			}
		}
	}
	public void print() {
		int sum = 0;
		double avg = 0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String subject = it.next();
			int score = map.get(subject);
			sum = sum + score;
			System.out.println(subject + ":" + score);
		}
		avg = sum / map.size();
		System.out.println("합계: " + sum + " 평균: " + avg);
	}
	public void del() {
		System.out.println("어떤 과목을 지우시겠습니까? ");
		String delStr = sc.next();
		if(map.get(delStr) == null) {
			System.out.println(delStr + "은(는) 없는 과목입니다.");
		} else {
			map.remove(delStr);
		}
	}
	public void search(HashMap<String, Integer> map) {
		System.out.println("검색하실 과목을 입력하세요: ");
		String subject = sc.next();
		
		Integer score = map.get(subject);
		if(score == null) {
			System.out.println(subject + "은(는) 없는 과목입니다.");
		} else {
			System.out.println(subject + ":" + score);
		}
		
	}
	public void update(HashMap<String, Integer> map) {
		System.out.println("수정하실 과목을 입력하세요: ");
		String upStr = sc.next();
		System.out.println("수정하실 과목의 점수를 입력하세요: ");
		int upInt = sc.nextInt();
		map.put(upStr, upInt);
	}
	public HashMap<String, Integer> getMap() {
		return map;
	}
	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}
	
}















