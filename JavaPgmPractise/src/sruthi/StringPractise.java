package sruthi;

public class StringPractise {

   public static void main(String[] args) {
	   
   //way1 to store the string literal
//		String s1="Johnsy";
//		String s2="Johnsy";
//		String s3="johnsy";
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
//		System.out.println(s1==s3);
//		System.out.println(s1.equals(s3));
//		System.out.println(s1.equalsIgnoreCase(s3));
		
		
	//way2 to store the string literal
//		System.out.println();
//		String st1=new String("Johnsy");
//		String st2=new String("Johnsy");
//		String st3=new String("johnsy");
//		System.out.println(st1==st2);
//		System.out.println(st1.equals(st2));
//		System.out.println(st1==st3);
//		System.out.println(st1.equals(st3));
//		System.out.println(st1.equalsIgnoreCase(st3));
		
		
//		String s1="Johnsy";
//		String s2="Kulandesu ";
//		String s3=s1.concat(s2);//J o h n s y K u l a n d e s u
//		System.out.println(s3);
//		System.out.println(s3.length());
//		System.out.println(s3.toUpperCase());
//		System.out.println(s3.toLowerCase());
//		System.out.println(s3.indexOf('v'));
//		System.out.println(s3.indexOf('u',4));
//		System.out.println(s3.lastIndexOf('u'));
//		System.out.println(s3.lastIndexOf('u', 5));
//		System.out.println(s3.charAt(2));
//		System.out.println("After trim "+s3.trim());
//		System.out.println(s3.substring(6));
//		System.out.println(s3.substring(6, 8));
	   
	   String s="My name is Johnsy";
	   String[] s1=s.split(" ");
	   StringBuffer sen=new StringBuffer();
	   for(int i=0;i<s1.length;i++)
	   {
		   StringBuffer sb=new StringBuffer(s1[i]);
		   StringBuffer word=sb.reverse();
		   sen=sen.append(word).append(" ");
	   }
	   System.out.println(sen);

}
    

}
