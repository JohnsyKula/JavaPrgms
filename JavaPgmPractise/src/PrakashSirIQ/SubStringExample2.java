package PrakashSirIQ;

import java.util.HashSet;

//print all possible substring with length 3 and non duplicate 
public class SubStringExample2 {
	public static void main(String[] args) {
		String s="india";
		String str="";
		HashSet<String> set=new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
				for(int j=i;j<s.length();j++)
				{
					str=s.substring(i,j+1);
					str.length();
					if(str.length()==3)
					{
					   set.add(str);
					}
				}
		}
		for(String i:set)
		{
			System.out.println(i);
		}
	}


}
