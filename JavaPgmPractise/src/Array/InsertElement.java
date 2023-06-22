package Array;

public class InsertElement {
	 public static void main(String[] args)
	 {
	   int[] a={10,12,14,16,18};
	   int in=2,ele=13;
	   int[] temp=new int[a.length+1];
	   temp[in]=ele;
	   for(int i=0;i<a.length;i++)
	    {
	      if(i<in)
	        temp[i]=a[i];
	      else 
	        temp[i+1]=a[i];
	    }
	   for(int i=0;i<temp.length;i++)
	    {
	      System.out.print(temp[i]);
	    }
	 }

}
