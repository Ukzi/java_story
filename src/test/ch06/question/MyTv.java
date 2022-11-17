package test.ch06.question;

public class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	boolean turnOnOff() {
		if(isPowerOn == true) {
			return false;
		} else {
			return true;
		}
	}
	
	void volumeUp() {
		// (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
	}


}
