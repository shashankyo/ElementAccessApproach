package arrayelementusingdesendingiterator;

import java.util.Iterator;
import java.util.LinkedList;

public class Program {
public static void main(String[] args) {
	LinkedList al = new LinkedList();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	Iterator ditr = al.descendingIterator();
	while(ditr.hasNext() == true)
	{
		System.out.println(ditr.next()+ " ");
	}
	
}
}
