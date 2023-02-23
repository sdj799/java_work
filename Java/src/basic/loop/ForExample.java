package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		
//		int i = 1;
		int total = 0;
//		while(i <= 10) {
//			total += i;
//			i++;
//		}
		
		for(int i=1; i<=10; i++) { //괄호안에 begin,end,step이 한번에 들어간다
			total += i;
		}
		
		//1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를
		//가로로 출력해 보세요.(for)
		
		for(int n=1; n<=200; n++) { //for문에서는 int i가 사라짐
			if(n%6==0 && n%12 != 0) {
				System.out.print(n + " ");
			}
		}
		System.out.println();
		
		//1~60000까지의 정수 중 177의 배수의 개수를 구해보세요.(for)
		
		int count = 0;
		for(int n=1; n<=60000; n++) {
			if(n%177 == 0) {
				count++;
			}
		}
		System.out.println("177의 배수의 개수: "+count+"개");
		
		//입력받은 정수까지의 팩토리얼 값을 구하세요.
		//팩토리얼) 5! -> 5 x 4 x 3 x 2 x 1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int num = sc.nextInt();
		int result = 1;
		System.out.print(num+ "! = ");
		for(int n =1; n<=num; n++) {
			System.out.print(n+"x");
			result *= n;
		}
		System.out.println("="+result);
	}
}
