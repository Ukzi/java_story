package test.ch01_3;

public class Block {

	public static void main(String[] args) {
		int v1 = 15;
		
		//안에서는 바깥 변수에 접근 가능, 바깥에서는 안의 변수의 접근 불가능.
		if (v1 > 10) {
			int v2 = v1 - 10;
		}
		
//		int v3 = v1 + v2 +5;
		
//		
//		System.out.println("1" + "2");
//		System.out.println('A' + 'B');
//		System.out.println('1' + 2);
//		System.out.println('1' + '2');
//		System.out.println('J' + "ava");
		
//		byte byteValue = 10;
//		char charValue = 'A';
		
//		int intValue = byteValue; 
//		int intValue = charValue;
//		short shortValue = charValue; 
//		double doubleValue = byteValue;
		
//		int intValue = 10; 
//		char charValue = 'A'; 
//		double doubleValue = 5.7; 
//		String strValue = "A";
		
//		double var = (double) intValue; 
//		byte var = (byte) intValue; 
//		int var = (int) doubleValue; 
//		char var = (char) strValue;
		
//		byte byteValue = 10; 
//		float floatValue = 2.5F; 
//		double doubleValue = 2.5;
		
//		byte result = byteValue + byteValue; 
//		int result = 5 + byteValue; 
//		float result = 5 + floatValue; 
//		double result = 5 + doubleValue;
//		

//		String str = "5";
		
//		byte var1 = Byte.parseByte(str);
//		int var2 = Int.parseint(str);
//		float var3 = Float.parseFloat(str); 
//		double var4 = Double.parseDouble(str);
		
		System.out.printf("이름: %-6s\n","감자바"); //문자열s
		System.out.printf("이름: %d\n",25); //정수d
		System.out.printf("실수: %10.2f\n", 3.14); //실수f

		System.out.printf("정수출력1: %6d", 123); //정수 d
		System.out.printf("정수출력1: %d, 실수출력: %f", 123, 3.45); //정수 d



		
	}

}
