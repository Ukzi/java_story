package test.ch07.poly;
//////////////////////////////추상클래스//////////////////////////////////
public abstract class Animal {
	//일반 메소드
	public void breathe() {
		System.out.println("숨을 쉽니다. 씁 하");
	}
	
	//추상 메소드 선언
	//추상 메소드는 자식클래스에서 반드시 오버라이딩이 되어야 한다.
	public abstract void sound();
}
