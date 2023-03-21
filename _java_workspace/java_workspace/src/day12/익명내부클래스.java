package day12;

public class 익명내부클래스 {

	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
		

	}

}
class Outer {
	
	int outNum = 10;
	static int sNum = 20;
	//예전에는 매개변수와 지역변수는 final 아니면 선언 불가능하지만
	//지금은 컴파일에서 자동으로 해줌
	Runnable getRunnable(int i) {
		//매개변수와 지역변수는 값이 들어 올때 final로 변경되서 들어 옴
		int num = 100;
		
		class MyRunnable implements Runnable {
			int localNum = 1000;
			
			@Override
			public void run() {
//				i =10; //Error
//				num = 1; //Error
				System.out.println("매개변수" + i);
				System.out.println("매서드 안 num" + num);
				System.out.println("in클래스 안 localNum" + localNum);
				
				System.out.println("out클래스 outNum" + outNum);
				System.out.println("out클래스 static sNum" + sNum);
				
				
			}
			
		}
		return new MyRunnable();
	}
	
	
}