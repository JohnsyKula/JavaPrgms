package StringTopic;

import java.util.LinkedHashSet;

public class OccuranceUsingSet {
	public static void main(String[] args)
	{
		String s="success";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		System.out.println(set);
		for(Character lset:set)
		{
		 int count=0;
		 for(int i=0;i<s.length();i++)
		  {
			if(lset.equals(s.charAt(i)))
			{
				count++;
			}
		  }
		 System.out.println(lset+"->"+count);
		}
	 }

	}
