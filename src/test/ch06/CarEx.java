package test.ch06;

public class CarEx {

	public static void main(String[] args) {
		//1.객체 생성
		//주석추가
		Car myCar = new Car("그랜저", "검정", 250);
		
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		
		
		myCar.speed = 60; //필드 값 변경
		System.out.println("수정된 값:" + myCar.speed);
		
		Car car2 = new Car("자가용", "은색");
		System.out.println(myCar.model);
		System.out.println("=================");
		
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println("=================");
		
//		Car car2 = new Car("자가용");
	}

}
