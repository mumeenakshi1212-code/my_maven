package Exception;

public class ThrowSample {
	
	public static void display(int number)
	{
		if (number<23)
		{
			throw new ArithmeticException("invalid number");
		}
		else
		{
			System.out.println("valid number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowSample.display(0);
		
	}

}
