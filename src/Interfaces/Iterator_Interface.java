package Interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_Interface {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
        a1.add(90);
        a1.add(67);
        a1.add(95);
        a1.add(76);
        a1.add(98);
        System.out.println(a1);
Iterator<Integer> i1 =a1.iterator();

while(i1.hasNext()) 
{
	
	System.out.println(i1.next());
}


System.out.println("Iteration in forward direction");

ListIterator<Integer> i2= a1.listIterator();//cursor in java
/*
 
 */

while(i2.hasNext())
{
	System.out.println(i2.next());
}
System.out.println("Iteration in backward direction");
while(i2.hasPrevious()) {
	System.out.println(i2.previous());
}
	}

}
