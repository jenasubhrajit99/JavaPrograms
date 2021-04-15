import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterationVsListIterator_Ex {
//	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
//		for(int i=0; i<=100; i++)
//		{
//			al.add(i);
//		}
//		System.out.println("Elements in array is : "+al);
//		Iterator it = al.iterator();
//		while(it.hasNext())
//		{
//			Integer i = (Integer) it.next();
//			if(i%2!=0)
//			{
//				it.remove();
//			}
//			
//		}
//		System.out.println("The Even numbers are :"+al);
//	}
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Subhrajit");
		list.add("Jena");
		list.add("Jeet");
		list.add("Sup");
		System.out.println("Elements are :"+list);
		System.out.println();
		ListIterator litr = list.listIterator();
		while(litr.hasNext())
		{
			String s = (String) litr.next();
			if(s.equals("Subhrajit"))
			{
				litr.set("Saurav");
			}
			else if(s.equals("Jena"))
			{
				litr.add("Bahera");
			}
			else if(s.equals("Jeet"))
			{
				litr.remove();
			}
		}
		System.out.println("The Elements after is :"+list);
	}
	
	
}
