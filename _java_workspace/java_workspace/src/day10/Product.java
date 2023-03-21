package day10;

public class Product {
	int cnt = 0;
	/* Product 클래스: 상품을 등록하는 클래스
	 * 상품명, 가격
	 * 상품등록 메서드 => insertProduct
	 * 출력메서드
	 * */
	private int price;
	private String product;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	public void insertProduct(String productName, int productPrice) {
		this.product = productName;
		this.price = productPrice;
	}
	
	public void print() {
		System.out.print("상품이름: " + product + " 상품가격: " + price);
	}
}
