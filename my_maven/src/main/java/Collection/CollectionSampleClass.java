package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionSampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList();//non generic
		al.add("hello");
		al.add("hi");
		al.add(25);
		al.add('m');
		al.add(25.2f);
		System.out.println(al);
		
		ArrayList <String> all=new ArrayList();//generic list
		all.add("hi");
		all.add("mrng");
		all.add("have a nice day");
		System.out.println(all);
		
		
		ArrayList <String> al2=new ArrayList();//generic list
		al2.add("red");
		al2.add("blue");
		System.out.println(al2);
		
		al2.remove(1);//to remove
		System.out.println(al2);
		
		al2.addAll(all);//merge
		System.out.println(al2);
		
		al.removeAll(al);//non generic list
		System.out.println(al);
		
		//al2.get(1);
		System.out.println(al2.get(1));
		
		System.out.println(al2.size());
		
		boolean s=al2.contains("hi");
		System.out.println(s);
		
		boolean s1=al2.contains("hello");
		System.out.println(s1);
		
		Iterator it= al2.iterator();//iterated interface
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		it.remove();
		System.out.println(al2);
	}
	

}
