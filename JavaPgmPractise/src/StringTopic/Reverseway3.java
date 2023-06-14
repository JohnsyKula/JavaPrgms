package StringTopic;

public class Reverseway3 {
	  public String revString(String s)
	   {
	     if(s==null||s.length()<=1)
	       {
	         return s;
	       }
	      return revString(s.substring(1))+s.charAt(0);
	    }
	 public static void main(String[] args)
	  {
	      String s="Johnsy";
	      Reverseway3 r=new Reverseway3();
	      System.out.println(r.revString(s));
	  }

}
