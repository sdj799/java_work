package basic.loop;

import java.util.Scanner;

public class LoopNesting2m {

	public static void main(String[] args) {

		/*
        - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
         가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.

        ex)
        입력받은 수 -> 30
        소수: 2 3 5 7 11 13 17 19 23 29
        소수의 개수: 10개
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("정수: ");
		int num = sc.nextInt();
		int count = 0;
		int s = 0;//약수의 개수
		System.out.print("소수: ");
		for(int n = 1; n<=num; n++) {//입력값까지의 반복
			for(int i = 1; i<=n; i++) {//이 수가 소수인가에 대한 반복
				if(n%i==0) {//약수의 개수 판별
					s++; //약수의 개수를 더함
				}
			}
			if(s==2) {//이 수가 소수이면 출력
				System.out.print(n+" ");
				count++;//소수의 개수를 더함
			} s=0; //s를 초기화
		}
		System.out.println("\n소수의 개수:" +count+"개");
		
		sc.close();
	}

}
