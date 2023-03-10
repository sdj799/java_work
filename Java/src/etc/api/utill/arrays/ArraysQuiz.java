package etc.api.utill.arrays;

public class ArraysQuiz {
	
	public static String solution(String[] participant, String[] completion) {
		
		/*
        - 참가한 사람의 이름이 담긴 배열 participant와
        완주한 사람의 이름이 담긴 배열 completion이 주어질 때
        완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
        완주하지 못한 자는 1명이라고 가정합니다.
        */
		String name = null;
		for (int i = 0; i < participant.length; i++) {
			int count = 0;
			
			for (int j = 0; j < i; j++) {
				if(participant[i].equals(completion[j])) {
					count++;
				}
			}
			if(count == 0) {
				name = participant[i];
			} 
			
		} 
		return name;
		
		
		
		
	}

	public static void main(String[] args) {

		String[] participant = {"홍길동", "김길동", "김철수", "최철수", "박영희"};//참가자
		String[] completion = {"홍길동", "김길동", "박영희", "김철수"};//완주자
		
		
		System.out.println("완주하지 못한 사람: " + solution(participant, completion));
		
	}

}
