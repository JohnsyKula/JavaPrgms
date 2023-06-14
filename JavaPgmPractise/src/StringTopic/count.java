package StringTopic;

import java.util.HashMap;
import java.util.Map.Entry;

public class count {
	 public static void main(String[] args)
	  {
	   String s="Johnsy Johnsy Johnsy Rani";
	   String[] word=s.split(" ");
	   HashMap<String,Integer> map=new HashMap<String,Integer>();   
	   for(String i:word)
	   {
	     if(map.containsKey(i))
	        map.put(i,map.get(i)+1);
	     else
	        map.put(i,1);
	    }
	   for(String e:map.keySet())
	    {
	       System.out.println(e+"--->"+map.get(e));
	    }
	   }

}
