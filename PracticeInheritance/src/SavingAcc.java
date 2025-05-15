public class SavingAcc extends BankAccount{
	
	
	@Override
	public double deposite (double accBalance) {
		SavingAcc.accBalance+=accBalance;
		return SavingAcc.accBalance;
	}
	
	@Override
	public double withDrawal (double accBalance) {
		SavingAcc.accBalance -=accBalance;
		if (SavingAcc.accBalance < 1000){
			return 0.00;
		}
		return SavingAcc.accBalance;
		
	}
}
