package day09;

public class tmp {
	/* Card 1~10, J Q K
	 * 하트 다이아 클로버 스페이드
	 * 한장의 카드정보를 출력하는기능
	 * 
	 * 생성자: 클래스의 멤버변수들을 초기화하는 기능 메서드
	 * 생성자가 하나도 없으면 기본 생성자를 자동으로 생성
	 * 생성자의 이름은 클래스명과 동일!, 리턴 X, 매개변수는 가질 수 있음
	 * 
	 * 멤버 변수 private 선언
	 * 메서드는 public
	 * 메서드에 접급하기 위해 getter/ setter 메서드 사용
	 * */
	private char shape = '♥';
	private int nums = 1;
	public char getShape() {
		return shape;
	}
	public void setShape(char shape) {
		this.shape = shape;
	}
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
		
	}
	public void draw() {
		int tmp = (int)(Math.random()*4)+1;
		switch(tmp) {
		case 1:
			shape = '♥';
			System.out.print(shape);
			break;
		case 2:
			shape = '♠';
			System.out.print(shape);
			break;
		case 3:
			shape = '◆';
			System.out.print(shape);
			break;
		case 4:
			shape = '♣';
			System.out.print(shape);
			break;
		}
		
		int nums = (int)(Math.random()*13)+1;
		switch(nums) {
		case 11:
			System.out.print("J");
			break;
		case 12:
			System.out.print("Q");
			break;
		case 13:
			System.out.print("K");
			break;
		default:
			System.out.print(nums);
			break;
			}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
