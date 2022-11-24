package test.ch08;

public class MultiInterfaceEx {

	public static void main(String[] args) {
		RemoteControl2 rc = new SmartTelevision();  //자동형변환
		rc.turnOn();
		rc.turenOff();
		
		Searchable searchable = new SmartTelevision();
		searchable.search("www.naver.com");
	}

}
