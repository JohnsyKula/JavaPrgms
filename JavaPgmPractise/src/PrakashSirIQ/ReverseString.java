package PrakashSirIQ;

public class ReverseString {
	public static void main(String[] args) {
		String s="my name is raja";
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
			  rev=s.charAt(i)+rev;
			}	
		}
        for(int i=0;i<s.length();i++)
        {
        	if(s.charAt(i)==' ')
        	{
        		rev=rev.substring(0, i)+" "+rev.substring(i,rev.length());
        	}
        }
        System.out.println(rev);
	}

}
