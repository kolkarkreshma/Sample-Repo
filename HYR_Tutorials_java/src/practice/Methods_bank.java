package practice;

/**
 * @author Rafi
 * 
 * Part_15
 */
public class Methods_bank {
	
	static  int currentbalance=1000;
	
	public static void greetCustomer() {
		System.out.println("Hello, Welcome to the banking application");
	}
	
	public void deposit(int amount) {
		 currentbalance= currentbalance+amount;
		 System.out.println("Amount is deposited sucessfully");
		
		
	}
	
	public static void withdrawal(int amount) {
		 currentbalance= currentbalance-amount;
		 System.out.println("Amount is withdrawn sucessfully");
		
	}
	public int getCurrentbalance() {
		return   currentbalance;
	}
	
	public static void main(String[] args) {
		Methods_bank   mb=new  Methods_bank();
		greetCustomer();
		System.out.println("current balance is : "+mb.getCurrentbalance());
		mb.deposit(500);
		System.out.println("current balance is : "+mb.getCurrentbalance());
		withdrawal(300);
		System.out.println("current balance is : "+mb.getCurrentbalance());
		
	}

}
