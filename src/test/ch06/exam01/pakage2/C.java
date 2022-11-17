package test.ch06.exam01.pakage2;

import test.ch06.exam01.pakage1.A;
//import test.ch06.exam01.pakage1.A;
import test.ch06.exam01.pakage1.B;

public class C {
	public C() {
		A a = new A();
		
		a.field1 = 1; //o
		a.field2 = 1; //x => default(같은 패키지 안에서만 가능)
		a.field3 = 1; //x => private(같은 클래스 안에서만 가능)
		a.method1(); //o
		a.method2(); //x
		a.method3(); //x
	}
}
