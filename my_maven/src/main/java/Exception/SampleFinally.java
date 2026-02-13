package Exception;

public class SampleFinally {
	
	public void display()
	{
		int a=10;
		try
		{
		int c=a/0;
		System.out.println(c);
		
        /*catch (Exception e)
		{
        	System.out.println("exception handled");
        	System.out.println(e);
		}*/
		}
		finally
		{
			System.out.println("finally");
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SampleFinally ob=new SampleFinally();
		ob.display();
		

	
	}

}
