package studentManager;

import java.util.Scanner;

public interface Program {
	void printStudent(); //학생 전체 리스트
	void insertStudent(Scanner scan); // 스캐너로 입력받기
	void searchStudent(Scanner scan); //	학생 검색
	void registerSubject(Scanner scan); //	수강신청
	void deleteSubject(Scanner scan); //	수강철회	
}
