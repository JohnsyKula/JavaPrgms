package PrakashSirIQ;

import java.util.LinkedHashMap;

public class OnlyUnique {
	public static void main(String[] args) {
		String s="Kannada";
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
		}
		//To print only unique
		System.out.println("Only Unique character");
		for(char i:map.keySet())
		{
			if(map.get(i)==1)
				System.out.println(i+"->"+map.get(i));
		}
		
		//To print only duplicate
		System.out.println("Only Duplicate character");
		for(char i:map.keySet())
		{
			if(map.get(i)>1)
				System.out.println(i+"->"+map.get(i));
		}
		
		//After removing duplicate
		System.out.println("After removing duplicate");
		for(char i:map.keySet())
		{
				System.out.print(i);
		}
		
		
		
	}

}
