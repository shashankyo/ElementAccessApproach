package copyonwritearraylist;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Program {
public static void main(String[] args) {
CopyOnWriteArrayList al = new CopyOnWriteArrayList();
al.add(10);
al.add(20);
al.add(30);
al.add(40);
al.add(50);
Iterator itr =  al.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next() + " ");
	al.add(90);
}
}
}
