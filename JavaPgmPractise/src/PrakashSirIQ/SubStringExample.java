package PrakashSirIQ;


//print all possible substrings
public class SubStringExample {
	public static void main(String[] args) {
		String s="india";
		for(int i=0;i<s.length();i++)
		{
				for(int j=i;j<s.length();j++)
				{
					System.out.println(s.substring(i,j+1));
				}
		}
	}

}
