package StringTopic;

public class StringTopic {
	public static void main(String[] args) {
		String s="welcome to tyy office banglore abc";
		String[] str=s.split(" ");
		String rev="";
		for(int i=0;i<str.length;i++)
		{
			if(i%2==1)
			{
				for(int j=0;j<str[i].length();j++)
				{
					rev=str[i].charAt(j)+rev;
				}
				System.out.print(rev+" ");
				rev="";
			}
			else
			{
				System.out.print(str[i]+" ");
			}
		}
	}

}
