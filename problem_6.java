import java.util.Scanner;

class BankAccount {
	int acno;
	double balance;
	String name;

	BankAccount(String acc_name,int ac_no) {

		name = acc_name;
		acno = ac_no;
		balance = 0.00;
		

	}
	
	void depositCash(double depo) {

		if(depo > 0) {
			balance += depo;
			System.out.println(" ");
			System.out.println("Amount Deposite :- " + depo);
			System.out.println("Current Balance :- " + balance);
			System.out.println(" ");
		}
		else {
			System.out.println(" ");
			System.out.print("Ivalid Amount");
			System.out.println(" ");
		}

	}	

	void printBalance() {

		System.out.println(" ");
		System.out.println("Current Balance :- " + balance);
		System.out.println("-----------------------");
		System.out.println(" ");
	}

	void printDetails() {

		System.out.println(" ");
		System.out.println("Account Details");
		System.out.println("---------------");
		System.out.println("Account Number :- " + acno);
		System.out.println("Account Name :- " + name);
		System.out.println("Account Balace :-" + balance);
		System.out.println(" ");
	}
}

class Bank {
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		BankAccount account = null;
		System.out.println(" ");
		System.out.println("Welcome To S.H.I.E.L.D. Finance");
		System.out.println("--------------------------------");
		System.out.println("Strategic Holdings for Investment, Efficiency, and Long-term Development");


		while (true) {
			System.out.println("\nOptions:");
            System.out.println("1. Create New Account");
            System.out.println("2. Deposit");
            System.out.println("3. Print Balance");
            System.out.println("4. Print Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int n = scanner.nextInt();
			scanner.nextLine();
		

			switch(n) {
				case 1: 

						System.out.println(" ");
						System.out.print("Enter your Name :- ");
						String user_name = scanner.nextLine();
						System.out.print("Enter your Account Number :- ");
						int acc_no = scanner.nextInt();
						account = new BankAccount(user_name, acc_no);
						break;

				case 2: 

						if (account != null) {
							System.out.println(" ");
							System.out.print("Enter the amount to deposit: ");
							double depo = scanner.nextDouble();
							account.depositCash(depo);
						} else {
							System.out.println("Please create an account first.");
						}
						break;

				case 3: 
				
						if (account != null) {
							account.printBalance();
						} else {
							System.out.println("Please create an account first.");
						}
						break;

				case 4: 
				
						if (account != null) {
							account.printDetails();
						} else {
							System.out.println("Please create an account first.");
						}
						break;

				case 5:
						System.out.println(" ");
						System.out.println("Thank you and have a great day !!!!");
						System.out.println("------------------------------------");
                    	System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");		
			}
		}	
	}	
}


