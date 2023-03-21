package day14;

public class 과제6 {

	public static void main(String[] args) {
//		다형성 클래스 수정 예제
//		Animal 클래스 확장해보기 - human, eagle, tiger 클래스에 다른 기능 넣어보기.
//		ex) 각 동물 먹이, 다른 동물 추가 등등..
		Animal hAnimal = new Human();
		Animal eAnimal = new Eagle();
		Animal tAnimal = new Tiger();
		Animal cAnimal = new Cat();
		Animal dAnimal = new Dog();
		int cnt = 0;
		Animal[] AnimalList = new Animal[5];
		AnimalList[cnt] = hAnimal;
		cnt++;
		AnimalList[cnt] = eAnimal;
		cnt++;
		AnimalList[cnt] = tAnimal;
		cnt++;
		AnimalList[cnt] = cAnimal;
		cnt++;
		AnimalList[cnt] = dAnimal;
		cnt++;
		과제6 poly = new 과제6();
		for(int i = 0; i < AnimalList.length; i++) {
			poly.downCasting(AnimalList[i]);
			System.out.println("///////////////");
		}
		
	}
	public void downCasting(Animal list) {
		if(list instanceof Human) {
			Human human = (Human)list;
			human.move();
			human.food();
			human.behave();
		} else if(list instanceof Eagle) {
			Eagle eagle = (Eagle)list;
			eagle.move();
			eagle.food();
			eagle.behave();
		} else if(list instanceof Tiger) {
			Tiger tiger = (Tiger)list;
			tiger.move();
			tiger.food();
			tiger.behave();
		} else if(list instanceof Cat) {
			Cat cat = (Cat)list;
			cat.move();
			cat.food();
			cat.behave();
		} else if(list instanceof Dog) {
			Dog dog = (Dog)list;
			dog.move();
			dog.food();
			dog.behave();
		}
	}
}
class Animal {
	public void move() {
		System.out.println("동물들이 움직입니다.");
	}
}
class Human extends Animal {
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
	public void food() {
		System.out.println("햄버거를 먹습니다.");
	}
	public void behave() {
		System.out.println("출근을 합니다.");
	}
}
class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 날라갑니다.");
	}
	public void food() {
		System.out.println("송어를 먹습니다.");
	}
	public void behave() {
		System.out.println("날개짓을 합니다.");
	}
}
class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 뛰어다닙니다.");
	}
	public void food() {
		System.out.println("생닭을 먹습니다.");
	}
	public void behave() {
		System.out.println("어슬렁거립니다.");
	}
}
class Cat extends Animal {
	public void move() {
		System.out.println("고양이가 움직입니다.");
	}
	public void food() {
		System.out.println("츄르를 먹습니다.");
	}
	public void behave() {
		System.out.println("잠을 잡니다.");
	}
}
class Dog extends Animal {
	public void move() {
		System.out.println("강아지가 뛰어다닙니다.");
	}
	public void food() {
		System.out.println("사료를 먹습니다.");
	}
	public void behave() {
		System.out.println("산책가자고 조릅니다.");
	}
}