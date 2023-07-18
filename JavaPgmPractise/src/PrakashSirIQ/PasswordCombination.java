package PrakashSirIQ;

import java.util.Random;

public class PasswordCombination {
	public static void main(String[] args) {
		Random ran=new Random();
		String s="nila";
	
	    
		for(int i=0;i<10;i++)
		{
			char capasci = (char)(65+i);
			char smallAsci=(char)(97+i);
			char specialAsci=(char)(33+i);
			
		    System.out.println(capasci+""+smallAsci+""+specialAsci+ran.nextInt(30)+""+s);
		}
	}

}
