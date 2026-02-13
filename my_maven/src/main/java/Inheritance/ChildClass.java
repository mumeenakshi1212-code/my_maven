package Inheritance;

public class ChildClass extends ParentClass {
	
	 public void print()
	 {
		 System.out.println("child class method");
		}
	 public static void main(String args[])
	 {
		 ChildClass ob=new ChildClass();
		 ob.print();
		 ob.add();
		 System.out.println(ob.s);
	 }
}