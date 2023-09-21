package Day8;

import java.util.HashMap;
import java.util.Scanner;

public class BankAccount {
	
	private static final double DEFAULT_INTEREST = 0.15;
	
	private static double interestRate = DEFAULT_INTEREST;
	private static int bankAccountCount = 0;
	
	private static int id;
	private static double balance;
	
	public BankAccount () {
		BankAccount.id =  ++bankAccountCount;
		System.out.println("Account #" + BankAccount.id + " created");
	}
	
	public static double setInterestRate(double rate) {
		return BankAccount.interestRate = rate;
		
	}
	
	public int getId () {
		return BankAccount.id;
	}
	
	public double calcInterest (int months) {
		return BankAccount.balance * BankAccount.interestRate * months / 12;
		
	}
	
	public void deposit (double amount) {
		BankAccount.balance += amount;
		System.out.println("Deposited " + amount + " to account #" + BankAccount.id); // sambung sini
	}
	
	public static void main(String[] args) {
		
		HashMap<Integer, BankAccount> accounts = new HashMap<>();
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			String command = scanner.nextLine();
			String[] opt = command.split(" ");
			
			switch (opt[0]) {
			
				case "create": 
					BankAccount account = new BankAccount();
	                accounts.put(account.getId(), account);
	                break;
	            
				case "deposit": 
			
						  if (accounts.containsKey(Integer.parseInt(opt[1]))) {
							  BankAccount acc = accounts.get(Integer.parseInt(opt[1]));
							  acc.deposit(Double.parseDouble(opt[2]));
							  break;
						  }
							  
						  

						  else 
							  System.out.println("Account not found");
						
					break;
				
				case "set-interest":
					double interestRate = BankAccount.setInterestRate(Double.parseDouble(opt[1]));
					System.out.printf("Interest rate changed: %.2f%n", interestRate);
					break;
					
				case "calc-interest":
					double interestTotal = 0;
					
					for (int id : accounts.keySet()) {
						  BankAccount acc = accounts.get(id);
						  
						  if (acc.getId() == Integer.parseInt(opt[1])) {
							  	interestTotal = acc.calcInterest(Integer.parseInt(opt[2]));
								break;
							}
						  
						  else 
							  System.out.println("Account not found");
						}
						System.out.printf("Interest: %.2f%n", interestTotal);
						break;
					
				
					
				case "end":
					System.out.println("Program terminated");
					break;
			
		}
	}
}

}
