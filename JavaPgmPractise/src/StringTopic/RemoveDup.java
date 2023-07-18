package StringTopic;

import java.util.HashMap;

public class RemoveDup {
	 public static void main(String[] args)
	 {
	   String s="Kannada";
	   HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	   int count=0;
	   for(int i=0;i<s.length();i++)
	   {
	     char ch=s.charAt(i);
	     if(map.containsKey(ch))
	    	 map.put(ch,map.get(ch)+1);
	     else
	    	 map.put(ch,1);
	   }
	   for(Character i:map.keySet())
	   {
		   if(map.get(i)>1)
		    System.out.println(i+"->"+map.get(i));
	   }
	 }

}
