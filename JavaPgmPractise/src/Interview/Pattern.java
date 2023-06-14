package Interview;

public class Pattern 
{
	public static void main(String [] args)
	{
		int num=1;
		for(int a=1;a<=3;a++)
		{
		for(int i=3;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=3;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		}
	}

}
