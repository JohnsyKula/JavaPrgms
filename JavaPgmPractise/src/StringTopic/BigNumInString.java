package StringTopic;

public class BigNumInString {
	 public static void main(String[] args)
	 {
	   String s="*ab012dsd$%457";
	   int big=0;
	   String str="";
	   char[] ch=s.toCharArray();
	   for(int i=0;i<ch.length;i++)
	   {
	     if(ch[i]>='0' && ch[i]<='9')
	     {
	       str=str+ch[i];
	     }
	     else
	      {  
	    	 if(str!="")
	    	 {
	          int num=Integer.parseInt(str);
	          if(num>big)
	            {
	             big=num;
	            }
	           str="";
	    	 }
	      }
	    }
	   if(str!="")
  	 {
        int num=Integer.parseInt(str);
        if(num>big)
          {
           big=num;
          }
  	 }
	   System.out.println(big);
	  }

}
