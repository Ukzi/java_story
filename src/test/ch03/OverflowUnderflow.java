package test.ch03;

public class OverflowUnderflow {

	public static void main(String[] args) {
		byte var1 = 125;
		// 오버플로우: 타입이 허용하는 최대값을 벗어나는 것

		for (int i = 0; i < 5; i++) {
			var1++;
			System.out.println("var1: " + var1);
		}

		byte var2 = -125;
		//언더플로우: 타입이 허용하는 최솟값을 벗어나는 것
		for (int i = 0; i < 5; i++) {
			var2--;
			System.out.println("var2: " + var2);
		}
	}

}