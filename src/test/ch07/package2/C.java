package test.ch07.package2;

import test.ch07.package1.A;

public class C {
	A a = new A(); // A랑 C랑 다른 패키지에 있어 불가능
	a.field = "1"; //x
	a.method();    //x
}
