import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		//create an object
		ATMOperationInterf op = new ATMOperationImpl();
		
		//hardcoding
		int atmnumber=12345;
		int atmpin=123;

		//check if user enters the above details
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to ATM Machine!");
		System.out.println("Enter ATM Number: ");
		int Number =  in.nextInt();
		System.out.println("Enter Pin: ");
		int Pin = in.nextInt();
		if((atmnumber == Number)&&(atmpin == Pin)) {
			//System.out.println("Validation Done!");
			while(true) {            //menu
				System.out.println("1. View Avaliable Balance\n2. Withdraw Amount\n"
						+"3. Deposit Amount\n4.View Mini Statement\n5.Exit");
				System.out.println("Enter Choice: ");
				int ch = in.nextInt();
				if(ch==1) {
					op.viewBalance();
				}
				else if(ch==2) {
					System.out.println("Enter amount to withdraw: ");
					double withdrawAmount = in.nextDouble();
					op.withdrawAmount(withdrawAmount);
				}	
				else if(ch==3) {
					System.out.println("Enter amount to deposit: ");
					double depositAmount = in.nextDouble(); 
					op.depositAmount(depositAmount);
				}
				else if(ch==4) {
					op.viewMiniStatement();
				}	
				else if(ch==5) {
					System.out.println("Collect your ATM Card\nThank you for using ATM MAchine!");
					System.exit(0);
				}
				else {
					System.out.println("Please enter correct choice");
				}
					
			}
		}
		else {
			System.out.println("Incorrect ATM Number or Pin");
			System.exit(0);      //exit from the application
		}
	}

}
