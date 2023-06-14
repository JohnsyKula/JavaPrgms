package StringTopic;

public class practise21 {
	  public static void main(String[] args)
	  {
	    String s="My family is my world";
	    String[] word=s.split(" ");
	    String revSen="";
	    for(int i=0;i<word.length;i++)
	    {
	      String revWord="";
	      for(int j=0;j<word[i].length();j++)
	      {
	        char ch=word[i].charAt(j);
	        revWord=revWord+ch;
	      }
	    revSen=revWord+" "+revSen;
	    }
	    System.out.println(revSen);
	  }

}
