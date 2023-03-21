package day10;

import java.util.Scanner;

public class EzenComputer {
	/* -학생 기본정보: 이름, 생년월일, 나이, 전화번호
	 * -학원정보: 학원이름 = "EZEN", 지점
	 * -수강정보: 수강과목, 기간
	 * -한명의 학생은 여러과목을 수강할 수 있다.
	 * 과목, 기간 => 배열로 처리 = 5
	 * 
	 * 홍길동, 990101, 20, 010-123-1234
	 * EZEN, 인천
	 * JAVA(6개월), DB(1개월), Html(2개월)
	 * 
	 * 기능
	 * 학생의 기본정보 출력
	 * 학생의 학원정보 출력
	 * 학생의 수강정보 출력
	 * 학생의 수강정보를 추가하는 기능
	 * */
	
	

	private String studentName;
	private String studentBirth;
	private String studentAge;
	private String studentPhone;
	
	public EzenComputer() {}
	public EzenComputer(String studentName, String studentBirth, String studentAge, String studentPhone) {
		this.studentName = studentName;
		this.studentBirth = studentBirth;
		this.studentAge = studentAge;
		this.studentPhone = studentPhone;
	}
	public void stPrint() {
		System.out.println("학생이름: " + studentName + " 생년월일: " + studentBirth + " 학생나이: " + studentAge + " 전화번호: " + studentPhone);
	}
	private final static String officeName = "EZEN";
	private String officeLocation;
	
	public EzenComputer(String officeLocation) {
		this.officeLocation = officeLocation;
	}
	public void ofPrint() {
		System.out.println("학원 이름: " + officeName + " 학원 위치: " + officeLocation);
	}
	{
		officeLocation = "인천";
	}
	private String[] course = new String[5];
	private String[] period = new String[5];
	private int num = 0;
	public void save(String[] arr) {
		System.out.println("수강과목을 입력하세요(몇개월): ");
		Scanner sc = new Scanner(System.in);
		arr[num] = sc.next();
		num++;
		if(num < 5) {
			return;
		}
		
	}
	public void init() {
		num = 0;
	}
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentBirth() {
		return studentBirth;
	}

	public void setStudentBirth(String studentBirth) {
		this.studentBirth = studentBirth;
	}

	public String getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
	public String getOfficeName() {
		return officeName;
	}
	public String[] getPeriod() {
		return period;
	}
	public void setPeriod(String[] period) {
		this.period = period;
	}
	
}
