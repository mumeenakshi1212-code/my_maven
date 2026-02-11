package Interface;

public class SampleClass implements InterfaceSample {

	public void print()
	{
		System.out.println("method of class");
	}
	public void add()
	{
		System.out.println(a+b);
	}
	public void display()
	{
		System.out.println("method in interface");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SampleClass ob= new SampleClass();
		ob.display();
		ob.add();
		ob.print();
		System.out.println(ob.a);
		
		InterfaceSample ob1=new SampleClass();
		//ob.print();
		ob.add();
		ob.display();
		System.out.println(ob1.a);
	}

}

