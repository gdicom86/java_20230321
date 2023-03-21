package day17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;

public class BuffedReaderEx3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		HashMap<String, Integer> hm = new HashMap<>();
		int total = 0;
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			//홍길동 87 substring(startindex포함, endindex미포함);
			String name = line.substring(0, line.indexOf(" "));
			int score = Integer.parseInt(line.substring(line.indexOf(" ")+1));
			total += score;
			hm.put(name, score);
		}
		br.close();
		System.out.println("점수의 총합: " + total);
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + ": " + hm.get(key));
		}
	}

}