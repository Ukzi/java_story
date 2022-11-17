package test.ch06.question;

public class Example1 {

	public static boolean isNumber(String str) {
		//주어진 문자열이 null이거나 빈문자열""이라면 false를 반환한다.
		if (str == null || str.equals("")) //String은 ==대신 .equals 사용
			return false;
		//주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
		//모두 숫자로만 이루어져 있으면 true를 반환하고, 그렇지 않으면 false를 반환한다.
	
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println("값: " + ch);
			
			if(ch <'0' || ch > '9') { //숫자가 아님.		
			 	return false;
		    }
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));

	}

}
