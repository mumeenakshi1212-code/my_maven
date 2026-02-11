package Abstraction;

public class AbsShapeMain extends AbstractShape {

	public void draw()
	{
		System.out.println("square");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbsShapeMain ob=new AbsShapeMain();
		ob.display();
		ob.draw();
		
	}

}
