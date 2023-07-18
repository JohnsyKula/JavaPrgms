package PrakashSirIQ;

public class RevStringWithoutLoop {
	public static void main(String[] args) {
		String s="Johnsy";
		int length=s.length();
		revString(s,length);
	}
	public static void revString(String s,int length)
	{
		if(length>0)
		{
		char ch=s.charAt(length-1);
		System.out.print(ch);
		length--;
		revString(s,length);
		}
		
	}

}
