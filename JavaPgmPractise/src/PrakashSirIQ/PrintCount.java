package PrakashSirIQ;

public class PrintCount {
	public static void main(String[] args) {
		String s1="javajavaseleniumjavapython";
		String s2="java";
		int length=s2.length();
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(0))
			{
			   String str=s1.substring(i,i+length);
			   if(s2.equals(str))
			   {
				   count++;
			   }
			}
		}
		System.out.println(s2+" is present in "+count+" times");	
	}
}
