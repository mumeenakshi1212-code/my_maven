package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class InterfaceSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List al=new ArrayList();//non generic 
		al.add("hello");
		al.add('H');
		al.add(55.5f);
		al.add(50);
		System.out.println(al);
		
		List <String> all =new ArrayList();//generic list
		all.add("mrng");
		all.add("how are u");
		all.add("have a nice day");
		System.out.println(all);
		
		
		List <String> al2 =new ArrayList();
		al2.add("welcome");
		al2.add("kerala");
		al2.add("gods own country");
		System.out.println(al2);
		
		al2.remove(1);
		System.out.println(al2);
		
		al2.addAll(al2);
		System.out.println(all);
		
		al.removeAll(all);
		System.out.println(al);
		
		//al2.get();
		System.out.println(al2.get(1));
		System.out.println(al2.size());
		
		boolean s=al2.contains("welcome");
		System.out.println(s);
		
		boolean s1=al2.contains("hello");
		System.out.println(s1);
		
		Iterator it=al2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		it.remove();
		System.out.println(al2);
		
		
		
		
	}

}
