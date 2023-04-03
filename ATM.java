import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s, p = 1729, up = 0;
		int c = 1234, uc = 0;
		int balance = 200000, withdraw, deposit;
		System.out.println("Card Number : ");
		uc = sc.nextInt();
		System.out.println("Enter Your PIN : ");
		up = sc.nextInt();
		if (c == uc && p == up) {
			do {
				System.out.println("Automated Teller Machine");
				System.out.println("Welcome to ATM");
				System.out.println("1. for Withdraw");
				System.out.println("2. for Deposit");
				System.out.println("3. for Check Balance");
				System.out.println("4. for EXIT");
				System.out.print("Choose the operation : ");
				s = sc.nextInt();
				switch (s) {
					case 1:
						System.out.print("Enter money to be withdrawn:");
						withdraw = sc.nextInt();
						if (balance >= withdraw) {
							balance = balance - withdraw;
							System.out.println("Please collect your money");
						}
						else {
							System.out.println("Insufficient Balance");
						}
						System.out.println("");
						break;
					case 2:
						System.out.print("Enter money to be deposited:");
						deposit = sc.nextInt();
						balance = balance + deposit;
						System.out.println("Your Money has been successfully depsited");
						System.out.println("");
						break;
					case 3:
						System.out.println("Balance : " + balance);
						System.out.println("");
						break;
					default:
						System.out.println("Good_Bay");
				} // switch
			} while (s != 4);
		} else {
			System.out.println("Wrong card number and PIN");
		}
	} // main
} // class
