package test.ch06;

public class GetSet {
	private int speed;
	private boolean stop;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return; // 함수 끝냄
		} else {
			this.speed = speed;
		}
		
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if (stop == true) this.speed = 0;
	}
	
	
	
//	public int getSpeed() {
//		return this.speed;
//	}
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
		
}


