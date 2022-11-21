package test.ch06.question.last;

import java.util.Scanner;

public class BankApplication {
	private static Scanner scanner = new Scanner(System.in);
	
	//계좌 객체를 담을 배열(초기값 null)
	private static Account[] accountArray = new Account[100];
	//Account[] 를 넣은 이유는 Account 객체를 담으려고 (배열)
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택>");
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) createAccount();
			else if (selectNo == 2) accountList();
			else if (selectNo == 3) deposit();
			else if (selectNo == 4) withdraw();
			else if (selectNo == 5) run = false;
		}
		
		System.out.println("프로그램 종료.");
		
		
	}
			
	
	//1. 계좌 생성
	public static void createAccount() {
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");
		System.out.println("계좌번호");
		String ano = scanner.next();
		
		System.out.println("계좌주");
		String owner = scanner.next();
		
		System.out.println("초기입금액");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance); // 계좌 만듦
	
		for (int i=0; i<accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount; //생성한 계좌를 배열에 넣어준다.
				System.out.println("계좌가 생성되었습니다.");
				break;// 계좌를 넣고 for반복문을 끝낸다.
			}
			System.out.println(accountArray[i]);
		}
		
	}
	
	//2. 계좌 목록
	public static void accountList() {
		for (int i=0; i<accountArray.length; i++) {
			
		}
	}
	
	//3. 예금
	public static void deposit() {
		//계좌번호, 예금액 입력받기(scanner)
		//계좌번호로 계좌를 찾아야 한다.
		Account account = findAccount(ano); 호출  //hint
		//찾은계좌에 예금을 해준다.
		account.setBalance(account.getBalance()+ 예금액 );  //hint
	}
	
	//4. 출금
	public static void withdraw() {
		//계좌번호, 예금액 입력받기(scanner)
		//계좌번호로 계좌를 찾아야 한다.
		//찾은계좌에 출금을 해준다.
	}
	
	//5. 종료
	// accontArray 배열에서 ano와 동일한 Account 객체 찾는 역할 을 한다.
	private static Account findAccount(String ano) {
		Account account = null;
		//배열에다 객체를 다 넣어줬기 때문에 for문 이용
		for (int i=0; i<accountArray.length; i++) {
			if (accountArray[i] !=null) { //null이 아니라면 계좌가 있는것
				//불러온 계좌안에 있는 계좌번호와 매개변수로 받아온 계좌번호 ano가 같은지 체크
				String dbAno = accountArray[i].getAno(); //해당하는 객체에 계좌번호를 가져온다
				
				if (dbAno.equals(ano)) { //비교해서 계좌가 같다면
					account = accountArray[i];
					break;
				}
			}
		}
		
		return account;
	}
	

}
