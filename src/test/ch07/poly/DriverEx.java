package test.ch07.poly;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();// Driver 객체를 생성한다.
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Vehicle vehicle = new Vehicle();
		driver.drive(taxi); // Driver객체의 drive 함수에 taxi 객체를 매개변수로 준다.
		driver.drive(bus);
		driver.drive(vehicle);

	}

}
