package test.ch08.type02;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void checkfare() {
		System.out.println("승차요금 체크.");
	}
}
