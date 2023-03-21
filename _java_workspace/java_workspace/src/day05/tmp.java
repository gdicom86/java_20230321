package day05;
import java.util.Scanner;

public class tmp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int comNum = (int)(Math.random()*3);
		String comStr = "";
		switch(comNum) {
		case 1: comStr = "가위";
				break;
		case 2: comStr = "바위";
				break;
		case 3: comStr = "보";
				break;
		}
		System.out.println("가위 바위 보를 입력해주세요.");
		String userStr = sc.next();
		if(userStr.equals(comStr)) {
			System.out.println("무승부");
		} else {
			switch(userStr) {
			case "가위":
				System.out.println(comStr == "바위"? "패" : "승");
				break;
			case "바위":
				System.out.println(comStr == "보"? "패" : "승");
				break;
			case "보":
				System.out.println(comStr == "가위"? "패" : "승");
				break;
			}
		}
		
		sc.close();
	}
	
}