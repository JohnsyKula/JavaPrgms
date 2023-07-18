package StringTopic;

public class IamSelenium {
	  public static void main(String[] args)
	   {
	     String s="i am selenium";
	     String rev="";
	     for(int i=0;i<s.length();i++)
	     {
	       char ch=s.charAt(i);
	       if(ch!=' ')
	        {
	          rev=ch+rev;
	        }
	      }
	     System.out.println(rev);
	    for(int i=0;i<s.length();i++)
	     {
	        char ch=s.charAt(i);
	        if(ch==' ')
	          {
	            rev=rev.substring(0,i)+" "+rev.substring(i,rev.length());
	          }
	     }
	    System.out.println(rev);
	   }

}
