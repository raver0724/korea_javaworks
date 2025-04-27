package bb;

public class BankAccount {
	private String ano;
	private String owner;
	private int balance;
	
	//생성자
	public BankAccount(String ano, String owner, int balance) {
		this.ano = ano;
		this.balance = balance;
		this.owner = owner;
	}
	
	//생성자(setter)
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	//접근자 getter
	public String getAno() {
		return ano;
	}
	
	public int getBalance() {
		return balance;
	}
		
		public String getOwner() {
			return owner;
		}
		

}
