package day11;

public class Customer {

	/* 일반 고객 / Gold 고객 / VIP고객
	 * 
	 * 고객 ID: int customerID
	 * 고객 이름: String customerName
	 * 고객 등급: String customerGrade
	 * 보너스포인트: int bonusPoint
	 * 보너스포인트 적립비율: double bonusRatio
	 * 
	 * - customer 객체 생성시
	 * 기본 customerGrade = Silver
	 * 기본 bonusRatio = 0.01
	 * 
	 * - 메서드
	 * - 보너스 적립 계산(calcPrice(int price))
	 * - 구매금액을 주고, 적립보너스를 계산 bonusPoint에 누적
	 * - 출력메서드 (메서드명: customerInfo())
	 * - 홍길동 님의 등급은 VIP이며, 보너스 포인트는 1000 입니다.
	 * 
	 * - Gold 등급
	 * - 제품을 살 때 10% 할인 / 보너스 포인트 2% 적립
	 * 
	 * - VIP 등급
	 * - 제품을 살 때 10% 할인 / 보너스 5% 적립
	 * - 전담 상담사를 갖는다.
	 * 
	 * */
	protected int customerID; //고객 ID
	protected String customerName; //고객명
	protected String customerGrade; //고객등급
	int bonusPoint; //포인트
	double bonusRatio; //적립비율
	public Customer() {} //
	public Customer(int id, String name) {
		customerID = id;
		customerName = name;
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	public int calcPrice(int price) {
		//가격을 매개변수로 받아 포인트를 적립
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
	public void customerInfo() {
		System.out.println(customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}


