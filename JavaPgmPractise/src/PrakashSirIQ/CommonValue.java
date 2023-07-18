package PrakashSirIQ;

public class CommonValue {
	public static void main(String[] args) {
		String[] s= {"ab","abc","abcd","abddc"};
		int length=s[0].length();
		boolean flag=false;
		for(int i=1;i<s.length;i++)
		{
		  String newStr=s[i].substring(0, length);
		  if(s[0].equals(newStr))
		  {
			  flag=true;
		  }
		}
		if(flag==true)
		{
			System.out.println(s[0]);
		}
	}
	
//	public static void main(String[] args) {
//	String[] s= {"ab","abc","abcd","abdd"};
//	String first=s[0];
//	try {
//		for(int i=0;i<s.length;i++)
//		{
//		  if(first.charAt(i)==s[i+1].charAt(i))
//		  {
//			  System.out.print(first.charAt(i));
//		  }
//		}
//		
//	}
//	catch(StringIndexOutOfBoundsException e)
//	{
//		
//	}
//}

}
