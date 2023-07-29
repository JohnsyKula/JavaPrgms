package StringTopic;

import java.util.TreeSet;

public class Vowcount {
	public static void main(String[] args) {
		String s="welcome to tyy office banglore abc";
		s=s.toLowerCase();
		String[] str=s.split(" ");
		TreeSet<Character> set=new TreeSet<Character>();
		for(int i=0;i<str.length;i++)
		{
			int count=0;
			for(int j=0;j<str[i].length();j++)
			{
				char ch=str[i].charAt(j);
				if(ch=='a' || ch=='e'||ch=='o'||ch=='u'||ch=='i')
				{
					if(set.add(ch)==true)
						count++;
				}
			
			}
			System.out.println(str[i]+" "+count);
			set.clear();
		}
	}

}
