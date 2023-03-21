package day08;
import java.util.Scanner;
public class 클래스02 {

	public static void main(String[] args) {
		
		/* 자동차 클래스 생성
		 * 멤버 변수: color, power, speed
		 * 메서드: powerOn, poewrOff (Sysout...)
		 * 		 speedUp, speedDown (+10, -10)
		 * 멤버 변수: private
		 * 멤버 변수를 확인 수정 하려면 getter/setter 필요
		 * */
		Car c = new Car("Green");
		System.out.println(c.getColor());
		System.out.println(c.getSpeed());
		c.powerOn();
		c.speedUp(10);
		c.speedUp(50);
		c.speedUp(70);
		c.speedUp(10);
		c.speedDown();
		System.out.println(c.getSpeed());
		//c.setColor("Blue");
		System.out.println(c.getColor());
		c.powerOff();
		c.speedUp(10);
		c.powerOn();
		c.speedUp(10);
		c.speedDown();
		c.speedDown();
		c.speedDown();
		
		Car c2 = new Car("White", 4);
		System.out.println("문짝 개수: " + c2.getDoor());
		System.out.println(c2.getColor());
		//c2.setColor("Red");
		System.out.println(c2.getColor());
		System.out.println(c2.getPower());
		c2.powerOn();
		c2.speedUp(90);
		c2.speedUp(90);
		c2.speedUp(90);
		c2.speedUp(90);
		c2.speedUp(90);
		c2.speedUp(90);
		
		
	}
}

class Car { //클래스
	private String color = "Black"; //항상 멤버 변수 선언! //null;
	private int speed;	//어떤 타입일지 생각! //0
	private boolean power; // false;
	private int door;
	//생성자: 없으면 기본생성자가 자동 추가된다.
	//생성자 위치 // 초기화가 유용하다.
	public Car(String color) {
		this.color = color;
	}
	public Car() {} //기본 생성자
	
	public Car(String color, int door) {
		//this(color); 
		this.color = color;
		this.door = door;
	}
	
	public boolean getPower() { //멤버 메서드 
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
	public void speedUp(int speed) {
		if(power == false) {
			System.out.println("시동을 먼저 켜주세요.");
		} else {
			this.speed+=speed;
			System.out.println(color + " Speed: " + this.speed);
		}
		if(this.speed >= 500) {
			System.out.println("Boost on? (y/n)");
			Scanner scan = new Scanner(System.in);
			char answer = scan.next().charAt(0);
			if(answer == 'y') {
				this.speed = this.speed + 100;
				System.out.println(color + " Speed: " + this.speed);
			} else {
				System.out.println("Limited speed");
				this.speed = 500;
				System.out.println(color + " Speed: " + this.speed);
			}
		}
	}
	public void speedDown() {
		if(speed <= 0 ) {
			speed = 0;
		} else {speed-=10;}
		System.out.println("속도: " + speed);
	}
	public int getSpeed() {
		return speed;
	}
	public void setColor(String color) { //getter setter
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	
}