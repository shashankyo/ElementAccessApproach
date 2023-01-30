package accesselementusinglistIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Program {
private static final int size = 0;

public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	ListIterator litr = al.listIterator();
	while(litr.hasNext() == true)
	{
		System.out.println(litr.next()+ " ");
	}
	System.out.println("---------------");
	
	ListIterator litr1 = al.listIterator(size);
	while(litr1.hasPrevious() == true)
	{
		System.out.println(litr1.previous() + " ");
	}
	System.out.println("--------");
}
}
