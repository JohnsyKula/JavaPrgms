package PrakashSirIQ;

import java.util.LinkedHashMap;

public class StringOccuranceWithoutMap {
	public static void main(String[] args) {
		String s="welcome to my world welcome to our nest";
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
		  int count=1;
          for(int j=i+1;j<str.length;j++)
          {
        	  if(str[i].equals(str[j]))
        	  {
        		  count++;
        		  str[j]="-";
        	  }
        	  
          }
          if(!str[i].equals("-"))
           System.out.println(str[i]+"-->"+count);
		}
	}

}
