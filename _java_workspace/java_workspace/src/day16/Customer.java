package day16;

public class Customer implements Comparable<Customer>{
	private String customer;
	private int age;
	private int price;
	
	public Customer(String a, int age) {
		this.customer = a;
		this.age = age;
		this.price = (age > 15)? 100:50;
	}
	
	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Customer [customer=" + customer + ", age=" + age + ", price=" + price + "]";
	}


	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o, name);
	}

	

	
	
}