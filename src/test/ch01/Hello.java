package test.ch01;

public class Hello {

	public static void main(String[] args) {
		int var1 = 0b11011; // 2진수
		int var2 = 0206; //8진수
		int var3 = 365;  //10진수
		int var4 = 0xB3; //16진수
		long var5 = 1000000000000L;
		long var6 = 1000000000000l;
		char c1 = 'A'; //작은따옴표, 문자 1개
		char c2 = 65;		
		
		float var7	= 0.123124412514123f;
		double var8 = 0.123124412514123;
	
		double var9 = 3e6; // 3.0 * 10^6
		double var10 = 2e-3; // 2.0 * 10^-3
		double var11 = 3e6f; // 3.0 * 10^6
		
//		String name="이름"
//		String one="A"
//		System.out.println(name);
		
		
		
		
//		System.out.println(var1 + ":" + var2 + ":" + var3 + ":" + var4 + ":" + var5 + ":" + var6);
//		System.out.println(c1 + "," + c2);
		System.out.println(var7 + ":" + var8 + ":" + var9 + ":" + var10 + ":" + var11);
	}

}
