package Interface;

public class SamClassInterface implements SampleInterface {

	public void shape()
	{
		System.out.println();
	}
	public void area()
	{
		System.out.println(length*breadth);
	}
    public void draw()
    {
    	System.out.println("draw a rectangle");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SamClassInterface ob=new SamClassInterface();
		ob.draw();
		ob.area();
		ob.shape();
		
		
	}

}
