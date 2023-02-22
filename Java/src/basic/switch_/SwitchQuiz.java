package basic.switch_;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {

		/*
		 - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
		 다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
		 연산 결과를 출력해 주시면 됩니다. (switch문 사용)
		 연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
		 결과를 말씀해 주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1: ");
		int num1 = sc.nextInt();
		System.out.print("연산을 선택하세요 [+,-,*,/]: ");
		String operator = sc.next();
		System.out.print("정수2: ");
		int num2 = sc.nextInt();
		
		switch(operator) {
		case "+" :
			System.out.println("덧셈의 결과 값: " + num1 + num2);
			break;
		case "-" :
			System.out.println("뺄셈의 결과 값: "+ (num1 - num2));
			break;
		case "*" :
			System.out.println("곱셈의 결과 값: "+ num1*num2);
			break;
		case "/":
			if(num2 == 0) {
				System.out.println("연산할 수 없는 입력값입니다.");
			}
			System.out.printf("나눗셈의 결과 값: %.1f",(double)num1/num2);
			break;
		default:
			System.out.println("연산자가 잘못 입력 되었습니다.");
			System.out.println("[+,-,*,/]중에 하나를 입력하세요.");
		}
		
		sc.close();
	}

}
