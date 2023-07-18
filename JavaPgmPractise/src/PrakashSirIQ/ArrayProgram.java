package PrakashSirIQ;

import java.util.HashMap;

public class ArrayProgram {
	public static void main(String[] args) {
		int[] a= {7,2,12,5,4,5,15};
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]+a[i+1]==9)
			{
				if(!map.containsKey(a[i]))
				{
					if(!map.containsValue(a[i]))
					{
						map.put(a[i],a[i+1]);
					}
				}
			}
		}
		System.out.println(map);
	
	}

}
