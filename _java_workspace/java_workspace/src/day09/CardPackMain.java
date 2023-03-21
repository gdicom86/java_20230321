package day09;

public class CardPackMain {

	public static void main(String[] args) {
		
		/* 카드 생성
		 * 
		 * */
		Card c = new Card(); //하트1
		//c.print();
		
		CardPack cp = new CardPack();
		//Card c  = new Card();
//		1.연산자 new에 의해서 메모리(heep)에 Card클래스의 인스턴스가 생성된다.
//		2.생성자 Card()가 호출되어 수행된다.
//		3.연산자 new의 결과로, 생성된 Card인스턴스의 주소가 반환되어 참조변수 c에 저장된다.

		//Card tmp = cp.pick(); //가장위에 있는 카드 한장을 pick Card 객체에 저장
		//tmp.print();
		//tmp = cp.pick(); //가장위에 있는 카드 한장을 pick Card 객체에 저장
		//tmp.print();
		//tmp = cp.pick(); //가장위에 있는 카드 한장을 pick Card 객체에 저장
		//tmp.print();
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 13; j++) {
				Card tmp = cp.pick();
				tmp.print();
			}
			System.out.println();
		}
		System.out.println("--------------------");
		cp.init();
		cp.shuffle();
		cp.pick().print();
		a: for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 13; j++) {
				 Card tmp = cp.pick();
				 if(tmp != null) {
					 tmp.print();
				 } else {
					 System.out.println("카드가 없습니다.");
					 break a;
				 }
			 }
			System.out.println();
		}
		cp.init();
		cp.shuffle();
	}

}
