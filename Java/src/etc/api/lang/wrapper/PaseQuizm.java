package etc.api.lang.wrapper;

import java.util.Scanner;

public class PaseQuizm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inPut;
		String gen;
		boolean flag = false;
		
outer: while(true) {
			System.out.print("주민등록번호를 입력하세요: ");
			inPut = sc.next();
			if(inPut.charAt(6) != '-') {
				System.out.println("주민등록번호는 하이픈을 포함시켜 주세요.");
				continue;
			}
			if(inPut.length() != 14) {
				System.out.println("주민등록번호는 13자리입니다.");
				continue;
			}
			
			switch(inPut.charAt(7)) {
			case '1': 
				gen = "남자";
				break outer;
			case '3':
				gen = "남자"; flag= true;
				break outer;
			case '2': 
				gen = "여자";
				break outer;
			case '4':
				gen = "여자"; flag=true;
				break outer;
			default: 
				System.out.println("뒷자리 첫번째 숫자는 1, 2, 3, 4중 하나여야 합니다.");
			}
			
		}
		
		int n1 = Integer.parseInt(inPut.substring(0,2));
		int n2 = Integer.parseInt(inPut.substring(2,4));
		int n3 = Integer.parseInt(inPut.substring(4,6));
		
		if(!flag) {
			System.out.printf("19%d년 %d월 %d일 %d세 %s입니다." 
					,n1, n2, n3, 123-n1, gen);
		} else {
		System.out.printf("20%d년 %d월 %d일 %d세 %s입니다." 
				,n1, n2, n3, 23-n1, gen);
		}
		sc.close();
	}

}
