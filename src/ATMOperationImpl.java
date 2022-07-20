import java.util.HashMap;
import java.util.Map;

public class ATMOperationImpl implements ATMOperationInterf{

	//creating object of ATM class
	ATM atm = new ATM();
	
	//hashmap
	Map<Double, String> ministmt=new HashMap<>();
	
	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available Balance: "+atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		// TODO Auto-generated method stub
		if((withdrawAmount%500)==0) {
			if(withdrawAmount<=atm.getBalance())
			{
				ministmt.put(withdrawAmount, "Amount withdrawn");
				System.out.println("Collect the cash "+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				viewBalance();
			}
			else {
				System.out.println("Insufficient Balance");
			}
		}
		else {
			System.out.println("Please enter the amount in multiple of 500");
		}
	}
	@Override
	public void depositAmount(double depositAmount) {
		// TODO Auto-generated method stub
		ministmt.put(depositAmount, "Amount deposited");
		System.out.println(depositAmount+" Deposited Successfully!");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		// TODO Auto-generated method stub
		for(Map.Entry<Double,String> m:ministmt.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
