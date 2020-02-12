package PracticeExample_11_19;

import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class StudentMain_ver_T {
	public static void main(String[] args) {
		
		List<Stduen_ver_T> studentList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for(int i = 0 ; i<4 ; i++) {
			System.out.print(">> ");
			String text = sc.nextLine();
			StringTokenizer st = new StringTokenizer(text, ", ");
			String name = st.nextToken().trim();
			String dept = st.nextToken().trim();
			String number = st.nextToken().trim();
			Double grade = Double.parseDouble(st.nextToken().trim());
			//Double.parseDouble()문자열을 더블로 형변환하기.
			studentList.add(new Stduen_ver_T(name, dept, number, grade));
			
			for(Stduen_ver_T student : studentList) {
				System.out.println("----------------------------");
				System.out.println(student.getName());
				System.out.println(student.getDept());
				System.out.println(student.getNumber());
				System.out.println(student.getGrade());
			}
			
		}
		
		
	}
}
