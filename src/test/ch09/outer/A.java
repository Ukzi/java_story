package test.ch09.outer;

public class A {
	//A클래스의 인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	//A클래스의 정적 필드와 메소드
	static int field2;
	static void method2() {}
		
	//인스턴스 멤버 클래스
	class B {
		void method() {
			field1 = 10; // 인스턴스 필드 접근가능 o
			method1();   // 인스턴스 메소드 접근가능 o
			
			field2 = 20; // 정적 필드 접근가능 o
			method2();   // 정적 메소드 접근가능 o
		}
	}
	
	//정적 멤버 클래스
	static class C {
		void method() {
		//정적 멤버 클래스에서는 바깥 클래스의 인스턴스 필드와 메소드에 접근 할 수가 없다.
		field1 = 10; // 인스턴스 필드 접근 x
		method1();   // 인스턴스 메소드 접근 x
		
		field2 = 20; // 정적 필드 접근가능 o
		method2();   // 정적 메소드 접근가능 o
		}
	}
}
