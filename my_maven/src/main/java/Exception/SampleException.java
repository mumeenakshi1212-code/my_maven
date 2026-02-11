package Exception;

public class SampleException {
	
	public void display()
	{
		int a=10;
		int c=a/0;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SampleException ob=new SampleException();
		System.out.println("end of statemment");
		ob.display();
		
		
	}

}
