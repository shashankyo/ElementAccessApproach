package acesselementusingiterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Program {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	Iterator itr = al.iterator();
	for(int i=0;i<=al.size()-1;i++)
	{
		if(itr.hasNext() == true)
		{
			System.out.println(itr.next());
		}
	}
	System.out.println("------------");
}
}
