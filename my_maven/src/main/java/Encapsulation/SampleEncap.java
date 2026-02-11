package Encapsulation;

public class SampleEncap {
	
	private int number;
	private String name;
	private int mark;
	
	
	public void setter(String name,int numebr, int mark)
	{
	
	this.name=name;
	this.mark=mark;
	this.number=number;
	}
	
	public void getter()
	{
		System.out.println(name);
		System.out.println(number);
		int bonus=100;
		mark=bonus+mark;
		System.out.println(mark);
	}
	

}


