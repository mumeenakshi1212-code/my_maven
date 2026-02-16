package Exception;
//custom exception
public class SampleUser {
	
	public void test(int age) throws LicenceException
	{
		if(age<=18)
		{
			throw new LicenceException("not eligible");
		}else
		{
			System.out.println("eligible");
		}
	}

	public static void main(String[] args) throws LicenceException {
		// TODO Auto-generated method stub

		SampleUser ob=new SampleUser();
		ob.test(15);
		
	}

}
