package day13;

import java.util.ArrayList;
import java.util.Scanner;
public class List02 {

	public static void main(String[] args) {
		/* --메뉴판--
		 * 1.햄버거: 7000
		 * 2.피자: 15000
		 * 3.음료: 2000
		 * 4.과자: 2000
		 * 5.사탕: 500
		 * 6.프로그램 종료
		 * 
		 * 메뉴를 선택해주세요. 1, 수량을 선택해주세요 2
		 * -> 1번 메뉴 햄버거 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요 2
		 * -> 3번메뉴 음료 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요 0
		 * 
		 * --선택한 메뉴
		 * 햄버거 2개 음료 2개 선택 총 지불금액: ?
		 * */
		Scanner sc = new Scanner(System.in);
		FoodManager fm = new FoodManager();
		ArrayList<String> menu = new ArrayList<String>();
		ArrayList<Integer> num = new ArrayList<Integer>();
		int count = 0;
		int order = 0;
		int tot = 0;
		fm.add();
		while(true) {
			fm.printMenu();
			order = sc.nextInt();
			if(order == 6) {
				break;
			}
			System.out.println("수량을 선택해주세요: ");
			count = sc.nextInt();
			int sum = fm.sale(order, count);
			fm.setTotSum(sum);
			tot = tot + fm.getTotSum();
			menu.add(fm.getMenu().get(order-1));
			num.add(count);
		} 
		System.out.println("---선택한 메뉴---");
		for(int i = 0; i < menu.size(); i++) {
			System.out.println(menu.get(i) + "의 개수 " + num.get(i) + "입니다");
			
		}
		System.out.println(tot);
	}

}

class FoodManager{
	//멤버변수 ArrayList 각 가격, 메뉴 그 외의 멤버변수는 알아서 선언
	private ArrayList<String> menu = new ArrayList<String>();
	private ArrayList<Integer> price = new ArrayList<Integer>();
	private int sum;
	private int totSum;
	//메서드 정의
	//printMenu(), 추가하는 메서드 void add(), sale(int menu, int count)
	public void add() {
		menu.add("Hamberger");//0
		menu.add("Pizza");//1
		menu.add("Water");
		menu.add("Snack");
		menu.add("Candy");
		price.add(7000);
		price.add(15000);
		price.add(2000);
		price.add(2000);
		price.add(500);
	}
	public void printMenu() {
		System.out.println("---menu---");
		System.out.println("1.햄버거: 7,000");
		System.out.println("2.피자: 15,000");
		System.out.println("3.음료: 2,000");
		System.out.println("4.과자: 2,000");
		System.out.println("5.캔디: 500");
		System.out.println("주문을 끝내시려면 6을 누르세요");
		System.out.println("메뉴 선택: ");
//		System.out.println("---menu---");
//		for(int i = 0; i <= menu.size(); i++) {
//			System.out.println("\"" + i + "."+ menu.get(i) + ": " + price.get(i) + "\"");
//		}
	}
	public int sale(int menu, int count) {
		switch(menu) {
		case 1:
			sum = price.get(0) * count;	
			break;
		case 2:
			sum = price.get(1) * count;
			break;
		case 3:
			sum = price.get(2) * count;
			break;
		case 4:
			sum = price.get(3) * count;
			break;
		case 5:
			sum = price.get(4) * count;
			break;
		}
		return sum;
	}
	public int getTotSum() {
		return totSum;
	}
	public void setTotSum(int totSum) {
		this.totSum = totSum;
	}
	public ArrayList<String> getMenu() {
		return menu;
	}
	public void setMenu(ArrayList<String> menu) {
		this.menu = menu;
	}
	public ArrayList<Integer> getPrice() {
		return price;
	}
	public void setPrice(ArrayList<Integer> price) {
		this.price = price;
	} 
	
}














