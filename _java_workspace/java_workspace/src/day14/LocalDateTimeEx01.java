package day14;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx01 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now(); 
		System.out.println(today);
		System.out.println("-----------------");
		System.out.println(today.getYear());
		String curr = today.toString();
		System.out.println(curr);
		//2023-02-17 T15:30:21.408104100
		//날짜만 분리시켜 추출하여 찍기
		System.out.println(curr.substring(0, curr.indexOf("T")));
		System.out.println(curr.substring(curr.indexOf("T")+1, curr.indexOf(".")));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate = LocalDateTime.of(2009, 9, 30, 8, 30);//날짜 생성
		System.out.println(sDate.format(dtf));
	}

}