package test.ch06;

public class Korea {
	//final 필드 (저장된 값들을 절대로 변경할 수 없다. 최종값.)
	//final 필드는 초기값을 무조건 줘야한다.(필드 선언시 주거나 혹은 생성자에서 줘야한다.)
	final String nation = "대한민국"; //"대한민국"이라는 초기값을 줌
	final String ssn;  //주민번호 초기값을 주지 않음
	
	//인스턴스 필드
	String name;
	
	//생성자------- class이름이랑 같게 
	Korea(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
