package day05;

public class String02 {

	public static void main(String[] args) {
		
		// 이것이 자바다.txt 파일에서 파일명과 확장자를 분리하여 출력
		
		String fileName = new String();
		fileName = "이것이 자바다.txt";
		String name = fileName.substring(0, fileName.indexOf("."));
		String file = fileName.substring(fileName.indexOf(".")+1);
		System.out.println(name);
		System.out.println(file);
		//contains(str): 해당 글자가 포함되어있는지를 체크 
		System.out.println(fileName.contains("자바"));
		System.out.println(fileName.contains("java"));
		
		
		
		
	}

}
