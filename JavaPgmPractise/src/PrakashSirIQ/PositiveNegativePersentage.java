package PrakashSirIQ;

public class PositiveNegativePersentage {
	public static void main(String[] args) {
		int[] a= {10,30,4,-9,-1,0,4,-6};
		int pcount=0;
		int ncount=0;
		int tcount=a.length;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
			{
				pcount++;
			}
			else if(a[i]<0)
			{
				ncount++;
			}
		}
		float pper=((pcount*100)/tcount);
		float nper=((ncount*100)/tcount);
		System.out.println(tcount);
		System.out.println(pcount);
		System.out.println(ncount);
		System.out.println(pper);
		System.out.println(nper);
	}

}
