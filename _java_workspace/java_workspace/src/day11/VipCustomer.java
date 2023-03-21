package day11;

public class VipCustomer extends Customer{
	double saleRatio;
	int agentID;
	
	public VipCustomer(int id, String name, int agentID) {
		super(id, name);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		return price - (int)(price * saleRatio);
	}
	@Override
	public void customerInfo() {
		super.customerInfo();
		System.out.println(customerName + "님의 담당 상담사 번호는" + agentID + "입니다.");
	}
	public int getAgentID() {
		return agentID;
	}
	
		
	
	
}
