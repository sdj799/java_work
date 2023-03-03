package oop.string;

import java.util.Scanner;

public class StringQuiz02m {

	public static void main(String[] args) {
		
		/*
		 1. 주민등록번호 13자리를 입력받습니다.
		 2. 주민등록번호 -을 포함해서 받을 예정입니다.
		 3. 13자리가 아니라면 다시 입력받습니다.
		 4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("주민등록번호입력: ");
			String idNum = sc.next();
			idNum = idNum.replace("-", "");
			char gen = idNum.charAt(6);
			
			if(idNum.length()!= 13) {
				System.out.println("(-)포함 13자리를 입력하세요!");
			} else if(gen == '1' || gen == '3') { //char는 ==으로 비교가능
				System.out.println("남자입니다.");  // ''로 비교
				break;
			} else if(gen == '2' || gen == '4') {
				System.out.println("여자입니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		sc.close();
	}
}
