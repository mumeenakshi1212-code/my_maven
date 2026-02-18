package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ll=new LinkedList();// non generic
		ll.add("India");
		ll.add(1974);
		ll.add('I');
		ll.add(19.74f);
		System.out.println(ll);
		
		LinkedList ll1 =new LinkedList();//generic list
		ll1.add("India");
		ll1.add("Independence");
		ll1.add("Republic");
		ll1.add("kerala");
		System.out.println(ll1);
		
		LinkedList ll2=new LinkedList();//generic list
		ll2.add("Idukki");
		ll2.add("ernklm");
		ll2.add("kollam");
		ll2.add("tvm");
		System.out.println(ll2);
		
		ll2.remove(2);
		System.out.println(ll2);
		
		ll2.addAll(ll1);
		System.out.println(ll1);
		
		ll.removeAll(ll);
		System.out.println(ll);
		
		//ll2.get();
		System.out.println((ll2.get(2)));
		
		System.out.println(ll2.size());
		
		boolean s=ll2.contains("tvm");
		System.out.println(s);
		
		boolean s1=ll2.contains("hi");
		System.out.println(s1);
		
		Iterator it=ll2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(ll2);
		
	}

}
