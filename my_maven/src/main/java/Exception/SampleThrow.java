package Exception;

public class SampleThrow {

	public static void display(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("not eligible");
		
	}else
	{
		System.out.println("eligible");
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SampleThrow.display(16);
	}

}
