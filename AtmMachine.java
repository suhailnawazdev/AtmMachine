import java.util.Scanner;

class AtmMachine

{
	public static void main(String args[])
	
	{
		int balance=100000,withdraw,deposit;
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
             
		{

			System.out.println("Automated Teller Machine");
			System.out.println("Choose 1 to withdraw");
			System.out.println("Choose 2 to Desposit");
			System.out.println("Choose 3 to Check Balance");
			System.out.println("Choose 4 to Exit");
			System.out.println("Choose the operation you want to perform");
			
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the Money to be Withdrawn");
			withdraw=sc.nextInt();
			
			if(balance >= withdraw)
				
			{
			  balance=balance-withdraw;
			  System.out.println("Please Collect Your Money");
			  
			}
			
			else
				
			{
				System.out.println("Insufficient Balance");
				
				
			}
			System.out.println("");
			
			break;
			
			case 2:
				
				System.out.println("Enter money to be deposited");
				
				deposit=sc.nextInt();
				
				balance = balance + deposit;
				
				System.out.println("Your Money has been sucessfully deposit");
				
				System.out.println("");
				
				break;
				
			case 3:
			
			System.out.println("Balance:"+balance);
				
				System.out.println("");
				
				break;
				
			case 4:
			
				System.exit(0);
				
			}
		}
	}
}
	
	

		