package test.ch06;

public class Calculator {
	// 메소드 오버로딩: 같은 이름의 메소드 여러개를 만든다.
	// ★매개변수의 순서, 갯수, 타입 중 하나가 달라야 한다.

	double areaRectangle(double width) { //정사각형의 넓이
		return width * width;
	}

	double areaRectangle(double width, double height) { //직사각형의 넓이
		return width * height;
	}

//	//리턴값이 없는 메소드 선언
//	void powerOn() {
//		System.out.println("전원을 켭니다.");
////		return;
//	}
//	// 리턴값이 없는 메소드
//	void powerOff() {
//		System.out.println("전원을 켭니다.");
////		return;
//	}
//	
//	//int형으로 리턴값이 있는 메소드
//	int plus(int x, int y) {
//		int result = x + y;
//		return result;
//	}
//	
//	//double형으로 리턴값이 있는 메소드
//	double divide(int x, int y) {
//		double result2 = (double)x / (double)y;
//		return result2;
//	}

}
