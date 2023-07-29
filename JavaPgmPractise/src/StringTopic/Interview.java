package StringTopic;

public class Interview {
	 public static void main(String[] args) {
	        String s="Hello world";
	        char[] ch=s.toCharArray();
	      
	        for(int i=0;i<s.length();i++)
	        {
	          int temp=1;
	          for(int j=i+1;j<s.length();j++)
	          {
	              if(ch[i]==ch[j])
	              {
	                  ch[j]=(char) (temp+48);
	                  temp++;
	              }
	          }
	        }
	        for(int i=0;i<ch.length;i++)
	        {
	            System.out.print(ch[i]);
	        }
	    }
}
