package test.ch02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("x값 입력: ");
		String strX = scanner.nextLine(); /// enter키를 누르면 문자열을 읽는다.
		int x = Integer.parseInt(strX);

		System.out.println("y값 입력: ");
		String strY = scanner.nextLine(); /// enter키를 누르면 문자열을 읽는다.
		int y = Integer.parseInt(strY);

		int result = x + y;
		System.out.println("result: " + result);
		System.out.println();

		while (true) {
			System.out.println("입력 문자열: ");
			String data = scanner.nextLine();
			// 입력받은 데이터가 q인가?
			if (data.equals("q")) { /// equals === 랑 같다
				break;
			}

			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");
	}

}
