package day08;

public class 클래스03 {

	public static void main(String[] args) {
		
		/* Card 클래스 생성
		 * */
		Card c = new Card();
		c.print();
		c.setShape('♣');
		c.setNum(5);
		c.print();
		c.setShape('&');
		c.print();
		//카드에 있지 않은 모양/숫자가 들어오면 무조건 => 1♥
		
	}

}
/* Card 클래스: 포커게임에서 사용하는 카드를 나타내는 클래스
 * 모양: 하트(♥), 클로버(♣), 스페이드(♠), 다이아(◆)
 * 숫자: 1~10 J Q K
 * 
 * 클래스의 구성
 * 멤버변수 : 모양(char shape), int num 11 12 13 
 * 메서드: print
 * getter/setter
 * 생성자: ♥1
 * */
 class Card {
	 private char shape;
	 private int num;
	 public Card() { //생성자: 객체의 초기화값을 결정
		 this.shape = '♥';
		 this.num = 1;
	 }
	 public void print() {
		switch(num) {
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
			 System.out.print(num);
		}
		System.out.print(shape);
		System.out.println();
	 }
	 public char getShape() {
		 return shape;
	 }
	 public void setShape(char shape) {
		 switch(shape) {
		 case '♥': case '♣': case '◆': case '♠':
			 this.shape = shape;
			 break;
		 default: 
			 this.shape = '♥';
		 }	 
	 }
	 public int getNum() {
		 return num;
	 }
	 public void setNum(int num) {
		 if(num > 13 || num < 1) {
			 num = 1;
		 }
		 this.num = num;			 
	 }
 }