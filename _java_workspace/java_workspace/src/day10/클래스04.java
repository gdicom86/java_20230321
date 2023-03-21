package day10;

public class 클래스04 {

	public static void main(String[] args) {
		Car c = new Car();
		c.powerOn();
		c.setColor("RED");
		c.setAirbackOn();
		c.setDoor(4);
		c.setSpeed(70);
		c.print();
		Car c2 = new Car("Yellow", 5, false, true, 60);
		c2.print();
		System.out.println(c);

	}

}
class Car {
	//멤버변수: color, door, airback, power, speed
	private String color;
	private int door;
	private boolean airback;
	private boolean power;
	private int speed;
	//생성자: 빈생성자, color, (color, door), (color, door, airback), 전체 생성자
	public Car() {}
	public Car(String color) {
		this.color = color;
	} //set과 같은 의미
	public Car(String color, int door) {
		this.color = color;
		this.door = door;
	}
	public Car(String color, int door, boolean airback) {
		//생성자 호출
		this(color, door);
		this.airback = airback;
	}
	public Car(String color, int door, boolean airback, boolean power, int speed) {
		//자동생성 source GCUF
		//super();
		this.color = color;
		this.door = door;
		this.airback = airback;
		this.power = power;
		this.speed = speed;
	}
	
	//method: print();
	public void print() {
		//멤버변수는 내 클래스에서 모든 메서드에서 공유되는 변수!
		//멤버변수를 매개변수로 받을 필요가 없음.
		System.out.println("Power: " + power + " Color: " + color + " Door: " + door);
		System.out.println("Airback: " + airback + " Speed: " + speed);
	}
	//toString: 멤버변수들을 출력해주는 메서드
	@Override
	public String toString() {
		return "MyCar [color=" + color + ", door=" + door + ", airback=" + airback + "]";
	}
	//getter, setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public boolean getAirback() {
		return airback;
	}
	public boolean setAirbackOn() {
		return true;
	}
	public boolean setAirbackOff() {
		return false;
	}
	public boolean getPower() {
		return power;
	}
	public void powerOn() {
		System.out.println("전원이 켜졌습니다.");
		this.power = true;
	}
	public void powerOff() {
		System.out.println("전원이 꺼졌습니다");
		speed = 0;
		this.power = false;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}