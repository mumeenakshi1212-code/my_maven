package accessmodifier;

public class AccessSample1 {
 
	public int a=10;
	private String b="hi";
	protected char c='B';
    float d=2.5f;
    
    public void display()
    {
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println(c);
    	System.out.println(d);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessSample1 ob=new AccessSample1();
		ob.display();
		
	}

}
