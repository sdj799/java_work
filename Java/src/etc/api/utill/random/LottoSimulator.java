package etc.api.utill.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {

	static Random r = new Random();

	static int prize1 = 0; //1등 당첨 횟수를 세 줄 변수
	static int prize2 = 0; //2등 당첨 횟수를 세 줄 변수
	static int prize3 = 0; //3등 당첨 횟수를 세 줄 변수
	static int prize4 = 0; //4등 당첨 횟수를 세 줄 변수
	static int prize5 = 0; //5등 당첨 횟수를 세 줄 변수
	static int failCnt = 0; //꽝 당첨 횟수를 세 줄 변수

	public static Set<Integer> createLotto() {
		/*
		 - 1~45 범위의 난수 6개를 생성하셔서
		 컬렉션 자료형에 모아서 리턴해 주세요.
		 무엇을 쓰든 상관하지 않겠습니다.
		 중복이 발생하면 안됩니다.
		 */
		Set<Integer> lotto = new HashSet<>();
		while(lotto.size() < 6) {
			int rn = r.nextInt(45) + 1;
			lotto.add(rn);
		}
		
		return lotto;

	}
	//보너스 번호를 생성하는 메서드
	public static int createBonusNum(Set<Integer> win) {
		/*
			 - 매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후
			 당첨번호를 피해서 보너스번호 하나만 뽑아 주세요.
			 범위는 1 ~ 45 사이의 난수입니다.
		 */
		List<Integer> list = new ArrayList<>(win);
		while(true) {
			int bonus = r.nextInt(45) + 1;
			if(!list.contains(bonus)) {
				return bonus;
			}
		}
	}

	//당첨 등수를 알려주는 메서드
	public static void checkLottoNumber(Set<Integer> win, Set<Integer> myLotto
			,int bonus) {
		/*
			 매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스번호를 받습니다.
			 내 로또 번호와 당첨번호를 비교하여
			 일치하는 횟수를 세 주신 후 등수를 판단하세요.
			 판단된 등수에 해당하는 static 변수의 값을 올려주시면 됩니다.
			 6개 일치 -> 1등
			 5개 일치 + 보너스번호 일치 -> 2등
			 5개 일치 -> 3등
			 4개 일치 -> 4등
			 3개 일치 -> 5등
			 나머지 -> 꽝
		 */
		int count = 0;
		/*
		for(int n : myLotto) {
			for(int w : win) {
				if(n == w) {
					count++;
					break;
				}
			}
		}
		*/
		
		for(int n : myLotto) {
			if(win.contains(n)) count++;
		}
		if(count == 6) prize1++;
		else if(count == 5) {
			if(myLotto.contains(bonus)) prize2++;
			else prize3++;
		} else if(count == 4) prize4++;
		else if(count == 3) prize5++;
		else failCnt++;

	}



	public static void main(String[] args) {

		//당첨 번호 생성 메서드를 호출해서 당첨 번호를 하나 고정시키세요.
		Set<Integer> win = createLotto();
		
		//보너스번호도 하나 고정시키세요.
		int bonus =  createBonusNum(win);

		/*
		 - 1등이 당첨 될 때까지 반복문을 돌립니다.
		 - 1등이 당첨 된다면, 1등이 되기까지 누적 당첨 횟수를 출력하고
		 반복문을 종료합니다.
		 - 로또를 구매하기 위한 금액도 출력하세요. (long)
		 */
		int paper = 0;
		while(true) {
			Set<Integer> myLotto = createLotto();
			paper++;
			checkLottoNumber(myLotto, win, bonus);
			
			if(prize1 == 1) {
				System.out.println("***********************");
				System.out.println("1등에 당첨되었습니다!");
				System.out.println("1등에 당첨되기까지의 누적 당첨 현황");
				System.out.println("2등: " + prize2 + "회");
				System.out.println("3등: " + prize3 + "회");
				System.out.println("4등: " + prize4 + "회");
				System.out.println("5등: " + prize5 + "회");
				System.out.println("꽝: " + failCnt + "회");
				System.out.println("---------------------------");
				System.out.println("1등 한번 되려고 당신이 쓴 금액: " + paper*1000L + "원");
				break;
			} else {
				System.out.println("로또 " + paper + "장 째 구매 중...");
			}
		}


	}

}
