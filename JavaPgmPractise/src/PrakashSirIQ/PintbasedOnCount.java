package PrakashSirIQ;

public class PintbasedOnCount {
public static void main(String[] args) {
	String s="a3a1b2a3c3";
	for(int i=0;i<s.length();i++)
	{
		//char until=s.charAt(i+1);
		//int loop=(int)until;
		//System.out.println(until);
		//int count=0;
		for(int j=1;j<=(s.charAt(i+1)-48);j++)
		{
			char ch=s.charAt(i);
			//count++;
			System.out.print(ch);
		}
		//System.out.println();
		//System.out.println(count);
		i=i+1;
	}
}

}
