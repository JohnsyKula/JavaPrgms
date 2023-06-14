import java.util.ArrayList;
import java.util.Scanner;

public class Scenario {
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<>(3);
		al.add("s1");
		al.add("s2");
		al.add("s3");
		int j=1;
		while(j<10){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Option");
	    String op = sc.nextLine();
	    al.add(op);
	    al.remove(0);	  
	    for(String i:al)
	    {
	    	System.out.println(i);
	    }
	    j--;
		}
	}

}
