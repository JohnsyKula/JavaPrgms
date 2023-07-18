package PrakashSirIQ;

public class OccuranceCount {
	public static void main(String[] args) {
		String s="aabbaabbababb";
		int count=1;
		int j=1;
		for(int i=0;i<s.length();i++)
		{
	      if(i!=s.length()-1)
		  {
			if(s.charAt(i)==s.charAt(j))
			{
				count++;
				j++;
			}
			else {
				System.out.print(s.charAt(i)+""+count);
				count=1;
				j++;
			}
		   }
		  else
			System.out.print(s.charAt(i)+""+count);
			
		}
	}

}
