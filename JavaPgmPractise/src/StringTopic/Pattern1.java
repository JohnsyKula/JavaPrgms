package StringTopic;

public class Pattern1 {
	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=n;i++)
		{
		   for(int k=1;k<=i-1;k++)
		   {
			   System.out.print("--");
		   }
		   for(int j=1;j<=n;j++)
		   {
			   System.out.print("* ");
		   }
		   n--;
		   System.out.println();
		}
		 
	}

}
