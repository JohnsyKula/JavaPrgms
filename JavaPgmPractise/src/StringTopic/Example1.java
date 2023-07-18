package StringTopic;

import java.util.LinkedHashMap;

public class Example1 {
	public static void main(String[] args)
	{
		String s="ababaaccdd";
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
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
			 
			    System.out.print(map.get(i)+""+i);
		   }
	}

}
