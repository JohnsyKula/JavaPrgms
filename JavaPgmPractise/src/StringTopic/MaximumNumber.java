package StringTopic;

public class MaximumNumber {

	public static void main(String[] args) {
	int[] a= {5,7,1,9,4,2};
	int fmax=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>fmax)
		{
			int temp=fmax;
			fmax=a[i];
			a[i]=temp;
		}
	}
    System.out.println(fmax);
	}

}
