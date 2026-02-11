package Override;

public class ChildOverride extends ParentOverride {
	
	@Override
	public void display()
	{
		super.display();
		System.out.println("method in child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildOverride ob=new ChildOverride();
		ob.display();
		 ParentOverride ob1=new ParentOverride();
		
	}

}
