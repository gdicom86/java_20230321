package product;

public class Product {
	//메뉴명 가격
	//멤버변수
	private String menu;
	private int price;
	//생성자
	public Product() {}
	public Product(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
