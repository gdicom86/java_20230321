package day17;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		WordManager wm = new WordManager();
		int menu = -1;
		
		do {
			wm.addWord();
			wm.printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1: wm.insertWord(scan); break;
			case 2: wm.searchWord(scan); break;
			case 3: wm.modifyWord(scan); break;
			case 4: wm.printWord(); break;
			case 5: wm.fileWord(); break;
			case 6: wm.delWord(scan); break;
			case 7: break;
			default:
				System.out.println("잘못된 메뉴");
			}
			
			
		} while(menu != 7);
		
		scan.close();

	}

}
