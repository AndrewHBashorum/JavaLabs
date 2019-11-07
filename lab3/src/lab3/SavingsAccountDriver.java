package lab3;

public class SavingsAccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAcc saver1 = new SavingsAcc();
		saver1.setAccBalance(2000);
		
		
		SavingsAcc saver2 = new SavingsAcc(3000.00);
		
		
		SavingsAcc.modifyAnnualInterestRate(0.04f);
		
		saver1.calculateInterest();
		saver2.calculateInterest();
		
		System.out.println(saver1);
		System.out.println(saver2);
		
		SavingsAcc.modifyAnnualInterestRate(0.05f);
		
		saver1.calculateInterest();
		saver2.calculateInterest();
		
		System.out.println(saver1);
		System.out.println(saver2);
		
	}

}

