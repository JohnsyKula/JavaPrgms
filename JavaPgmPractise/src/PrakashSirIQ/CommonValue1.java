package PrakashSirIQ;

public class CommonValue1 {

	public static void main(String[] args) {
		String[] s= {"abg","abc","abcd","abdd"};
		boolean flag=false;
			String temp=s[0];
			for(int i=0;i<temp.length();i++)
			{
			for(int j=0;j<s.length-1;j++)
			{
			   String newStr=s[j+1];
			   if (temp.charAt(i)==newStr.charAt(i))
			   {
				   flag=true;
			   }
			   else
			   {
				   flag=false;
			   }
			}
			if(flag==true)
			{
				System.out.print(temp.charAt(i));
				flag=false;
			}
			}
	}

}
