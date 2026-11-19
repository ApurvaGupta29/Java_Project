package Interfaces;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Interface {

	public static void main(String[] args) {
	Set<String> s1= 	new HashSet<String>();//no indexing , no order
	s1.add("Hey");
	s1.add("I");
	s1.add("Love");
	s1.add("You");
	s1.add("Girl");
	
System.out.println(s1);
s1.remove("Hey");
System.out.println(s1);
Iterator<String>i1=s1.iterator();
while(i1.hasNext())
{
	System.out.println(i1.next());
}
	}

}
