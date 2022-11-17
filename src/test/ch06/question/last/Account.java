package test.ch06.question.last;

public class Account {
	//필드: 
	private String ano; //계좌번호
	private String owner; // 계좌주
	private int balance; // 잔고
	//private를 붙여주는 이유: 접근을 쉽게 하면 안됨 개인정보이기 떄문에
	//private을 사용할 때: getter setter함수를 사용해야함
	
	//생성자:
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	 
	//메소드:
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
