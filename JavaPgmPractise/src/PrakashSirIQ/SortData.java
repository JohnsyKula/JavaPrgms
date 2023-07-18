package PrakashSirIQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class SortData {
	public static void main(String[] args) {
		String s="ABABABABA";
		ArrayList<Character> list=new ArrayList<Character>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			list.add(ch);
		}
	 //Collections.sort(list,Collections.reverseOrder());
		
		Collections.sort(list);
		Collections.reverse(list);
	 for(char i:list)
	 {
		 System.out.print(i);
	 }
	
	}

}
