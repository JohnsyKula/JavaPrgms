package sruthi;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTopic {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		ArrayList<String> sl=new ArrayList<String>();
		sl.add("Johnsy");
		sl.add("Kulan");
	    al.add(101);
	    al.add(102);
	    al.add(103);
	    al.add(104);
	    al.addAll(2,sl);
//	    System.out.println( al.remove("Johnsy"));
//	    System.out.println( al.remove(2));
//	    for(int i=0;i<al.size();i++)
//	    {
//	    	System.out.println(al.get(i));
//	    }
//	    System.out.println("========");
//	    al.removeAll(sl);
//	    for(int i=0;i<al.size();i++)
//	    {
//	    	System.out.println(al.get(i));
//	    }
	    
	    System.out.println("Iterate through collection");
	    Iterator<Object> it = al.iterator();
	    while(it.hasNext())
	    {
	    	Object ele=it.next();
	    	if(ele.equals("Johnsy"))
	    	{
	    		it.remove();
	    	}
	    	else
	    		System.out.println(ele);
	    
	    }
	   
	}
}
