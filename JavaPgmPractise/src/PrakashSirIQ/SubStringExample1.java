package PrakashSirIQ;


//print all possible substrings with length 2
public class SubStringExample1 {
	public static void main(String[] args) {
		String s="india";
		String str="";
		for(int i=0;i<s.length();i++)
		{
				for(int j=i;j<s.length();j++)
				{
					str=s.substring(i,j+1);
					if(str.length()==2)
					{
					System.out.println(str);
					}
				}
		}
	}
	
	
//	//anotherway
//		public static void main(String[] args) {
//			String s="india";
//			int n=2;
//			for(int i=0;i<=s.length()-n;i++)
//			{
//				System.out.println(s.substring(i,i+n));
//			}
		
}
