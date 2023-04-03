import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s, p = 1729, up = 0,c = 1234, uc = 0,temp,nw;
		int balance = 200000, withdraw, deposit;
		System.out.println("****** Welcome To The Bank of KNIT'S ******");
		System.out.println("       Please Enter Your Card detail");

		System.out.println("Card Number : ");
		uc = sc.nextInt();
		System.out.println("Enter Your PIN : ");
		up = sc.nextInt();

		if (c == uc && p == up){
		System.out.println("Do You want to Change Your PIN Y/N : ");
		char ch= sc.next().charAt(0); 
		if(ch=='Y'){
			System.out.print("Enter Your New 4 digit PIN : ");
			nw=sc.nextInt();
			temp=p;
			p=nw;
			temp=0;
			System.out.println("PIN Change Successfully..");
			System.out.println("Re-Enter Your Card Detail...");
			System.out.println("Card Number : ");
		    uc = sc.nextInt();
		    System.out.println("Enter Your PIN : ");
		    up = sc.nextInt();
		}
	     }
		if (c == uc && p == up){
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
			}while(s!=4);
		} else {
			System.out.println("Wrong card number and PIN");
		}
	} // main
} // class



/* output

****** Welcome To The Bank of KNIT'S ******
       Please Enter Your Card detail
Card Number : 
1234
Enter Your PIN : 
1729
Do You want to Change Your PIN Y/N : 
Y
Enter Your New 4 digit PIN : 3344
PIN Change Successfully..
Re-Enter Your Card Detail...
Card Number :
1234
Enter Your PIN : 
3344
Automated Teller Machine
Welcome to ATM
1. for Withdraw
2. for Deposit
3. for Check Balance
4. for EXIT
Choose the operation : 3
Balance : 200000

Automated Teller Machine
Welcome to ATM
1. for Withdraw
2. for Deposit
3. for Check Balance
4. for EXIT
Choose the operation : 1
Enter money to be withdrawn:2000 
Please collect your money

Automated Teller Machine 
Welcome to ATM
1. for Withdraw
2. for Deposit
3. for Check Balance     
4. for EXIT
Choose the operation : 3 
Balance : 198000        

Automated Teller Machine
Welcome to ATM
1. for Withdraw
2. for Deposit
3. for Check Balance    
4. for EXIT
Choose the operation : 2
Enter money to be deposited:2000
Your Money has been successfully depsited

Automated Teller Machine
Welcome to ATM
1. for Withdraw
2. for Deposit
3. for Check Balance
4. for EXIT
Choose the operation : 3
Balance : 200000

Automated Teller Machine
Welcome to ATM
1. for Withdraw
2. for Deposit
3. for Check Balance
4. for EXIT
Choose the operation : 4
Good_Bay
*/
