package product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ProductManager {
	int total = 0;
	//메뉴등록리스트, 주문리스트
	ArrayList<Product> list = new ArrayList<>();
	ArrayList<String> orderList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	//메뉴 추가 기능
	public void add() {
		System.out.println("추가하실 메뉴명을 입력해주세요: ");
		String menu = sc.next();
		System.out.println(menu + "의 가격을 입력해주세요: ");
		int price  = sc.nextInt();
		Product pr = new Product(menu, price);
		list.add(pr);
	}
	//메뉴리스트 출력
	public void print() {
		Iterator<Product> it = list.iterator();
		while(it.hasNext()) {
			Product tmp = it.next();
			System.out.println("제품명: " + tmp.getMenu() + "\n제품가격: " + tmp.getPrice());
		}
	}
	//주문
	public void order() {
		int tmp = 0;
		System.out.println("주문하실 제품명을 입력해주세요: ");
		String orderMenu = sc.next();
		System.out.println("주문하실 수량을 입력하세요: ");
		int orderNum = sc.nextInt();
		for(int i = 0; i < list.size(); i++) {
			if(orderMenu.equals(list.get(i).getMenu())) {
				tmp = list.get(i).getPrice() * orderNum;	
				total += tmp;
			}
		}
		System.out.println("주문하신 " + orderMenu + " 수량" + orderNum + "의 가격은" + tmp + "입니다.");
		orderList.add(orderMenu);
	} 
	//제품주문내역출력
	public void productPrint() {
		for(String tmp : orderList) {
			System.out.print(tmp + " ");
		}
		System.out.println("의 총 가격은 " + total + "입니다.");
	}
}
