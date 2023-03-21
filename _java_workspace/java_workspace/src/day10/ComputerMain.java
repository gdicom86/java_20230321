package day10;

public class ComputerMain {

	public static void main(String[] args) {
	
		EzenComputer ec = new EzenComputer();
		EzenComputer st1 = new EzenComputer("Kim", "990101", "20", "010-5123-1234");
		EzenComputer st2 = new EzenComputer("Song", "200101", "30", "010-6123-1234");
		EzenComputer st3 = new EzenComputer("Lee", "890101", "30", "010-8123-1234");
		EzenComputer st4 = new EzenComputer("Park", "991201", "30", "010-6123-5434");
		EzenComputer st5 = new EzenComputer("Jo", "991111", "30", "010-6623-1894");
		EzenComputer[] std = new EzenComputer[5];
		std[0] = new EzenComputer("Kim", "990101", "20", "010-5123-1234");
		std[1] = new EzenComputer("Lee", "990101", "20", "010-5123-1234");
		std[2] = new EzenComputer("홍길동", "990101", "20", "010-5123-1234");
		std[3] = new EzenComputer("Hong", "990101", "20", "010-5123-1234");
		std[4] = new EzenComputer("Park", "990101", "20", "010-5123-1234");
		
		EzenComputer of = new EzenComputer("인천");
		st1.stPrint();
		of.ofPrint();
		String[] course = new String[5];
		//String[] period = new String[5];
		int num = 0;
		ec.save(course);
		for(int i = 0; i < course.length; i++) {
			System.out.print(course[i] + " ");
		}
		ec.save(course);
		for(int i = 0; i < course.length; i++) {
			System.out.print(course[i] + " ");
		}
		/* 배열로 5명의 학생을 등록 후
		 * -학생 이름으로 검색
		 * -지점명으로 검색
		 * */
		System.out.println();
		System.out.println();
		String searchName = "홍길동";
		for(int i = 0; i < std.length; i++) {
			if(std[i].getStudentName().equals(searchName)) {
				std[i].stPrint();
				std[i].ofPrint();
				System.out.println();
			}
		}
		String searchBranch = "인천";
		for(EzenComputer tmp : std) {
			if(tmp.getOfficeLocation().equals(searchBranch)) {
				tmp.stPrint();
				tmp.ofPrint();
				System.out.println();
			}
		}
	}

}
