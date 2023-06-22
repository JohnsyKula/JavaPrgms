package StringTopic;

import java.util.LinkedHashSet;

public class Seperate {
	public static void main(String[] args)
	{
		String s="John47sy58susai72@!@^4";
		LinkedHashSet<Character> num=new LinkedHashSet<>();
		LinkedHashSet<Character> alpha=new LinkedHashSet<>();
		LinkedHashSet<Character> special=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
				alpha.add(ch);
			else if(ch>='0' && ch<='9')
				 num.add(ch);
			else
				special.add(ch);
		}
		for(Character i:num)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(Character i:alpha)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(Character i:special)
		{
			System.out.print(i+" ");
		}
	}

}
