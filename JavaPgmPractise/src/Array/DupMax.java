package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DupMax {
	 public static void main(String[] args)
	 {
	   int[] a={3,2,5,3,6,6,8,8,7,11,12,11,9,9};
	   HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	   ArrayList<Integer> al=new ArrayList<Integer>();

	   for(int  i=0;i<a.length;i++)
	   {
	     if(map.containsKey(a[i]))
	       map.put(a[i],map.get(a[i])+1);
	     else
	       map.put(a[i],1);
	   }
	  for(Integer i:map.keySet())
	   {
	     if(map.get(i)>=2)
	        al.add(i);
	   }
	  Collections.reverse(al);
//	  for(int i=0;i<al.size();i++)
//	  {
//		  System.out.println(al.get(i));
//	  }
	  System.out.println(al.get(0)+" "+al.get(1));
	
	  }

}
