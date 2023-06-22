package StringTopic;

public class Printogic {
	  public static void main(String[] args)
	   {
	     String s="aabbaa";
	     int j=1;
	      for(int i=0;i<s.length()-1;i++)
	      {
           System.out.print(s.charAt(i)+""+s.charAt(j)+" ");
           j++;
	      }
	    }

}
