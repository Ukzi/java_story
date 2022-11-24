package test.ch08;

public class SmartTelevision implements RemoteControl2, Searchable{

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");		
	}

	@Override
	public void turenOff() {
		System.out.println("TV를 끕니다.");				
	}
	
}
