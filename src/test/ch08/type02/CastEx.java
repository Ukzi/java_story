package test.ch08.type02;

public class CastEx {

	public static void main(String[] args) {
//		Vehicle vehicle = new Bus();  //자동 타입변환(형변환)
//		vehicle.run();
//		
//		// 강제 형변환
//		Bus bus = (Bus) vehicle;
//		bus.run();
//		bus.checkfare();
//	}
	
	Bus bus = new Bus();
	Taxi taxi = new Taxi();
	
	ride(taxi);
	ride(bus);
	}
	public static void ride(Vehicle vehicle) {
		//vehicle이 Bus의 객체를 가지고 있냐?
		//Vehicle vehicle = new bus();
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkfare();
		}
	}

}
