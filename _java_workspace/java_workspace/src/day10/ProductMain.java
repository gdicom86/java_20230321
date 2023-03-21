package day10;
import java.util.Scanner;
public class ProductMain {

	public static void main(String[] args) {
		
		/* Product 클래스: 상품을 등록하는 클래스
		 * 상품명, 가격
		 * 상품등록 메서드 => insertProduct
		 * 출력메서드
		 * */
		
		/* ProductMain 
		 * Product 배열 생성 [10];
		 * 
		 * 상품 등록 후 리스트 출력
		 * 
		 * 스캐너를 통해서 상품 등록
		 * 상품을 등록하시겠습니까? (y/n)
		 * y = 상품 등록 / n = 종료 후 등록된 제품 리스트 출력
		 * 상품이름과 가격을 등록받아 상품 배열에 등록
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		Product[] p = new Product[10];
		char answer;
		int total = 0;
		int cnt = 0; //p객체의 index 핸들링하기 위한 변수
		while(true) {
			System.out.println("상품을 등록하시겠습니까? (y/n)");
			answer = sc.next().charAt(0);
			if(answer == 'y') {
				System.out.println("상품명을 입력하세요: ");
				String productName = sc.next();
				System.out.println("가격을 입력하세요: ");
				int productPrice = sc.nextInt();
				//생성자를 이용하여 객체 생성 후 배열에 객체 담기
				//Product tmp = new Product(name, price);
				//p[cnt] = tmp;
				Product tmp = new Product();
				tmp.insertProduct(productName, productPrice);
				p[cnt]=tmp;
				cnt++;
				//입력받은 값을 바로 합계
				//total = total + productPrice;
			} else if(cnt == 10 || answer == 'n') {
				break;
			}	
		} 
		for(int i = 0; i < cnt; i++) {
			//toString 사용한 경우
			//system.out.println(p[i]);
			p[i].print();
			total = total + p[i].getPrice();
		}
		System.out.println("Total: " + total);
	}

}
