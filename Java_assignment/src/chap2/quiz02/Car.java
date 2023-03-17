package chap2.quiz02;

public class Car {

	
	private String model;
	private int speed;
	private char mode = 'P';
	private boolean start = false;
	
	public Car(String model) {
		this.model = model;
		System.out.println("모델명: " + this.model);
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed < 0 || speed > 200) {
			System.out.println("잘못된 속도 입니다.");
			return;
		}
		if(!start) {
			System.out.println("시동이 걸려있지 않은 상태라면 속도를 지정할 수 없습니다.");
			return;
		} 
		switch(mode) {
		case 'R' : 
			if(speed>40) {
				System.out.println("R모드는 속도를 40 초과해서 지정할 수 없습니다.");
				break;
			} 
			this.speed = speed;
			System.out.println("속도를 저장하였습니다.");
			System.out.printf("현재속도 %dkm\n",speed);
			break;
		case 'D' :
			this.speed = speed;
			System.out.println("속도를 저장하였습니다.");
			System.out.printf("현재속도 %dkm\n",speed);
			break;
		default : 
			System.out.println("D나 R모드가 아니라면 속도를 지정할 수 없습니다.");
		}
	}


	public char getMode() {
		return mode;
	}


	public void setMode(char mode) {
		switch(mode) {
		case 'P': case 'R': case 'N': case 'D':
			this.mode = mode;
			System.out.printf("%s 모드로 변경되었습니다.\n", mode);
			break;
		default :
			System.out.println("P,R,N,D 중 하나를 선택하세요");
		}
		
	}


	public boolean isStart() {
		return start;
	}


	public void setStart(boolean start) {
		this.start = start;
	}

	public void engineStart() {
		System.out.println("시동버튼을 눌렀습니다.");
		this.injectGasoline();
		this.injectOil();
		this.start = true;
		this.moveCylinder();
		System.out.println("시동이 걸렸습니다.");
	}
	private void injectGasoline() {
		System.out.println("연료가 엔진에 주입됩니다.");
	}
	private void injectOil() {
		System.out.println("엔진오일이 순환합니다.");
	}
	private void moveCylinder() {
		if(start) {
			System.out.println("실린더가 움직입니다.");
		} else {
			System.out.println("실린더가 움직이지 않습니다.");
		}
	}
	public void engineStop() {
		if(this.speed>0) {
			System.out.println("주행 중에는 시동을 끌 수 없습니다.");
			return;
		}
		if(mode != 'P') {
				System.out.println("P 모드로 변속기를 변경하세요.");
				return;
		}
		this.start = false;
		System.out.println("시동이 꺼졌습니다.");
	}
	
}
