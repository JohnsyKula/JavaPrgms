package StringTopic;

public class RevSentense {

	public static void main(String[] args) {
	String s="My name is Johnsy";
	String word="",sen="";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=' ')
		{
			word=word+s.charAt(i);
		}
		else {
		sen=word+" "+sen;
		word="";
	   
		}
	}
	 System.out.print(word+" "+sen);
	}
}
