package test.ch06;

public class KoreaEx {

	public static void main(String[] args) {
		 Korea k1 = new Korea("123456-1234567", "하남자");
		 
		 System.out.println(k1.name);
		 System.out.println(k1.nation);
		 System.out.println(k1.ssn);
		 
		 k1.name = "하리보";
		 System.out.println(k1.name);


	}

}