package Exception;

public class BankAccount {

	public void display(int salary) throws SalaryException
	{
		if(salary<=10000)
		{
			throw new SalaryException ("withdrawl");
		}else
		{
			System.out.println("credited");
		}
	}
	public static void main(String[] args) throws SalaryException {
		// TODO Auto-generated method stub

		BankAccount ob=new BankAccount();
		ob.display(0);
		
	}

}
