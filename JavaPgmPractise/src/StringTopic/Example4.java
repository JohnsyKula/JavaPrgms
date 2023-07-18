package StringTopic;

public class Example4 {

	public static void main(String[] args)
	{
		String s="[{()}]";
		char[] ch=s.toCharArray();
		if(ch.length%2==0)
		{
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]=='[')
			{
			
			}
			if(ch[i]=='[' && ch[ch.length-1]==']'  ||ch[i]=='(' && ch[ch.length-1]==')'||ch[i]=='{' && ch[ch.length-1]=='}')
			{
			    System.out.println("balanced");
			    break;
					
			}
		
			else
			{
				System.out.println("Not Balanced");
				break;
			}
		}
		}
		else
		{
			System.out.println("Not balanced");
		}
	}

}
