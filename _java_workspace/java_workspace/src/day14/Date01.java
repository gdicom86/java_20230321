package day14;

import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		
		/* 날짜시간 클래스
		 * Calendar 클래스 사용 => 추상클래스
		 * 직접 객체를 생성 할 수 없음
		 * new 연산자를 통해 객체 구현 X
		 * getInstance()를 이용하여 구현한 클래스를 통해 인스턴스를 얻어 옴
		 * 
		 *  month: 0월 ~ 11월 +1
		 *  week: 1 = 일요일 2 = 월요일....
		 *  am_pm: am = 0, pm = 1; 
		 * 
		 * */
		//Date d = new Date();
		//d.getDate(); //depercated: 비권장
		//System.out.println(d.getDate());
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		int month = now.get(Calendar.MONTH)+1;
		System.out.println(month);
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int min = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);
		
		String str = null;
		switch(week) {
		case 1: str = "일요일"; break;
		case 2: str = "월요일"; break;
		case 3: str = "화요일"; break;
		case 4: str = "수요일"; break;
		case 5: str = "목요일"; break;
		case 6: str = "금요일"; break;
		case 7: str = "토요일";
		}
		String hStr = null;
		if(hour > 12) {
			hStr = "오후";
			hour = hour-12;
		} else {
			hStr = "오전";
		}
		System.out.println(year + "-" + month + "-" + day + "(" + str + ")");
		System.out.println(hStr + " " + hour + ":" + min + ":" + sec);
	}

}
