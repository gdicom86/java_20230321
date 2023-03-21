package day17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderEx2 {

	public static void main(String[] args) throws IOException {
		
		/* BufferedReader, PrintWriter
		 * 파일을 읽어들여 복사하여 객체 생성
		 * out.txt 파일을 읽어 out2.txt로 쓰기
		 * */
		BufferedReader br = null;
		PrintWriter pw = null;
		final String Path_OUT = "out2.txt";
		System.out.println("복사를 시작합니다.");
		br = new BufferedReader(new FileReader("out.txt"));
		pw = new PrintWriter(new FileWriter(Path_OUT));
		String line = "";
		while((line = br.readLine())!=null) {
			System.out.println(line);
			pw.println(line);
		}
		System.out.println("복사 완료");
		if(br!=null) { //객체가 생성되었다면 close
			br.close();
		}
		if(pw!=null) {
			pw.close();
		}
//		while(true) {
//			String line = br.readLine();	
//			if(line == null) {
//				pw.close();	
//				break;
//			}
//			String tmp = line + "\n";
//			System.out.print(tmp);
//			pw.write(tmp);
//		}
//		br.close();
		
		

		
	}

}
