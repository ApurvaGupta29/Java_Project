package Interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Interface {

	public static void main(String[] args) {
	List<String> l1=	new ArrayList<String>();
l1.add("apurva");
l1.add("Abhishek");
l1.add("Kartik");
System.out.println(l1);

Iterator<String>i1=l1.iterator();
while(i1.hasNext())
{
	System.out.println(i1.next());
}
ListIterator<String>i2=l1.listIterator();
while(i2.hasNext())
{
	System.out.println(i2.next());
}
while(i2.hasPrevious())
{
	System.out.println(i2.previous());
}
	}

}
