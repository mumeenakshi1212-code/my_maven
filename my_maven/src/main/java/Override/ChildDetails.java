package Override;

public class ChildDetails extends ParentDetails {

	public void display()
	{
		super.display();
		System.out.println("Computer Science");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildDetails ob=new ChildDetails();
		ob.display();
		ParentDetails ob1=new ParentDetails();
	}

}
