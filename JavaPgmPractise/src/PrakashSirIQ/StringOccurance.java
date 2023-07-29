package PrakashSirIQ;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class StringOccurance {
	public static void main(String[] args) {
		String s="welcome to my world welcome to our nest";
		String[] str=s.split(" ");
		LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
		for(int i=0;i<str.length;i++)
		{
			if(map.containsKey(str[i]))
			{
				map.put(str[i], map.get(str[i])+1);
			}
			else
				map.put(str[i], 1);
		}
		for(String i:map.keySet())
		{
			System.out.println(i+"-->"+map.get(i));
		}
	}

}
