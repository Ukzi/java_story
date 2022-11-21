package test.ch07.package1;

public class B {
	// 메소드
	public void method() {
		A a = new A(); // A랑 B랑 같은 패키지에 있어 실행가능
		a.field = "1"; //o
		a.method();    //o
	}
}
