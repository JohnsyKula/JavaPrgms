package PrakashSirIQ;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

//input--->Hello world
//output-->Hel1o w2r3d
//repeated character we should change as integer in increamentel order

public class MyInterview {
//	public static void main(String[] args) {
//		String s="Hello world";
//		HashSet<Character> set=new HashSet<>();
//		char ch[]=s.toCharArray();
//		char count='1';
//		for(int i=0;i<ch.length;i++)
//		{
//			if(set.add(ch[i])==false)
//			{
//				ch[i]=count;
//				count++;
//			}
//		}
//		for(int i=0;i<ch.length;i++)
//		{
//			System.out.print(ch[i]);
//		}
//	}
	
	
	//input--->Hello world
	//He121 w2r3d
	public static void main(String[] args) {
		String s="Hello world";
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(map.containsKey(ch[i]))
			{
				map.put(ch[i], map.get(ch[i])+1);
			}
			else
			{
				map.put(ch[i], 1);
			}
		}
       for(int i=0;i<ch.length;i++)
       {
    	   for(Character j:map.keySet())
    	   {
    		   if(ch[i]==j)
    		   {
    			   if(map.get(j)==1)
    			   {
    				   System.out.print(ch[i]);
    			   }
    			   else
    			   {
    				   for(int k=1;k<=map.get(j);k++)
    				   {
    					   System.out.print(k);
    				   }
    			   }
    		   }
    	   }
        }
	
	}
}
