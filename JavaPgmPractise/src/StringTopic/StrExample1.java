package StringTopic;

public class StrExample1 {
	 public static void main(String[] args)
	 {
	   String s="abc123bca34as2";
	   char[] ch=s.toCharArray();
	   int sum=0;
	   for(int i=0;i<ch.length;i++)
	   {
	    if(ch[i]>='0' && ch[i]<='9')
	     {
	        sum=sum+(int)(ch[i]-48);
	        
	     }
	    else
	     {
	        while(sum>0)
	         {
	         System.out.print(sum);
	         sum=0;
	         }
	         System.out.print(ch[i]);
	     }
	   }
	   if(sum>0)
	   System.out.println(sum);
	  }
	

}
