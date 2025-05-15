public class BankAccount {
	static double accBalance;
	public double deposite (double accBalance){
		BankAccount.accBalance += accBalance;
		System.out.print("Total balance in account ending with ***5656 is ");
		return BankAccount.accBalance;
	}
	public double withDrawal (double accBalance){
		if (BankAccount.accBalance <= 0){
			return 0;
		}
		BankAccount.accBalance -= accBalance;
		System.out.print ("Withdrawal from acc is "+  accBalance +" Remaining balance is ");
		return BankAccount.accBalance;
	}
	public void remainingBalance (){
		System.out.println ("Remaining balance in your acc is " + BankAccount.accBalance);
	}
}
