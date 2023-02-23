package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {
		
		//입력받은 수의 약수의 총합을 구하세요.
		//입력받은 값: 12 -> 1 2 3 4 6 12 -> 28
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int num = sc.nextInt();
		System.out.print("입력받은 값: " + num + " -> ");
		
		int n = 1;      //begin
		int total = 0;  //누적합 변수
		
		while(n<=num) {
			if(num%n == 0) {
			System.out.print(n + " ");
			total += n;
		}
			n++;
		}
		System.out.println("-> " + total);
		
		sc.close();
	}
}
