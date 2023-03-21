package day11;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer[] customerList = new Customer[10];
		//업캐스팅 => 묵시적인 형변환이 가능
		Customer cusLee = new Customer(12313, "이길동");
		GoldCustomer cusHong = new GoldCustomer(10002, "홍길순");
		VipCustomer cusKim = new VipCustomer(11111, "김득구", 0101231234);
		//다운캐스팅 => 반드시 명시적으로 형변환을 해야 됨
		//instanceof: 원래 인스턴스의 형이 맞는지 여부를 체크하는 명령어 true / false
		System.out.println(cusKim instanceof VipCustomer);
		//VipCustomer vCustomer = (VipCustomer)cusKim;
		//System.out.println(vCustomer.getAgentID());
		/////////////////////////////////////////
		int cnt = 0;
		customerList[cnt] = cusLee;
		cnt++;
		customerList[cnt] = cusHong;
		cnt++;
		customerList[cnt] = cusKim;
		cnt++;
		System.out.println("----고객 정보----");
		//for문을 활용해서 출력
		for(int i = 0; i<cnt; i++) {
			customerList[i].customerInfo();
		}
		int price = 100000;
		System.out.println("===할인율과 포인트 계산===");
		//for문을 활용해서 고객정보 출력
		for(int i = 0; i < cnt; i++) {
			System.out.println(customerList[i].getCustomerName() + "님 " + customerList[i].getCustomerID() + " ID ");
			System.out.println(customerList[i].getCustomerGrade() + " 등급 " + customerList[i].calcPrice(price) + " 지불 금액 ");
			System.out.println(customerList[i].bonusPoint + " 보너스 금액 ");
		}
//		cusLee.calcPrice(10000);
//		cusLee.customerInfo();
//		cusLee.calcPrice(11030);
//		cusLee.customerInfo();
//		System.out.println("===할인율과 포인트 계산===");
//		int price = 100000;
//		int cost = cusLee.calcPrice(price);
//		System.out.println(cusLee.getCustomerName() + "님이 지불하실 금액은" + cost + "원 입니다.");
//		System.out.println(cusLee.getCustomerName() + "님이 현재포인트는" + cusLee.bonusPoint + "점 입니다.");
//		int cost1 = cusHong.calcPrice(price);
//		System.out.println(cusHong.getCustomerName() + "님이 지불하실 금액은" + cost1 + "원 입니다.");
//		System.out.println(cusHong.getCustomerName() + "님이 현재포인트는" + cusHong.bonusPoint + "점 입니다.");
//		System.out.println("===할인율과 포인트 계산===");
//		cusKim.customerInfo();
//		int cost2 = cusKim.calcPrice(price);
//		System.out.println(cusKim.getCustomerName() + "님이 지불하실 금액은" + cost2 + "원 입니다.");
//		System.out.println(cusKim.getCustomerName() + "님이 현재포인트는" + cusKim.bonusPoint + "점 입니다.");
		
	}

}

