package day16;

import java.util.ArrayList;

public class CustomerMain {

	public static void main(String[] args) {
		ArrayList<Customer> cm = new ArrayList<>();
		cm.add(new Customer("신사임당", 40));
		cm.add(new Customer("이순신", 40));
		cm.add(new Customer("간디", 15));
		cm.stream().forEach(System.out::println);
		System.out.println("--------------------");
		cm.stream().forEach(n->{
			String name = n.getCustomer();
			int age = n.getAge();
			int price = n.getPrice();
			System.out.println(name + age + price);
		});
		int sum = cm.stream().mapToInt(n->n.getPrice()).sum();
		System.out.println(sum);
		//20세 이상 성인만 이름을 정렬하여 출력
		cm.stream().filter(m->m.getAge()>=20).map(n->n.getCustomer()).sorted().forEach(System.out::println);
		cm.stream().filter(n->n.getAge()>=20).forEach(System.out::println);
	}

}