package test.ch06.hyundai;

import test.ch06.hankook.SnowTire;
import test.ch06.kumho.AllSeasonTire;

public class Car {
	//다른 패키지에 있는 class는 반드시 패키지 import를 해줘야 한다.
	SnowTire snowT = new SnowTire();
	AllSeasonTire allT = new AllSeasonTire();
	Test test = new Test();
	//import 없이 사용하는 방법
	test.ch06.hankook.Tire tire1 = new test.ch06.hankook.Tire();
	
	
}
