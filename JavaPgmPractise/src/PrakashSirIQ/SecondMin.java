package PrakashSirIQ;

public class SecondMin {
	public static void main(String[] args) {
		int[] a= {10,5,3,2,1,5};
		int fmin=a[0];
		int smin=a[1];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<fmin)
			{
				smin=fmin;
				fmin=a[i];
			}
			else if(a[i]<smin && a[i]>fmin)
			{
				smin=a[i];
			}
		}
		System.out.println(smin);			
	}

}
