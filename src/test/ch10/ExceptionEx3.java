package test.ch10;

public class ExceptionEx3 {

	public static void main(String[] args) {
		String[] array = {"100", "1oo", null, "200"};
		
		for (int i=0; i<=  array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]); //int 형 데이터로 형변환
				System.out.println("array[" + i + "]: " + value);
			} catch(ArrayIndexOutOfBoundsException e ) { // ctrl + space 단축키로 선택
				e.printStackTrace();
			} catch(NullPointerException | NumberFormatException e) {
				System.out.println("데이터에 문제가 있음: " + e.getMessage());
			}
		}
	}
}
