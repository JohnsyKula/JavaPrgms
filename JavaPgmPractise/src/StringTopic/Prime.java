package StringTopic;

public class Prime {
	  public static void main(String[] args)
	   {
	     int primecount=0;
	     System.out.println("Prime numbers between 1 to 100");
	     for(int n=1;n<=100;n++)
	     {
	      int count=0;
	      for(int i=1;i<=n;i++)
	       {
	           if(n%i==0)
	              count++;
	       }
	       if(count==2)
	         {
	            primecount++;
	            System.out.print(n+" ");
	         }
	      }
	     System.out.println();
	     System.out.println("Total count of prime numbers are");
	     System.out.println(primecount);
	   }

}
