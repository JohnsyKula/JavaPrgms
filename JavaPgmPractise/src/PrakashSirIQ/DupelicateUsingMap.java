package PrakashSirIQ;

import java.util.HashMap;

public class DupelicateUsingMap {
	public static void main(String[] args) {
		String s="Kannada";
		HashMap<Character, Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			
			else
				map.put(ch, 1);
		}
		for(Character i:map.keySet())
		{
			Integer count = map.get(i);
			if(count>1)
			{
				System.out.println(i+""+count);
			}
		}
	}

}
