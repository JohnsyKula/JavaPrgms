package StringTopic;

import java.util.ArrayList;

public class SmallNumString {
	public static void main(String[] args)
	{
		String s="*ab012dsd$%457";
		char[] ch=s.toCharArray();
		String str="";
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=0 && ch[i]<=9)
			{
				if(i==ch.length-1)
				{
					list.add(str);
				}
				str=str+ch[i];
			}
			else
			{
				if(str!="")
				{
					list.add(str);
				}
			}
		}
	    int smal=Integer.parseInt(list.get(0));
		for(int i=0;i<list.size();i++)
		{
			String value = list.get(i);
			int num = Integer.parseInt(value);
			if(num<smal)
			{
				smal=num;
			}
				
		}
	}

}
