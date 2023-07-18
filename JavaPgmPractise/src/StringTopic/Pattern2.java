package StringTopic;

public class Pattern2 {
	
	public static void main(String[] args) {
		int n=3;
	for(int i=1;i<=n;i++)
	{
	   for(int k=1;k<=i-1;k++)
	   {
		   System.out.print("  ");
	   }
	   for(int j=n;j>=i;j--)
	   {
		   System.out.print("* ");
	   }
	   System.out.println();
	}
	}

}
