package day10;

public class 과제1 {

	public static void main(String[] args) {
		
		/* final은 클래스, 변수, 메서드에 붙일 수 있음
		 * final: 수정할 수 없다.
		 * final 멤버 변수: 상수
		 * final 멤버 메서드: 오버라이딩 할 수 없다.
		 * final 클래스: 상속할 수 없다. 부모 클래스가 될 수 없다.
		 * 
		 * */
		//생성자를 이용한 객체 만들기
		EzenStudent es = new EzenStudent("인천", "송지호", "Java/Spring", "0105123");
		System.out.println(es);
		//setter를 이용한 객체 만들기
		EzenStudent es2 = new EzenStudent();
		es2.setName("Kim");
		es2.setOffice("Seoul");
		es2.setPhoneNum("0105613");
		es2.setWhatClass("Html/css");
		System.out.println(es2);
	}

}
/* 초기화 방법: 기본 값, 명시적 초기값, 초기화 블럭, 생성자
 * 1. 명시적 초기화: 멤버변수 선언과 동시에 초기값 지정
 * 2. 초기화 블럭: {} 멤버변수 초기화
 * 3. 생성자: 객체를 생성 할 때 초기화해서 생성
 * 초기값 우선 순위
 * 기본값 -> 명시적초기값 -> 초기화 블럭 -> 생성자
 * */
//멤버 변수: 지점, 이름, 반, 전화번호
//메서드: 출력(print 메서드, toString가능)
//getter,setter
class EzenStudent {
	//private final String Office = "인천"; 명시적 초기값  
	private String office;
	private String name;
	private String whatClass;
	private String phoneNum;
	{
		//초기화 블럭: 멤버변수들을 초기화;
		whatClass = "미정";
	}
	//생성자
	public EzenStudent() {}
	public EzenStudent(String office, String name, String whatClass, String phoneNum) {
		this.office = office;
		this.name = name;
		this.whatClass = whatClass;
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return "EzenStudent [office=" + office + ", name=" + name + ", whatClass=" + whatClass + ", phoneNum="
				+ phoneNum + "]";
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWhatClass() {
		return whatClass;
	}
	public void setWhatClass(String whatClass) {
		this.whatClass = whatClass;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
}












