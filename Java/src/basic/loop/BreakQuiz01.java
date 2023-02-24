package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {

		/*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
		 지속적으로 문제를 출제한 후 정답을 입력받으세요.
		 사용자가 0을 입력하면 반복문을 탈출시키세요.

		 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("*** 연산 퀴즈 ***");
		System.out.println("0을 입력하면 종료합니다.");
		
		int oCount = 0; //정답횟수
		int xCount = 0; //오답횟수
		
		while(true) {
			int num1 = (int) (Math.random()*100)+1; //1번 난수 
			int num2 = (int) (Math.random()*100)+1; //반드시 while 안쪽에 배치
			int num3 = (int) (Math.random()*2); //플마 난수
			String  plusminers;

			if(num3 == 1) {
				plusminers = "+";
			} else {
				plusminers = "-";
			}
			System.out.println(num1+(plusminers)+num2 +"= ???");
			System.out.print(">");	
			int input = sc.nextInt();
			int result;
			if (plusminers == "+") {
				result = num1 + num2;
			} else {
				result = num1 - num2;
			}
			if(input == result) { 
				System.out.println("정답입니다!");
				oCount++;
			} else if (input == 0) {
					System.out.println("종료합니다.");
					break;
			} else {
				System.out.println("오답입니다.");
				xCount++;						
			}
		}
		System.out.println("--------------------");
		System.out.println("정답 횟수: "+ oCount+"회");
		System.out.println("오답 횟수: "+ xCount+"회");
		
		sc.close();
	}
}
