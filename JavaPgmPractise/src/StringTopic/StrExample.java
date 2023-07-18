package StringTopic;

public class StrExample {

	public static void main(String[] args) {
		String s="hi hello welcome";
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
				rev=ch+rev;
		}
     for(int i=0;i<s.length();i++)
     {
    	char ch=s.charAt(i);
    	if(ch==' ')
    	{
    	   rev=rev.substring(0, i)+' '+rev.substring(i, rev.length());	
    	}
    		
     }
     System.out.println(rev);
	}

}
