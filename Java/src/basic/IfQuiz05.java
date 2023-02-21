package basic;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {

		/*
		 # 국어, 영어, 수학 점수를 각각 입력받아서
		 평균을 구해 보세요. (평균은 소수점 첫째 자리까지 출력)
		 평균이 90점이 넘는다면, 다시 한 번 조건을 검사해서
		 95 ~ 100 -> A+
		 94 ~ 90 -> A0
		 80점대는 B, 70점대는 C, 60점대는 D, 나머지는
		 모두 F 처리하시면 됩니다. (100점이 만점)
		 
		 ex)
		 평균 점수: 95.5
		 당신의 학점은 A+ 입니다.		 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: ");
		int korean = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		System.out.print("영어: ");
		int english = sc.nextInt();
		
		float average = (float)(korean + math + english)/3;
		String grade;
		
		if (average >=90) {
			if(average>=95) {
				grade = "A+";
			} else {
				grade = "A0";
			}
		} else if (average >=80) {
			grade = "B";
		} else if (average >=70) {
			grade = "C";
		} else if (average >=60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("----------------------------------");
		System.out.printf("평균점수: %.1f점\n당신의 학점은 %s 입니다."
				, average, grade);
		
		sc.close();
	}

}
