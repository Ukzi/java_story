package test.ch09.local;

//중첩 클래스
public class ALocal {
	// 메소드
	void useB(int arg) { //== final int arg
		
		//함수 내부에서 쓰이는 로컬변수
		int var = 1; //== final int var = 1;
			var = 2;
			
		// 안에 클래스
		class B {
			// 인스턴스 필드
			int field1 = 1;

			// 생성자
			B() {
				System.out.println("B생성자 실행");
			}

			// 인스턴스 메소드
			void method1() {
				System.out.println("B메소드 실행");
			}
			
			void method2() {
				arg = 2; // final 이기때문에 불가
				var = 2; // final 이기때문에 불가
			}
		}
		// 메소드 안에서 객체 생성
		B b = new B(); // 생성자 실행
		System.out.println(b.field1); 
		b.method1(); //B메소드 실행
	}
}
