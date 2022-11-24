package test.ch10;

public class ExceptionEx1 {

	public static void printLength(String data) {
		try { // 실행시킬 코드를 작성
			int result = data.length(); // 문자 개수를 뽑아오는 것
			System.out.println("문자 수: " + result);
		} catch (NullPointerException e) { // 에러가 났을 때 실행시킬 코드를 작성
			System.out.println(e.getMessage()); //예외 발생 이유 만 리턴
//			System.out.println(e.toString()); // 예외 발생 이유 + 예외의 종류 리턴
//			e.printStackTrace(); // 예외 발생 이유 + 예외의 종류 리턴 + 예외 발생한 곳 출력
		} finally { // finally: 옵셔널하다. 마지막에 무조건 실행 되는 코드
			System.out.println("마무리 실행\n");
		}
	}

	public static void main(String[] args) {
		System.out.println("프로그램 시작\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("프로그램 종료\n");
	}

}
