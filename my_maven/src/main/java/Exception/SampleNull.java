package Exception;

public class SampleNull {
	
	public void display()
	{
		String a= null;
		try
		{
		System.out.println(a.length());
	}
		finally
		{
			System.out.println("finally");
		}
		/*catch (Exception e)
		{
			System.out.println("exception handled");
		}*/
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SampleNull ob=new SampleNull();
		ob.display();
	}

}
